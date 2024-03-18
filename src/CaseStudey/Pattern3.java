package CaseStudey;

import java.util.Scanner;

public class Pattern3 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println();
        String name = sc.nextLine().toUpperCase(); 
        
        int length = name.length();

        
        for (int i = length; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }
    }

	
	}

 