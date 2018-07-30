import java.util.*;

public class Sample {  
  public static void f2() {
    StackWalker walker = StackWalker.getInstance();
    
    walker.forEach(frame -> System.out.println(frame));
  } 
  
  public static void f1() {
    f2();
  }     
  
  public static void main(String[] args) {
    f1();
  }
}