import java.util.Scanner;
public class MadLibsClient {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        /*Create a loop to continue asking the user if they would like to create a new story.
         * If the user types any version of the word "no" the loop should end so that a story will not be written.*/
        //Prompt the user to ask if they want to play
        System.out.println("Do you want to play MadLibs?");
        //read in whether or not the user wants to play
        String response = in.nextLine();
        //trim the user's response
        response = response.trim();
        //Create the loop
        while (response.equalsIgnoreCase("no"))
        {
            //Create a new MadLibs story object.
            MadLibs madLib = new MadLibs();
            //call the createStory method to print out the story.
            madLib.createStory();
            //Prompt the user to ask if they want to continue playing
            System.out.println("Do you want to play MadLibs?");
            //read in whether or not the user wants to play
            response = in.nextLine();
            //trim the user's response
            response = response.trim();
        }
    }
}