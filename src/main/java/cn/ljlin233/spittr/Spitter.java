package cn.ljlin233.spittr;

import org.springframework.context.annotation.Bean;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;

import lombok.*;
import cn.ljlin233.spittr.data.*;

/**
 * Spitter
 */
@Setter
@Getter
@Component
public class Spitter implements SpitterRepository {

    private Long id;

    @NotNull
    @Size(min = 5, max = 16)
    private String username;

    @NotNull
    @Size(min = 2, max = 30)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 30)
    private String lastName;

    @NotNull
    @Size(min=5, max=25)
    private String password;

    public Spitter() {
        this.username = "test_jiangzemin";
        this.firstName = "test_jiang";
        this.lastName = "test_zemin";
    }

    public Spitter(String username, String password, String firstName, String lastName) {
        this(null, username, password, firstName, lastName);
    }

    public Spitter(Long id, String username, String password, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object that) {
      return EqualsBuilder.reflectionEquals(this, that, "firstName", "lastName", "username", "password");
    }
    
    @Override
    public int hashCode() {
      return HashCodeBuilder.reflectionHashCode(this, "firstName", "lastName", "username", "password");
    }

    @Override
    public Spitter save(Spitter spitter) {
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        Spitter spitter = new Spitter();
        return spitter;
    }

}