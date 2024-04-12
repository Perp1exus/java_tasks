
package exceptionhandling;

public class CheckNumbers {
    
    private int num;
    public void numbers(int num)throws ArithmeticException{
        this.num = num;
            if(!(this.num%2==0)){
                System.out.println("Error: "+num+" is odd.");
            }
            else{
                System.out.println(num+" is even.");
            }
   
        
        
    }
}
