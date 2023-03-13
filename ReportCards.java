import java.util.Scanner;
public class ReportCards {
  //instance variables/attributes
    private double gpa;
    private boolean hasF = false;
    private int numClasses;

    public double ReportCards()
    {
        Scanner in = new Scanner(System.in);
        //Ask the user to input the first grade. Be sure to let them know what the valid grades are.
        System.out.println("Input a valid grade.");
        //Save the grade as a String
        String grade = in.nextLine();
        //Enter an if-statement to test if the grade entered is not valid.
        if (grade.indexOf("A") < 0 || grade.indexOf("B") < 0 || grade.indexOf("C") < 0 || grade.indexOf("D") < 0 || grade.indexOf("F") < 0)
        {
            System.out.println("You did not enter a valid grade. Please rerun the program.");
            System.exit(1);
        }
        //Use a loop to initialize or update numClasses, gpa, and hasF. The loop should run until the user inputs anything other than a valid grade.
        System.out.println("How many classes are you taking?");
        numClasses = in.nextInt();
        System.out.println("Do you have any F's?");
        String hasFString = in.nextLine();
        if (hasFString.equalsIgnoreCase("yes"))
            hasF = true;
        gpa = 0;
        //Finish calculating gpa.
        
        for (int i = 0; i <= numClasses; i++)
        {
        
        if (grade.indexOf("A") >= 0)
        {
            gpa+=4;
            return gpa;
        }
            
        else if (grade.indexOf("B") >= 0)
        {
            gpa+=3;
            return gpa;
        }
        else if (grade.indexOf("C") >= 0)
        {
            gpa+=2;
            return gpa;
        }
        else if (grade.indexOf("D") >= 0)
        {
            gpa+=1;
            return gpa;
        }
        System.out.println("Enter your next valid grade");
        grade = in.nextLine();
            if (grade.indexOf("A") < 0 || grade.indexOf("B") < 0 || grade.indexOf("C") < 0 || grade.indexOf("D") < 0 || grade.indexOf("F") < 0)
            {
                System.out.println("You did not enter a valid grade. Please rerun the program.");
                System.exit(1);
            }
        return gpa;    
        }
        gpa = gpa/numClasses;
        return 0;
    }

    //Calculate gpa, change hasF to true if an F is entered, and initialize numClasses to however many classes are entered.
    public ReportCards(String g1, String g2, String g3, String g4, String g5)
    {
        
        Scanner in2 = new Scanner(System.in);
        System.out.println("Please enter your grades. Type N/A if you are not taking a 2nd, 3rd, 4th, or 5th class");
        System.out.println("Please enter your 1st grade.");
        g1 = in2.nextLine();
        System.out.println("Please enter your 2nd grade.");
        g2 = in2.nextLine();
        System.out.println("Please enter your 3rd grade.");
        g3 = in2.nextLine();
        System.out.println("please enter your 4th grade.");
        g4 = in2.nextLine();
        System.out.println("Please enter your 5th grade.");
        g5 = in2.nextLine();

    }

    //getter methods
    //Code all of the getter methods
    public double getGPA()
    {
        return gpa;
    }
    public boolean getHasF()
    {
        return hasF;
    }
    public int numClasses()
    {
        return numClasses;
    }

    /*This method should return a String that follows the given table - any different formatting will cause the Check
     button to print Incorrect. Be aware that number of classes supersedes any of the other eligibility requirements.*/
    public String eligibility()
    {
        String eligibility = "";
        if (numClasses >= 4 && gpa > 2.0 && hasF == false)
        {
            eligibility+= "GPA: " + gpa + ", Eligible";
            return eligibility;
        }
        else if (numClasses < 4)
        {
            eligibility+= "GPA: " + gpa + ", Ineligible, taking less than 4 classes.";
            return eligibility;
        }
        else if (gpa > 2.0 && hasF == true)
        {
            eligibility += "GPA: " + gpa + ", Ineligible, GPA above 2.0, but has an F grade.";
            return eligibility;
        }
        else if (gpa <= 2.0)
        {
            eligibility+= "GPA: " + gpa + ", Ineligible, GPA below or equal to 2.0.";
            return eligibility;
        }
        else if (gpa <= 2.0 && hasF == true)
        {
            eligibility+= "GPA: " + gpa + ", Ineligible, GPA below or equal to 2.0 and has an F grade.";
            return eligibility;
        }
        return eligibility;
    }
}