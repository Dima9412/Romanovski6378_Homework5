package main;

import controller.Controller;
import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Teacher teacher = new Teacher("T1", "Konstantin Viktorovich");
        Student student1 = new Student("S1", "Dmitry");
        Student student2 = new Student("S2", "Maria");

        
        Controller controller = new Controller();

        
        StudyGroup studyGroup = controller.createStudyGroup(teacher, Arrays.asList(student1, student2));

        
        System.out.println(studyGroup);
    }
