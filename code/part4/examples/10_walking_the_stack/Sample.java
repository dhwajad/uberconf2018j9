import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {  
  public static void f2() {
    StackWalker walker = StackWalker.getInstance();

    List<String> methodNames = 
      walker.walk(frames -> 
          frames.filter(frame -> frame.getFileName().startsWith("Sample"))
            .map(frame -> frame.getMethodName())
            .collect(toList()));
   
   System.out.println(methodNames);     
  } 
  
  public static void f1() {
    f2();
  }     
  
  public static void main(String[] args) {
    f1();
  }
}