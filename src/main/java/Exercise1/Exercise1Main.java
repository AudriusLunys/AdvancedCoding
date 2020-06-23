package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1Main {
    public static void main(String[] args) {
        JavaDeveloper person = new JavaDeveloper("Audrius", "Lunys", "androidApps", 1.8);
        JavaDeveloper person2 = new JavaDeveloper("Vacys", "Pavarde", "databases", 1.6);
        PhpDeveloper person3 = new PhpDeveloper("Jonas", "Pavardenis", "phpThings");

        List<Developer> developers = new ArrayList<>();
        developers.add(person);
        developers.add(person2);
        developers.add(person3);

        for (Developer developer : developers) {
            System.out.println(developer.getName() + " " + developer.getSurname() + " " + developer.getDepartment());
        }


    }
}
