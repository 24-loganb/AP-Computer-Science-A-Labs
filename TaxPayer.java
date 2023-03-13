public class TaxPayer
{
   //instance variables
   private boolean married;
   private double taxableIncome;

   //constructors
   //This is a default constructor. It sets default values in case the user forgets to.
   public TaxPayer()
   {
      married = false;
      taxableIncome = 0;
   }
   public TaxPayer(String status, double income)
   {
      //status = "married";
      /*If status holds "married" (in upper or lowercase), married should be set to true.
       If status holds "single" (in upper or lowercase), married should be set to false.*/
      if(status == "married")
      {
         married = true;
      }
      else if(status == "single")
      {
         married = false;
      }
      //If status holds anything else, the program will automatically quit.
      else
      {
         System.out.println("You did not enter a valid marital status. Please rerun the program.");
         System.exit(1);
      }
      //Set taxable income.
      taxableIncome = income;
      //If taxableIncome is less than zero, the program will automatically quit.
      if(taxableIncome < 0)
      {
         System.out.println("You did not enter a valid taxable income. Please rerun the program.");
         System.exit(1);
      }
   }


   //getter methods
   public boolean getMaritalStatus()
   {
      return married;
   }

   public double getIncome()
   {
      return taxableIncome;
   }


   //calculator methods

   //calculates and returns the tax on a TaxPayer with *single* status
   private double calcSingleTax()
   {
      double tax = 0;
      if (taxableIncome <= 9875)
      {
         tax = 0.1 * taxableIncome;
      }
      else if (taxableIncome <= 40125)
      {
         tax = 0.12 * (taxableIncome - 9875) + 987.5;
      }
      else if (taxableIncome <= 85525)
      {
         tax = 0.22 * (taxableIncome - 40125) + 4617.5;
      }
      else if (taxableIncome <= 163300)
      {
         tax = 0.24 * (taxableIncome - 85525) + 14605.5;
      }
      else if (taxableIncome <= 207350)
      {
         tax = 0.32 * (taxableIncome - 163300) + 33271.5;
      }
      else if (taxableIncome <= 518400)
      {
         tax = 0.35 * (taxableIncome - 207350) + 47367.5;
      }
      else if (taxableIncome >= 518400)
      {
         tax = 0.37 * (taxableIncome - 518400) + 156235;
      }
      return tax;
   }

   //calculates and returns the tax on a TaxPayer with *married* status
   private double calcMarriedTax()
   {
      double tax = 0;
      if (taxableIncome <= 19750)
      {
         tax = 0.1 * taxableIncome;
      }
      else if (taxableIncome <= 80250)
      {
         tax = 0.12 * (taxableIncome - 19750) + 1975;
      }
      else if (taxableIncome <= 171050)
      {
         tax = 0.22 * (taxableIncome - 80250) + 9235;
      }
      else if (taxableIncome <= 326600)
      {
         tax = 0.24 * (taxableIncome - 171050) + 29211;
      }
      else if (taxableIncome <= 414700)
      {
         tax = 0.32 * (taxableIncome - 326600) + 66543;
      }
      else if (taxableIncome <= 622050)
      {
         tax = 0.35 * (taxableIncome - 414700) + 94735;
      }
      else if (taxableIncome >= 622050)
      {
         tax = 0.37 * (taxableIncome - 622050) + 167307.5;
      }
      return tax;
   }

   /*Uses calcSingleTax() and calcMarriedTax() to calculate
   and return the appropriate tax value
    */
   public double calcTax()
   {
      if (!(married))
      {
         return calcSingleTax();
      }
      else
         return calcMarriedTax();
   }

}
