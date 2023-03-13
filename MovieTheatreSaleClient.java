public class MovieTheatreSaleClient {
    public static void main(String[] args)
    {
        /*Create a MovieTheatreSale object called sale here using the no-parameter constructor.*/
        MovieTheatreSale sale = new MovieTheatreSale();
        /*Check if the rating is R or r here. If so, you will need to check the customer's ID.*/
        if(sale.getRating() == "R" || sale.getRating() == "r")
        {
            /*Use checkID here. If the person is too young, the output window should display this and the
             * program should terminate.*/
            if(sale.checkID() == false)
            {
                System.out.println("You are too young");
            }
        }
        //Do not change (it will help you check your code).
        System.out.print(sale);
    }
}
