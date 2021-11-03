package Week6;

import java.util.Scanner;

public class arrays {
    // arrays are used to store multiple values in a single variable
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[10];

        // System.out.println(anArray[0]);
        // [null,null,null,null,null,null,null,null,null,null]
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        //anArray[10] = 100;

        // System.out.println(anArray[9]);
        // another way to create an array if we know the values
        // before hand
        int[] shortArray = {
            0,1,200,3,4,5,6,7,8,9
        };
        // For each loop in java with array
        // for (int i : shortArray) {
        //     System.out.println(i);  
        // }

        String[] name = {"Appa","Momo","Jack"};
        // System.out.println(name[0]);
        // Without a for each loop
        for(int i =0; i <name.length; i++){
            System.out.println(name[i]);
        }
        System.out.println("For Each");

        for (String string : name) {
            System.out.println(string);
        }

        String[] nameunknown =  new String[20];
        nameunknown[0] = "Greg";
        nameunknown[1] = "George";
        nameunknown[2] = "Ryan";
        nameunknown[3] = "Ryan";

        System.out.println(nameunknown[2]);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Word");
        String str = keyboard.next();

        nameunknown[4] = str;

        // for (String string : nameunknown) {
        //     System.out.println(string);
        // }
            // create array of string str length
        char[] ch = new char[str.length()];

        // Copy char by char into array
        for(int i = 0;i <str.length(); i++){
            ch[i] = str.charAt(i);
        }

        System.out.println(ch);

        for (char c : ch) {
            System.out.println("Char: "+c);
        }

        



    }


}
