public class Methodifelse{
 static void checkAge(int age){

 if(age<18){
    System.out.println("You are not old enough to vote");
 }
 else{
    System.out.println("You can vote");
 }

 }
    public static void main(String[] args){
     checkAge(19);
     checkAge(16);
     checkAge(21);
     checkAge(24);

    }
}