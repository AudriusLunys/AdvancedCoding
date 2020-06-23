package SDAShadulerClassExample.Repositories;

import SDAShadulerClassExample.Exceptions.MaximumNumberOfStudentsReached;
import SDAShadulerClassExample.Model.Group;
import SDAShadulerClassExample.Model.Student;
import SDAShadulerClassExample.Model.Trainer;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// to store all courses, students, trainers
public class CentralRepository {

    private static int NUMBER_OF_STUDENTS = 15;
    private static int NUMBER_OF_TRAINERS = 3;
    private static int NUMBER_OF_GROUPS = 4;

    private static List<Student> studentList = new ArrayList<>();
    private static List<Trainer> trainerList = new ArrayList<>();
    private static List<Group> groupList = new ArrayList<>();

    static {
        for (int i = 1; i <= NUMBER_OF_STUDENTS; i++) {
          Student student = new Student();

          student.setFirstName(RandomStringUtils.random(7,true,false).toLowerCase());
          student.setLastname(RandomStringUtils.random(5,true,false).toLowerCase());
          student.setDateOfBirth(generateRandomDate(1980,2000));
          student.setHasPreviousJavaKnowledge(new Random().nextBoolean());
          studentList.add(student);
        }
        for (int i =1; i<=NUMBER_OF_TRAINERS;i++){
            Trainer trainer = new Trainer();
            trainer.setFirstName(RandomStringUtils.random(7,true,false).toLowerCase());
            trainer.setLastname(RandomStringUtils.random(5,true,false).toLowerCase());
            trainer.setDateOfBirth(generateRandomDate(1980,2000));
            trainer.setAuthorised(new Random().nextBoolean());
            trainerList.add(trainer);

        }
        for (int i = 1; i<=NUMBER_OF_GROUPS; i++) {
            Group group = new Group();
            group.setName("group_" + i);
            Trainer trainer = trainerList.get(getRandomIntBetween(0,2));
            group.setTrainer(trainer);
            groupList.add(group);
        }

        try {
            groupList.get(0).addStudent(studentList.get(0));
            groupList.get(0).addStudent(studentList.get(1));
            groupList.get(0).addStudent(studentList.get(2));
            groupList.get(0).addStudent(studentList.get(3));

            groupList.get(1).addStudent(studentList.get(4));
            groupList.get(1).addStudent(studentList.get(5));
            groupList.get(1).addStudent(studentList.get(6));

            groupList.get(2).addStudent(studentList.get(7));
            groupList.get(2).addStudent(studentList.get(8));
            groupList.get(2).addStudent(studentList.get(9));
            groupList.get(2).addStudent(studentList.get(10));
            groupList.get(2).addStudent(studentList.get(11));

            groupList.get(3).addStudent(studentList.get(12));
            groupList.get(3).addStudent(studentList.get(13));
            groupList.get(3).addStudent(studentList.get(14));








        } catch (MaximumNumberOfStudentsReached maximumNumberOfStudentsReached) {
            maximumNumberOfStudentsReached.printStackTrace();
        }





    }
    private static int getRandomIntBetween(int start, int end) {
        return (int) (start + Math.round(Math.random() * (end - start)));
    }
    private static LocalDate generateRandomDate(int startYear, int endYear) {
        int day = getRandomIntBetween(1,30);
        int month =getRandomIntBetween(1,12);
        int year = getRandomIntBetween(startYear,endYear);
        return LocalDate.of(year, month,day);
    }

    public static int getNumberOfStudents() {
        return NUMBER_OF_STUDENTS;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static List<Trainer> getTrainerList() {
        return trainerList;
    }

    public static List<Group> getGroupList() {
        return groupList;
    }
}
