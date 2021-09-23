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
        //system.out.println(newAddExclamationPoint(name));
        // create a friend object

        Friend newFriend = new Friend();
        //call my friend name method
        String friendName = Friend.myFriendName();
        System.out.println(friendName);


        //Call validateFriend Method with the variable name
        //name = Crystal 
        String validateFriend = Friend.validateFriend(name);
        //System.out.println(validateFriend);
        System.out.println(validateFriend);
        
        //System.out.println(newFriend.validateFriend(jake));
        Counter count = new Counter();
        //system.out.println(count.value)
        //0
        System.out.println(count.getValue());
        //1
        count.click();
        count.click();
        //2
        System.out.println();


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
