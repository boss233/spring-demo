package cn.ljlin233.spittr;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.*;
import cn.ljlin233.spittr.data.*;


/**
 * Spittle
 */
@Component
public class Spittle implements SpittleRepository {

    @Getter
    private final Long id;
    @Getter
    private final String message;
    @Getter
    private final Date time;
    @Getter
    private Double latitude;
    @Getter
    private Double longitude;


    public Spittle(String message, Date time, Double longitude, Double latitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }

    public Spittle() {
        this(null, null, null, null);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i=0; i < count; i++) {
          spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }

}
