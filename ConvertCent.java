 public class ConvertCent {
   public static void main(String[] args) {
     int inData = 324;
     var dollar = inData/100;
     var cent = inData % 100;

     System.out.println("The value is "+dollar+" dollars and "+cent+" cents.");
   }
 }
