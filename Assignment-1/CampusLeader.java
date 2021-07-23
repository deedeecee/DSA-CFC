import java.util.*;
public class CampusLeader {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credits:\t");
        int a = sc.nextInt();
        if (a < 4500){
            System.out.println("Rising Star");
        }
        else if (a < 6000){
            System.out.println("Mega Leader");
        }
        else if (a < 7500){
            System.out.println("Gega Leader");
        }
        else{
            System.out.println("Tera Leader");
        }
        sc.close();
    }
}
