import java.io.*;
import java.util.*;
import java.util.Scanner;

class choice {

    public static void main(String[] args) {
        int opt, sub, add, mul;
        double div;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int m = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int n = sc.nextInt();

        while (true) {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
            opt = sc.nextInt();
            switch (opt) {
                case 1 -> {
                    add = m + n;
                    System.out.println("Addition Result:" + add);
                }
                case 2 -> {
                    sub = m - n;
                    System.out.println("Subtraction Result:" + sub);
                }
                case 3 -> {
                    mul = m * n;
                    System.out.println("Multiplication Result:" + mul);
                }
                case 4 -> {
                    div = (double) m / n;
                    System.out.println("Division Result:" + div);
                }
                case 5 -> System.exit(0);
            }
        }
    }
}
