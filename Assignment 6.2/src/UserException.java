import java.util.Scanner;       //Importing Scanner class for taking input from the user

class MyException extends Exception{	  //creating a class for displaying user exception extending the Exception class
	private short a;		  //initializing of variable to character data type (private)
	MyException(short age){           //Creating a constructor of the class MyException
		a = age;		  //assigning the value of age to a 
	}
	public String toString() { .     //method created toString 
		return "MyException [" +a+ "]";   //returns error message with the age 
	}
}

public class UserException {		//class created UserException which holds the main method
	
	 static void validate(short age)throws MyException{  //method to check the age which extends MyEception class
	     if(age<0)  							//Checking the condition
	      throw new MyException(age);        //Throws exception if the condition fails
	     else  
	      System.out.println("The age is verified");  		//if no exception has arrised prints the message on console
	   }  

	public static void main(String[] args) {		//main method of the program
		
		short age;						//initialization of age 
		String name, email_id;			//initialization of name and email as character 
		
		Scanner sc = new Scanner(System.in);  //creating scanner object for taking input form the user
		
		try							//the code that may arise problem is written in the try block
		{
			System.out.println("Enter your Name: ");	//prints message on the console
			name = sc.next();				//stores value taken from the user in name variable
			System.out.println("Enter your Age: ");		//prints message on the console
			age = sc.nextShort();				//Stores value taken from the user in age variable
			System.out.println("Enter your Email: ");	//prints message on the console
			email_id = sc.next();				//Stores value taken from the user in email_id variable
			validate(age);					//calling the vaidate method  
		}
		catch(MyException me)			//catch block catches the exception that is handled by MyException class 
		{
			System.out.println("Age cannot be neagtive "+me);	//prints message on the console
		}
		sc.close();				//closing the scanner class 
		
	}

}
