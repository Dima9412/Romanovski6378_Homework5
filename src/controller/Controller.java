package controller;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.StudyGroupService;

import java.util.List;

public class Controller {

    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        
        System.out.println("Creating study group with teacher ID: " + teacher.getId());

        for (Student student : students) {
            System.out.println("Student ID: " + student.getId());
        }

        
        return studyGroupService.createStudyGroup(teacher, students);
    }
}
