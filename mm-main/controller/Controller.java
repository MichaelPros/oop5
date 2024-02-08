package lesson.ts005.controller;

import lesson.ts005.entity.Student;
import lesson.ts005.entity.Teacher;
import lesson.ts005.service.UserService;
import lesson.ts005.view.View;

public class Controller {
    private UserService service;
    private View view;

    public Controller() {
        service = new UserService();
        view = new View();
    }

    public void run(){
        Student student1 = new Student("01.01.1999", "Ivan Ivan Ivan", 1);
        Teacher teacher1 = new Teacher("01.01.1988", "Ivan Ivan Vladimir", 1);
        service.create(student1);
        service.create(teacher1);
        Student result = (Student) service.read(1);
        view.print(result);


    }

}
