import java.util.*;
import java.util.stream.*;

public class Sample {  
  public static void main(String[] args) {
    //Java 8
    //for(int i = 0; i < 5; i++) { System.out.println(i); }
    
    //IntStream.range(0, 5).forEach(i -> System.out.println(i));
    
    //for(int i = 0; i <= 5; i++) { System.out.println(i); }
    
    //IntStream.rangeClosed(0, 5).forEach(i -> System.out.println(i));

    //Java 9
    //for(int i = 0; i < 15; i = i + 3) { System.out.println(i); }
                                     
    //4 popular functional interface: Supplier, Consumer, Predicate, Function
    //for(seed; Predicate; Function)
    
    //IntStream.iterate(0, i -> i < 15, i -> i + 3)
    //  .forEach(System.out::println);
    
    for(int i = 0;; i = i + 3) { 
      if(i > 17) break;
      System.out.println(i); 
    }
    
    IntStream.iterate(0, i -> i + 3)
      .takeWhile(i -> i <= 17)
      .forEach(System.out::println);
    
  }
}