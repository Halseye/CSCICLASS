public class Playground {
    public static void main(String[] args) {
        // STRING PLAYGROUND
        String name = "Greg";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        name.toUpperCase();
        System.out.println(name.toUpperCase());
        //THIS IS NEEDED FOR THE HOMEWORK
        System.out.println(name.replace("g", "T"));

        // METHOD PLAYGROUND

        // METHOD WITH VOID
        //addExclamationPoint(name);
        
        // METHOD WITHOUT VOID (STRING)
        newAddExclamationPoint(name);

        String exclaimName = newAddExclamationPoint(name);
        System.out.println(exclaimName);

        //System.out.println(newAddExclamationPoint(name));


    }
    // make a void method 
    // method addExclamationPoint
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!" );
    }

    // make a method that returns a string
    public static String newAddExclamationPoint(String s) {
        return s + "!";
    }



}
