/*
 * This is the HelloWorldMessage Class
 */
package helloworldapp;

public class HelloWorldMessage
{
    static int numberOfMessages = 0;
    
    String message = "Hello World";
    
    public void displayMessage()
    {
        numberOfMessages++;
        System.out.print(numberOfMessages + ": ");
        System.out.println(message); 
        
    }
}
