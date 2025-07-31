import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        calculateMultiples(n);
    }

    public static void calculateMultiples(int n) {
        int i = 10 * n;
        while(i >= 1) {
            System.out.print(i+" ");
            i -= n;
        }
    }
}
