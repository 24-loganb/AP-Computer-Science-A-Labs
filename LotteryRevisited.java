//Logan Braun
public class LotteryRevisited {
    //instance variables
    private String lottoNumbers;

    //constructors
    /*No parameter constructor. Initialize the lottoNumbers randomly. Numbers cannot be chosen more than once. There
    * should be a trailing space*/
    public LotteryRevisited()
    {
        lottoNumbers = "";

        Integer num = (int)(Math.random()*51+10);
        lottoNumbers = num + " ";
        int x = 1;
        while(x < 6)
        {
            num = (int)(Math.random()*51)+10;
            String str = num.toString();
            if(lottoNumbers.indexOf(str) == -1)
            {
                lottoNumbers+= str + " ";
                x++;
            }
        }


    }
    /*Constructor with parameters. Initialize customers' lotto ticket according to the numbers they choose.Numbers cannot be chosen more than once. There
     * should be a trailing space*/
    public LotteryRevisited(int num1, int num2, int num3, int num4, int num5, int num6)
    {
        lottoNumbers = num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " ";
    }

    //getter method
    //Create the getter method to make sure lottoNumbers is accessible outside of the LotteryRevisited class.
    public String getLottoNumbers()
    {
        return lottoNumbers;
    }

    //mutator methods
    /*Check to see if two LotteryRevisited objects are the equal. The method should take a LotteryRevisited object in as a parameter
    and should return true if all of the customer's lotto numbers are included in the winning number (or vice versa), false if they do not.*/
    public boolean equals(LotteryRevisited other)
    {
        this.lottoNumbers.equals(other.lottoNumbers);

        // I had trouble with this part so i used peek solution for help
        int space = 0;
        int firstIndex = other.lottoNumbers.indexOf(" ");
        String currentNum = (other.lottoNumbers).substring(firstIndex, space);
        for(int i = 1; i <= 6; i++)
        {
            if((this.lottoNumbers).indexOf(currentNum) == -1)
                return false;
            else {
                firstIndex+= currentNum.length()+1;
                space = other.lottoNumbers.indexOf(" ", firstIndex);
                if(space== -1)
                    currentNum = (other.lottoNumbers).substring(firstIndex);
                else
                    currentNum = (other.lottoNumbers).substring(firstIndex, space);
            }
        }
        return true;
    }

    /*Print the whether or not the customer's ticket is a winner. The method should take a LotteryRevisited object in as a parameter.
     * You should use the equals method you just wrote in this method.*/
    public void checkTicket(LotteryRevisited other)
    {
        if(this.equals(other))
            System.out.println("You won the lottery!!");
        else
            System.out.println("You lost. Try again next week!");
    }
}
