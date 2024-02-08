package lesson.ts005.service;

import lesson.ts005.entity.Student;
import lesson.ts005.entity.Teacher;
import lesson.ts005.entity.User;

import java.util.ArrayList;
import java.util.List;


public class UserService implements DataService {
    private final List<User> userList = new ArrayList<>();
    @Override
    public void create(User user) {

        int countStudent = 0;
        int countTeacher = 0;
        for (User elem : userList) {
            if (elem instanceof Student){
                countStudent++;
            }
            else{
                countTeacher++;
            }
        }
        if (user instanceof Student){
            ((Student) user).setStudentId(countStudent+1);

        }
        if (user instanceof Teacher){
            ((Teacher) user).setTeacherId(countTeacher+1);

        }

        userList.add(user);

    }

    @Override
    public User read(Integer id) {
        for (User user : userList) {
            if(user instanceof Student && ((Student) user).getStudentId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
