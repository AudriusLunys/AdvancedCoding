package Exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        collectBuyerInfo(scanner);


    }


    private static void collectBuyerInfo(Scanner scanner) {


        Person buyer = new Person();
        buyer.setFirstName(scanner.nextLine());
        buyer.setLastName(scanner.nextLine());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Example: 1900-01-01");
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
