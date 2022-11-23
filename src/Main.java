import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String date;
        Scanner in = new Scanner(System.in);
        date = in.nextLine();
        DateValidation dateValidation = new DateValidation();
        System.out.println(dateValidation.monthDateValidation(date));
    }
}
