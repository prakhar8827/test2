import java.util.*;
class calci{
public static void main(String []args){
System.out.println("Enter two numbers to find their sum:");
try{
int a = parseInt(args[0]);
int b = parseInt(args[1]);
  System.out.println("Sum is:"+(a+b));
}catch(Exception e)
{
  System.out.println("error");
}
  finally{
    System.out.println("wew");
  }

}
}
