public class LogicalOperations {
   public static void main (String[] args){
    int subject1 = 20;
    int subject2 = 60;

    //&& -> AND || -> OR     
    if((subject1 >= 35) || (subject2 >=35)){
    //if((subject1 >= 35) && (subject2 >=35)){
        System.out.println("the condition is true");
    } else {
        System.out.println("the condition is false");
    }
   } 
}
