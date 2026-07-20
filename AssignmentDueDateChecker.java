import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AssignmentDueDateChecker {

    public static void main(String[] args) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter assignment due date (dd/MM/yyyy): ");
            String dueDateText = input.nextLine();

            try {
                LocalDate dueDate =
                        LocalDate.parse(dueDateText, formatter);

                LocalDate today = LocalDate.now();

                System.out.println();
                System.out.println("Due Date Report");
                System.out.println("---------------");
                System.out.println("Today   : " + today.format(formatter));
                System.out.println("Due Date: " + dueDate.format(formatter));

                if (dueDate.isBefore(today)) {
                    System.out.println("Status  : Overdue");
                } else if (dueDate.isEqual(today)) {
                    System.out.println("Status  : Due today");
                } else {
                    System.out.println("Status  : Upcoming");
                }

            } catch (DateTimeParseException e) {
                System.out.println(
                        "Invalid date. Please use the dd/MM/yyyy format.");
            }
        }
    }
}