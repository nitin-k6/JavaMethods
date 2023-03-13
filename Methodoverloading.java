//  Three methods that add numbers of different type
/*public class methodoverloading{
    static int myMethodInt(int x){
        return 10 +x;
    }

    static  float myMethodFloat(float x){
        return 10+ x;
    }

    static double myMethodDouble(double x , double y){
    return 15 + x*y;
    }


public static void main(String[] args){
 myMethodInt(5);
 myMethodFloat(6.6f);
 myMethodDouble(7.7 , 6.6);
 System.out.println(myMethodInt(5));
 System.out.println(myMethodFloat(6.6f));
 System.out.println(myMethodDouble(7.7 , 6.6));

}
}*/

//Instead of defining three methods that should do the same thing, it is better to overload one.

public class  Methodoverloading{

static int myMethod(int x , int y){
    return x+y;
}

static double myMethod(double x, double y){
    return x+y;
}

    public static void main(String[] args){
    myMethod(5,7);
    myMethod(4.4 ,6.6);
    System.out.println(myMethod(5,7));
    System.out.println(myMethod(4.4,6.4));

    }
}