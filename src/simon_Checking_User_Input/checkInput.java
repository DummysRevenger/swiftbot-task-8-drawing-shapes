package simon_Checking_User_Input;

import swiftbot.Button;
import swiftbot.SwiftBotAPI;

public class checkInput {
	
	
	public static void main(String[] args) 
	{
		String correctInput;
		
		SwiftBotAPI API = new SwiftBotAPI();
		API.enableButton(Button.A, () -> {
		  System.out.println("Button A has been pressed");
		});
		
		

		try{
	        long endtime = System.currentTimeMillis() + 10_000;
	        API.enableButton(Button.A, () -> {
	            System.out.println("Button A Pressed.");
	            API.disableButton(Button.A);
	        });

	        API.enableButton(Button.B, () -> {
	            System.out.println("Button B Pressed.");
	            API.disableButton(Button.B);
	        });

	        API.enableButton(Button.X, () -> {
	            System.out.println("Button X Pressed.");
	            API.disableButton(Button.X);
	        });

	        API.enableButton(Button.Y, () -> {
	            System.out.println("Button Y Pressed.");
	            API.disableButton(Button.Y);
	        });

	        while(System.currentTimeMillis() < endtime){
	            ; // This while loop does nothing for 10 seconds.
	        }
	        API.disableAllButtons(); // Turns off all buttons now that it's been 10 seconds.
	        System.out.println("All buttons are now off.");

	    }catch(Exception e){
	        System.out.println("ERROR occurred when setting up buttons.");
	        e.printStackTrace();
	        System.exit(5);
	    }

		
		checker("A","A");
		
	}
	
	
	
	public static boolean checker(String input, String correctInput)
	{
		if (input == correctInput)
		{
			return true;
		}
		else {
			System.out.println("Game Over");
			return false;
		}
	}
}
