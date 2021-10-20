package Week5;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        //for loop executes a block of code a limited amount of times
        //init variable, condition, iteration (optional) 
        //LESSTHAN OR EQUAL TO < = <=
        // for(int i = 0; i<=10;i+=2){
        //     System.out.println(i);
        // }

        //decrement variable
        // for(int i = 10; i>=0; i--){
        //     System.out.println(i);
        // }
        // System.out.println("Happy New Year");

        Scanner keyboard = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = keyboard.nextInt();
        System.out.println("Enter # of columns: ");
        columns = keyboard.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = keyboard.next();

        System.out.println(rows+""+ columns + symbol);
        
        for(int i = 1; i<=rows; i++){
            // incharge of rows.. moves us down to the next line
            System.out.println();
            for(int j=1; j<= columns; j++){
                // incharge of columns unit it reaches the end.. then moves back to the outer loop 
                System.out.print(symbol);
            }
        }
    }
}
