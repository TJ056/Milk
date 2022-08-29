
/**
 * Program will accept a number of liter of milk produced in one  day.
 * And determine how many cartons can be filled along with the cost of the cartons.
 * As well as the profit that will be made for the day.
 *
 * @author Tim Johnson
 * @version August 29, 2022
 */
import java.util.*;

public class Milk
{
    static Scanner console = new Scanner(System.in);
    
    static final double CONTENTS_LITERS = 3.78;
    static final double LITERS_COST = .38;
    static final double CARTON_PROFIT = .27;
    /* generally best practice to intialize variables */
    
    public static void main(String[] args) 
    {
        double totalMilkLiters = 0;
        int cartons = 0;
        double totalCost = 0;
        double totalProfit = 0;
        
        System.out.print("Enter total number of liters of milk produced: ");
        totalMilkLiters = console.nextDouble();
        
        System.out.println();
        
        cartons = (int)(totalMilkLiters / CONTENTS_LITERS); /* how many cartons you are able to fill with milk? */
        totalCost = (double)(totalMilkLiters * LITERS_COST); /* multiplying the liters of milk by how much liter costs */
        totalProfit = (double)(cartons * CARTON_PROFIT);    /* how much profit you will make after selling these cartons of milk */
        
        System.out.println("Total number of milk cartons produced today: " + cartons);
        System.out.println("Cost of milk cartons produced today: $ " + totalCost);
        System.out.println("Profit earned from selling the cartons of milk today: $ " + totalProfit);  
        
    }
    
}
