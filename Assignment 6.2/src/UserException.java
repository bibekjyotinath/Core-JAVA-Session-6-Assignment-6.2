import java.util.Scanner;       //Importing Scanner class for taking input from the user

class MyException extends Exception{	  //creating a class for displaying user exception extending the Exception class
	private short a;
	MyException(short age){           //Creating a constructor of the class MyException
		a = age;
	}
	public String toString() {
		return "MyException [" +a+ "]";   //returns error message with the age 
	}
}

public class UserException {
	
	 static void validate(short age)throws MyException{  //method to check the age which extends MyEception class
	     if(age<0)  							//Checking the condition
	      throw new MyException(age);        //Throws exception if the condition fails
	     else  
	      System.out.println("The age is verified");  
	   }  

	public static void main(String[] args) {
		
		short age;						//initialization of age 
		String name, email_id;			//initialization of name and email as character 
		
		Scanner sc = new Scanner(System.in);  //creating scanner object for taking input form the user
		
		try							//the code that may arise problem is written in the try block
		{
			System.out.println("Enter your Name: ");
			name = sc.next();
			System.out.println("Enter your Age: ");
			age = sc.nextShort();
			System.out.println("Enter your Email: ");
			email_id = sc.next();
			validate(age);
		}
		catch(MyException me)			//catch block catches the exception that is handled by MyException class 
		{
			System.out.println("Age cannot be neagtive "+me);
		}
		sc.close();
		
	}

}
