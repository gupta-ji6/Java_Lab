import java.util.Scanner;
class calculator {
	public static void main(String args[]) {
		int num1,num2,op,res;
		boolean cont = true;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1 = s.nextInt();
		System.out.print("\nEnter second number: ");
		num2 = s.nextInt();
		do{
			System.out.print("\nEnter operation: ");
			System.out.print("\n1. Add");
			System.out.print("\n2. Subtract");
			System.out.print("\n3. Multiply");
			System.out.print("\n4. Divide\n\n");
			op = s.nextInt();
			switch(op) {
				case 1:	res = num1 + num2;
						System.out.print("\n" + num1 + " + " + num2 + " = " + res + "\n");
						break;	
				case 2:	res = num1 - num2;
						System.out.print("\n" + num1 + " - " + num2 + " = " + res + "\n");
						break;
				case 3:	res = num1 * num2;
						System.out.print("\n" + num1 + " * " + num2 + " = " + res + "\n");
						break;
				case 4:	res = num1 / num2;
						System.out.print("\n" + num1 + " / " + num2 + " = " + res + "\n");
						break;
				default: System.out.println("You entered an invalid operation");
			}
			System.out.println("\nContinue?");
			System.out.println("1. Yes");
			System.out.println("2. No");			
			int flag = s.nextInt();
			if(flag==2) {
				cont = false;
			}
		} while(cont);
	}
}