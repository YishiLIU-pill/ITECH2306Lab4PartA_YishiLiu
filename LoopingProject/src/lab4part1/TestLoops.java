package lab4part1;
import java.util.Scanner;

public class TestLoops{
	private static Scanner cat;
	public static void main(String[]args) {
		cat = new Scanner(System.in);
		int num;
		int o = 0;
		int j = 0;
		do {
			num = cat.nextInt();
			if(num!=0 )
			{
				if(num%2==0)
				{
					o = o + num;
				}
				else if (num != 9)
				{
					j++;
				}
				}
		}
		while(num!=0);
		System.out.println(o+","+j);
	}
}
//how to do that will not count 9?
		