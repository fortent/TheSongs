/**********************************************************
Author: fortent
Date : 2018/03/08
Ref: website link to code referenced or the book, authors name and page number 
************************************************************/
package NatashaForte.TheSongs;


import java.util.Date;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    public static void main ( String[] args )
    {
		// To view the arguments being entered
		seeCommandlineInput(args);
			
		// To instantiate App class based in the parameters entered at the commandline
		actionCommandlineInput(args);
    }
    
	// DATA
	//............................................................
	//define attributes
	
	private	Scanner someInput;
	private Date today;
	
	private static Logger LOG;
	// CONSTRUCTORS
	//............................................................
	
	
	public App()
	{		
		LOG = LogManager.getLogger(App.class);
		
		testLogOutput();
		
		this.someInput = new Scanner(System.in);
		
		//do something here
		System.out.println(" \n Soon ... stuff will happen here");		
		
		//pause before exit (this is only useful if an error occurs)
        System.out.println(" \n Press enter to exit the program");
		this.someInput.nextLine();

		//close the program without error
		System.exit(0);
	}
    
    
	// METHODS used by main() or debug methods - note they are static methods
	//............................................................
	
	/**
	 * action the arguments presented at the command line
	 * instantiate the App class based on the arguments passed
	 */
	 private static void actionCommandlineInput( String args[] )
	 {
		 // no special instantiation yet as don't pass args to it
		 App anApp = new App();
	 }
    
	/**
	 * View the arguments presented at the commandline
	 * This is for debug and demo purposes
	 */
	 private static void seeCommandlineInput( String args[] )
	 {	
		if (args.length == 0)
        {
            System.out.println("There were no commandline arguments passed!");
        }
		else
		{
			// display the command line  entered 
			for(int i = 0; i < args.length; i++) 
			{
	            System.out.println(args[i]);
	            
	        }
		}
		 
	 }
    
	 private static void testLogOutput()
	 {
		 LOG.debug("Log test: Test printed on debug");
		 LOG.info("Log test: Test printed on info");
		 LOG.warn("Log test: Test printed on warn");
		 LOG.error("Log test: Test printed on error");
		 LOG.fatal("Log test: Test printed on fatal");
		 
		 LOG.info("Appending string: {}.", "Application log test message - HI");
	 }
}//EOC
