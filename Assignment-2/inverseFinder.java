import java.util.*;
import java.lang.Math;
public class inverseFinder {
    public static int digitCount (int n){
        int count = 0;
        while (n != 0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static int position (int n, int x){
        int count = 0;
        while (n != 0){
            if ((n % 10) == x){
                count++;
                break;
            }
            else{
                n /= 10;
            }
        }
        return (digitCount(n) - count + 1);
    }
    public static void main(String[] args){
        int num, n, res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer:\t");
        num = sc.nextInt();
        n = digitCount(num);
        for (int i = 1; i <= n; i++){
            int j = position(num, i);
            res += (j * Math.pow(10, n - i));
        }
        System.out.print("Required inverse integer:\t" + res);
        sc.close();
    }
}
