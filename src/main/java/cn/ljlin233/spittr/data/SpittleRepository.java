package cn.ljlin233.spittr.data;

import cn.ljlin233.spittr.Spittle;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
/**
 * SpittleRepository
 */

public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);
}