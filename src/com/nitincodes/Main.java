package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java program to find the power of a number:
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c;
        c = Math.pow(a,b);
        System.out.println(+a+" to the power "+b+ " is " +c);




    }
}
