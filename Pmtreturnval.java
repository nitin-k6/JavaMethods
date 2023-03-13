// public class pmtreturnval{
//     static int myMethod(int x){
//      int z= 15 + x;
//         return z;
//     }

//     public static void main(String[] args){
//     myMethod(5);
//     System.out.println(myMethod(5));

//     }
// }

// For two parameters

public class Pmtreturnval{
static int myMethod(int x, int y){
    return x+y;
}

    public static void main(String[] args){
    // myMethod(5,3);
    // myMethod(10,6);
    // myMethod(2,8);
  System.out.println(myMethod(5,3));
  System.out.println(myMethod(10,6));
  System.out.println(myMethod(2,8));
   int z=myMethod(10,10);
   System.out.println(z);


    }
}