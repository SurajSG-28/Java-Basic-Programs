import java.util.*;

class add {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 30;
        int result;

        result = number1 + number2;
        System.out.println("Inline :- " + result);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int sc_number_1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Number 2");
        int sc_number_2 = Integer.parseInt(sc.nextLine());

        int sc_result = sc_number_1 + sc_number_2;

        System.out.println("Using Scanner :- " + sc_result);


    }
}