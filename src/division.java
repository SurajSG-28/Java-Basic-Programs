import java.util.Scanner;

class division {
    public static void main(String[] args) {
        float div1 = 12.5F;
        float div2  = 4;
        float res;
        res = div1/div2;
        System.out.println("Inline : "+res);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1 :");
        float sc_num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Num 2 :");
        float sc_num2 = Integer.parseInt(sc.nextLine());

        float sc_res = sc_num1 / sc_num2;
        System.out.println("SC : "+sc_res);

    }
}