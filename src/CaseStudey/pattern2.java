package CaseStudey;

import java.util.Scanner;

public class pattern2 {
	
	public static void main(String args[]) {
        int rows, i, j;
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = rows - 1; i >= 1; i--) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
