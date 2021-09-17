public class Playground {
    public static void main(String[] args) {
        //STRING PLAYGROUND
        String name = "Crystal";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //This is needed for the homework
        System.out.println(name.replace("C", "T"));

        //METHOD PLAYGROUND

        //Method with void
        addExclamationPoint(name);
        // method without void (STRING)
        newAddExclamationPoint(name); 

        String exclaimName = newAddExclamationPoint(name);
        System.out.println(exclaimName);

    }
    // make a void method
    // method addExclamationPoint
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!" );
    }

    //make a method that returns a string
    public static String newAddExclamationPoint(String s) {
        return s + "!";
        
    }


}
