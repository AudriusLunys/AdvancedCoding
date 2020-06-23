package SDAShadulerClassExample.services;

import SDAShadulerClassExample.Model.Group;
import SDAShadulerClassExample.Model.Student;
import SDAShadulerClassExample.Model.Trainer;
import SDAShadulerClassExample.Repositories.CentralRepository;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class StudentService {
    public static void displayAllGroups(){
        System.out.println("<------------List of all groups--------->");
        for (Group group : CentralRepository.getGroupList()) {
            System.out.println(group);
        }
    }
    public static void displayStudentsAlphabetically(){
        System.out.println("<---------List of students in alphabetical order----->");
        for (Group group : CentralRepository.getGroupList()) {
            System.out.println(group.getName() + "----------");
            List<Student> students = new ArrayList<>(group.getStudentList());
            Collections.sort(students);
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    public static void displayGroupWithMaxStudents() {
        System.out.println("Group with highest number of students");
        //initially considered as biggest group
        Group groupWithMaxStudents = CentralRepository.getGroupList().get(0);
        for (Group group : CentralRepository.getGroupList()) {
            if(group.getStudentList().size() > groupWithMaxStudents.getStudentList().size()) {
                groupWithMaxStudents = group;
            }
        }
        System.out.println("Group with max students is " + groupWithMaxStudents.getName());
        System.out.println("It has " + groupWithMaxStudents.getStudentList().size() + " students");
    }
    public static void displayStudentsYoungerThan25() {
        System.out.println("Students younger than 25 from all groups");
        for (Group group : CentralRepository.getGroupList()) {
            compareStudentAge(group);
        }
    }
    private static void compareStudentAge(Group group) {
        for (Student student : group.getStudentList()) {
            if(Period.between(student.getDateOfBirth(), LocalDate.now()).getYears() < 25) {
                System.out.println(student);
            }
        }
    }

    public static void displayStudentsWithJavaKnowledge() {
        System.out.println("Students with JAVA knowledge");
        for (Student student : CentralRepository.getStudentList()) {
            if(student.isHasPreviousJavaKnowledge()) {
                System.out.println(student);
            }
        }
    }

    public static void displayStudentsByTrainer (){
        System.out.println("students grouped by trainer");

        Map<Trainer,List<Student>> mapOfTrainerAndStudents =new HashMap<>();
        for (Group group : CentralRepository.getGroupList()) {
            List<Student> studentsOfTrainer = mapOfTrainerAndStudents.get(group.getTrainer());
            if(studentsOfTrainer==null){
                studentsOfTrainer=new ArrayList<>(group.getStudentList());
                mapOfTrainerAndStudents.put(group.getTrainer(),studentsOfTrainer);
            }else {
                studentsOfTrainer.addAll(new ArrayList<>(group.getStudentList()));
            }

        }
        for (Map.Entry<Trainer, List<Student>> trainerListEntry : mapOfTrainerAndStudents.entrySet()) {
            System.out.println(trainerListEntry.getKey());
            System.out.println(trainerListEntry.getValue().size());
            System.out.println(trainerListEntry.getValue());


        }
    }
}
