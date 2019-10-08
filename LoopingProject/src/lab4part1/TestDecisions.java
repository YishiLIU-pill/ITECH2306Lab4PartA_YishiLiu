package lab4part1;
import java.util.Scanner;

public class TestDecisions {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		System.out.println("please enter three integer values:\n");
		System.out.print("a=");
		int a = myScan.nextInt();
		System.out.print("b=");
		int b = myScan.nextInt();
		System.out.print("c=");
		int c = myScan.nextInt();
		myScan.close();
		if(a>b) {
			if(c>a) {
				System.out.println(c+","+a+","+b);
			}
			else if(c<b) { 
				System.out.println(a+","+b+","+c);
			}
			else {
				System.out.println(a+","+c+","+b);
			}
		}
		else {
			if(b<c) {
				System.out.println(c+","+b+","+a);
			}
			else if(a>c){
				System.out.println(b+","+a+","+c);
			}
			else {
				System.out.println(b+","+c+","+a);
	
			}
		}
		
	

	}
	private void alphaToNumbers(char a) {
		switch(a)
		{
			case'A':
			case'a':
			case'B':
			case'b':
			case'C':
			case'c':
			case'F':
			case'f':
				System.out.println(10);
			break;
			case'D':
			case'd':
			case'E':
			case'e':
			case'G':
			case'g':
				System.out.println(12);
			break;
			case'H':
			case'h':
			case'J':
			case'j':
			case'M':
			case'm':
				System.out.println(6);
			break;
			default:
				System.out.println(20);
		}
	}
}