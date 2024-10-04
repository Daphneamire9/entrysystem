package entrysystem;

import java.util.Scanner;

public class Entrysystem {

	public static void main(String[] args) {
		//get input from form
		Scanner name = new Scanner(System.in);
		
		//for input user_name
		System.out.print("username: ");
	    String username = name.nextLine();
	    System.out.println("welcome, " + username);
	    
	  //for input password
	    System.out.print("password: ");
	    String password = name.nextLine();
	    
	    
	    String[] correct_username= {"daphne","tim","johnny"};
	    String[] correct_password= {"2d3","43r","45r"};

	    boolean accessGranted=false;

	    // loop through looking for matches
	    for(int i=0; i < correct_username.length; i++) {
	        if (username.equals(correct_username[i]) && password.equals(correct_password[i]) ) {
	            accessGranted = true;
	            break;
	        } else {
	            accessGranted = false;
	        }
	    }
	    if (accessGranted) {
	        System.out.println("Access granted");
	    } else {
	        System.out.println("Access denied");
	    }   

	  
	  }

	}


       