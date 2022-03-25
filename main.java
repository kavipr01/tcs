import java.util.*;
import java.util.Scanner;
import java.io.*;

public class Tcs0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        int [] e = new int[n];
        int [] l = new int[n];

        for (int i=0;i<n;i++)
        {
            e[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            l[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            int tp=e[i]-l[i];
            sum+=tp;
            if (max<sum)
            {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
