import java.util.*;
public class mathOperations {
    public static void main(String args[]){
        int n1, n2;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        n2 = sc.nextInt();
        System.out.print("Enter ch: ");
        ch = sc.next().charAt(0);
        switch (ch){
            case '*' :  System.out.println(n1 * n2);
                        break;
            case '/' :  System.out.println((float)(n1) / n2);
                        break;
            case '%' :  System.out.println(n1 % n2);
                        break;
            case '+' :  System.out.println(n1 + n2);
                        break;
            case '-' :  System.out.println(n1 - n2);
                        break;
        }
        sc.close();
    }
}
