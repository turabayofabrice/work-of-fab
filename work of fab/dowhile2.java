import java.util.Scanner;

public class dowhile2 
{
  public static void main(String[] args) 
  {
    // Take input from the user
    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);
	   
    int sum = 0;
    int num = 0;

    // do...while loop continues 
    // until entered number is positive
    do {
      // add only positive numbers
      sum += num;
      System.out.println("Enter a number");
      num = sc.nextInt();
    } 
    while(num >= 0); 
	   
    System.out.println("The sum of entered positive numbers is " + sum);
    sc.close();
  }
}
