package lesson.ts005.service;

import lesson.ts005.entity.User;

public interface DataService {

     void create(User user);
     User read(Integer id);
}
