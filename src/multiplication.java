import java.util.*;

class multiplication{
    public static void main(String[] args) {
        int mul1 = 6;
        int mul2  = 4;
        int res;
        res = mul1*mul2;
        System.out.println("Inline : "+res);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1 :");
        int sc_num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Num 2 :");
        int sc_num2 = Integer.parseInt(sc.nextLine());

        int sc_res = sc_num1 * sc_num2;
        System.out.println("SC : "+sc_res);

    }
}