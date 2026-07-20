import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LibraryDueDateSystem {

    public static void main(String[] args) {

        LocalDate borrowDate = LocalDate.now();
        LocalDate dueDate = borrowDate.plusDays(14);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Library Due Date System");
        System.out.println("-----------------------");
        System.out.println("Borrow Date: " + borrowDate.format(formatter));
        System.out.println("Due Date   : " + dueDate.format(formatter));
    }
}
