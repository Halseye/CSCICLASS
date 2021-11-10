package Week8;

import java.util.ArrayList;
import java.util.Collections;

import Week3.BankAccount;

public class ArrayListLesson {

    

    public static void main(String[] args) {
        // initalize the Array List with STRING
        ArrayList<String> cars = new ArrayList<String>();
        System.out.println(cars.size());
        // add items to array list
        cars.add("BMW");
        System.out.println(cars.size());
        cars.add("Honda");
        cars.add("Volvo");
        cars.add("Toyota");
        System.out.println(cars.size());
        // print the array list
        System.out.println(cars);
        // for each loop with array list
        for (String string : cars) {
            System.out.println(string);
        }


        // remove a value
        cars.size();
        
        Collections.sort(cars);
        cars.remove(cars.size()-1);
        System.out.println(cars);

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        int test = 5;

        myNumbers.add(test);

        int addValue = 0;

        System.out.println(myNumbers);

        for (Integer i : myNumbers) {
            addValue = addValue + i;            
        }
        System.out.println(addValue);

        ArrayList<Character> names = new ArrayList<Character>();
        
        ArrayList<Double> dollas = new ArrayList<Double>();
        
        ArrayList<BankAccount> banks = new ArrayList<BankAccount>();
        BankAccount userBank = new BankAccount(1500);
        BankAccount gregchecking = new BankAccount(0);
        BankAccount bobchecking = new BankAccount(50000);
        banks.add(userBank);
        banks.add(gregchecking);
        banks.add(bobchecking);
        System.out.println(banks.size());
        System.out.println(banks);

        for (BankAccount bankAccount : banks) {
            System.out.println(bankAccount.getBalance());
        }









        
    }




    
}
