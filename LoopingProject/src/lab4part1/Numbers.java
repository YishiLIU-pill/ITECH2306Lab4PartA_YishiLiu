package lab4part1;

public class Numbers {
	// While count
		private int sumNumbers (int n) {
		//Add your code here
			int i = 0;
			//use while to count 0-5
			int s = 0;
			while (i < n) 
			{
				i += 1;
				s = i+s;
			}			
			
			return s;		// Replace with appropriate return value
		}
		
		// for count
		private int sumNumbersFor (int n) {
			// Add your code here
			int f = 0;
			for(int a = 1; a <= n; a++) {
			f += a;
		}
			return f;
		}
		
		// show age
		private void interestingAge (int age) {
			switch (age)
			{ 
			case 0:
				System.out.println("the person has been born\n");
				break;
			case 13:
				System.out.println("the person is now an adolescent\n");
				break;
			case 18:
				System.out.println("the person is now an adolescent\n");
				break;
			default:
				System.out.println(age+"It isn't an interesting age\n");
			
			}
		}
		
		public static void main (String [] args) {
			Numbers t = new Numbers ();
			
			System.out.println ("Sum of numbers 0 to 5 is " + t.sumNumbers(5));
		}
}
