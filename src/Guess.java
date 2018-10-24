import java.util.Scanner;
import java.util.Random;
public class Guess {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Random ran = new Random();
		int flag=0;
		int tries=0;
		int number = ran.nextInt(200-1)+1;
		String num = String.valueOf(number);
		System.out.println("I will think a number between 100 and 200, try to guess it in less than 10 tries.");
		
		while (flag==0) {
			switch(tries) {
				default:
					System.out.println("Tell me a number");
					if (sc.hasNextInt()) {
						int number2=sc.nextInt();
						if (number2>=1 && number2<=200) {
							if (number<number2) {
								System.out.println("My number is smaller");
								tries++;
							}
							else if (number>number2) {
								System.out.println("My number is bigger");
								tries++;
							}
							else {
								tries++;
								System.out.println("You guessed it in " + tries + " tries.");
								flag++;
							}
						}
						else {
							System.out.println("You haven't entered a number between 1 and 200");
						}						
					}
					else {
						System.out.println("You haven't entered a number");
						sc.next();
					}
					break;
				
				case 3:
					System.out.println("I will give you a hint");
					char[] array = num.toCharArray();
					String alderantziz="";
					for (int i=num.length()-1;i>=0;i--) {
						alderantziz=alderantziz+array[i];
					}
					if (num.equals(alderantziz)) {
						System.out.println("My number is palindrome");
					}
					else {
						System.out.println("My number isn't palindrome");
					}
					System.out.println("Tell me a number");
					if (sc.hasNextInt()) {
						int number2=sc.nextInt();
						if (number2>=1 && number2<=200) {
							if (number<number2) {
								System.out.println("My number is smaller");
								tries++;
							}
							else if (number>number2) {
								System.out.println("My number is bigger");
								tries++;
							}
							else {
								tries++;
								System.out.println("You guessed it in " + tries + " tries.");
								flag++;
							}
						}
						else {
							System.out.println("You haven't entered a number between 1 and 200");
						}						
					}
					else {
						System.out.println("You haven't entered a number");
						sc.next();
					}
					break;
					
				case 5:
					System.out.println("I will give you my last hint");
					if (number<100) {
					System.out.println("The first digit is " + num.charAt(0));
					}
					else {
						if (number%2==0) {
							System.out.println("My number is even");
						}
						else {
							System.out.println("My number is odd");
						}
					}
					System.out.println("Tell me a number");
					if (sc.hasNextInt()) {
						int number2=sc.nextInt();
						if (number2>=1 && number2<=200) {
							if (number<number2) {
								System.out.println("My number is smaller");
								tries++;
							}
							else if (number>number2) {
								System.out.println("My number is bigger");
								tries++;
							}
							else {
								tries++;
								System.out.println("You guessed it in " + tries + " tries.");
								flag++;
							}
						}
						else {
							System.out.println("You haven't entered a number between 1 and 200");
						}						
					}
					else {
						System.out.println("You haven't entered a number");
						sc.next();
					}
					break;
					
				case 8:
					System.out.println("I will give you another hint");
					if (number>=100) {
						System.out.println("The last digit is " + num.charAt(num.length()-1));
					}
					else {
						if (number%2==0) {
							System.out.println("My number is even");
						}
						else {
							System.out.println("My number is odd");
						}
					}
					System.out.println("Tell me a number");
					if (sc.hasNextInt()) {
						int number2=sc.nextInt();
						if (number2>=1 && number2<=200) {
							if (number<number2) {
								System.out.println("My number is smaller");
								tries++;
							}
							else if (number>number2) {
								System.out.println("My number is bigger");
								tries++;
							}
							else {
								tries++;
								System.out.println("You guessed it in " + tries + " tries.");
								flag++;
							}
						}
						else {
							System.out.println("You haven't entered a number between 1 and 200");
						}						
					}
					else {
						System.out.println("You haven't entered a number");
						sc.next();
					}
					break;
					
				case 10:
					System.out.println("Game Over");
					System.out.println("My number was "+ number);
					flag++;
			}
		}
	}
}
