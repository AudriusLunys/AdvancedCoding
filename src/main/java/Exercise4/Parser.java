package Exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Parser {

    public static void collectBuyerInfo(Scanner scanner) {


        Person buyer = new Person();
        System.out.println("Please enter first name");
        buyer.setFirstName(scanner.nextLine());
        System.out.println("Please enter last name ");
        buyer.setLastName(scanner.nextLine());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Please enter date of birth .Example: 1900-01-01");
        System.out.print("Enter date: ");
        String str = scanner.nextLine();

        try {
            Date date = sdf.parse(str);

            System.out.println("Date: " + date);
            buyer.setDateOfBirth(date);
        } catch (ParseException e) {
            System.out.println("Parse Exception");
        }

        System.out.println(buyer);
    }
}
