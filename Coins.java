public class Coins {
    public static String getChange(){
        // Logan Braun
      int cents = 94;
      int quarters = cents / 25;
      int remainder1 = cents % 25;
      int dimes = remainder1 / 10;
      int remainder2 = remainder1 % 10;
      int nickels = remainder2 / 5;
      int remainder3 = remainder2 % 5;
      int pennies = remainder3 / 1;

        /*ToDo*/
        return(cents + " cents: Quarter(s) " + quarters + ", Dime(s) " + dimes +", Nickel(s) " + nickels +", Penny(s) " + pennies);
    }
    public static void main(String[] args)
    {
        System.out.println(Coins.getChange());
    }
}