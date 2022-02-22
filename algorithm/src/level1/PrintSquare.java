package level1;

import java.util.Scanner;

public class PrintSquare {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //가로
        int y = sc.nextInt(); //세로
        for(int i=0; i<y; i++) {
        	System.out.println("*".repeat(x));
        }
        sc.close();
    }
}