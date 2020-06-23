package SDAShadulerClassExample.Main;

import SDAShadulerClassExample.services.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService.displayAllGroups();
        StudentService.displayStudentsAlphabetically();
        StudentService.displayGroupWithMaxStudents();
        StudentService.displayStudentsWithJavaKnowledge();
        StudentService.displayStudentsYoungerThan25();
        StudentService.displayStudentsByTrainer();
    }
}
