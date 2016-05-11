
package helloworldapp;

import java.util.Scanner;

// this is a class
public class HelloWorldApp 
{
    // this is another comment
    
    //this is the main function 
    public static void main(String[] args) 
    {
            // this creates an HelloWorldMessage objects named message1 and message2
            HelloWorldMessage message1 = new HelloWorldMessage();
            HelloWorldMessage message2 = new HelloWorldMessage();
            
            // message1 object displayMessage
            System.out.println("message1");
            message1.displayMessage();
            
            // message object displayMessage
            System.out.println("message2");
            message2.displayMessage();
            
            // message1 object displayMessage
            System.out.println("message1");
            message1.displayMessage();

    }
}

