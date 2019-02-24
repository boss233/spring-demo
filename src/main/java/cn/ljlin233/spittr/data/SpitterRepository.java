package cn.ljlin233.spittr.data;

import cn.ljlin233.spittr.Spitter;


public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);

}