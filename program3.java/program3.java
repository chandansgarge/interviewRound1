import java.util.*;

class oddNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i;

        System.out.println("output = ");

        if (n == 2) {
            System.out.println(1);
            } 
        else {
            for(i = 1; i <= 2 * n; i++) {
                if(i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
