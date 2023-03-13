// Recursion to add numbers upto 10
/*public class recursion{

    static int Sum(int k){
       if (k>0){
        return k + Sum(k-1);
       }
       else{
        return 0;
       }
            
    }
    public static void main(String[] args){
    int result = Sum(10);
    System.out.println(result);
        
    }
}*/

//Recursion to add number between 5 to 10;
public class  Recursion{

    static int Sum(int start, int end){
        if(end>start){
            return end +Sum(start,end-1);
        }
        else{
            return end;
        }
    }
    public static void main(String[] args){
        int result= Sum(5,10);
        System.out.println(result);
    }
}
