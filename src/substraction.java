import java.util.Scanner;

class substraction {
    public static void main(String[] args) {
        float number1 = 10;
        float number2 = 30;
        float result;

        result = number1 - number2;
        System.out.println("Inline :- " + result);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        float sc_number_1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Number 2 :");
        float sc_number_2 = Integer.parseInt(sc.nextLine());

        float sc_result = sc_number_1 - sc_number_2;

        System.out.println("Using Scanner :- " + sc_result);


    }
}