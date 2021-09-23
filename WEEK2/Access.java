package WEEK2;

import jdk.javadoc.doclet.DocletEnvironment.ModuleMode;

public class Access {
    //default, public, private, protected
    //default = used to give access to everything in the package
    //public = similar to default but gives access everywhere
    //private = only in this class
    //protected = only on this package and extend(subclass)
    
    String cat1 = "Momo";
    String cat2 = "Appa";


    public String getCat1() {
        return cat1;
        
    }
    public String getCat2(){
        return cat2;

    }
    //Setter
    public String setCat1(String catName) {
        cat1 = catName;
        return catName; 
        
    }
}
