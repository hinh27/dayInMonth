import java.util.Scanner;

public class daTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String day;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = ("The month" + month + "has 31 days!");
                break;
            case 2:
                day = ("The month'2'has 28 or 29 days!");
                break;
            case 4:
            case 6:
            case 11:
                day = ("The month " + month + " has 30 days!");
                break;
            default:
                day = ("Not  month of the year!");
        }

        if (day != "") System.out.printf("The month '%d' has %s", month, day);
        else System.out.print("Invalid input!");
    }
}

