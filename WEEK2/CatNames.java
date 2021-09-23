package WEEK2;

public class CatNames {
    static String catName = "Momo";
    //String catName = "Appa";

    //so when would u not want to use Static?
    public static void main(String[] args) {
        String catName = "Appa";
        //static allows us to reference two different objects, it will stay still, like a door, accessed in any area
        System.out.println(catName);
        //CatNames cat = new CatNames();
        System.out.println(CatNames.catName);

        //what is this?? an object!!!
        Access crystalHouse = new Access();
        System.out.println(crystalHouse.getCat1());
        System.out.println(crystalHouse.getCat2());


    }
}
