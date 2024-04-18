package SelfStudy;

import java.util.Scanner;

public class Self0418 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c[] = new int[a];
            for(int i=0; i<a; i++)
            {
                c[i]=sc.nextInt();
            }
            for(int j=0; j<a; j++)
            {
                if(c[j]<b)
                {
                    System.out.printf(c[j]+" ");
                }
            }
            sc.close();
        }
    }

