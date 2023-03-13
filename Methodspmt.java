public class Methodspmt{
    static void myMethod( String firstname){
    System.out.println(firstname + " Rock"); //putting soace after first " will print Nitin Rock otherwise NitinRock
    }



    public static void main(String[] args){
    myMethod("Nitin");
    myMethod("Chris");
    myMethod("John");
// When a parameter is passed to the method, it is called an argument. SO, firstname is a parameter, while Nitin,Chris and John are arguments.///
    }
} 