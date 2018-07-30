import java.util.*;
import java.util.stream.*;

public class Sample {  
  public static void process(Stream<Integer> stream) {
    stream.forEach(System.out::println); 
    System.out.println("----");
  } 
  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    process(numbers.stream()
      .filter(e -> e > 7));

    process(numbers.stream()
      .filter(e -> e > 9));
      

    process(numbers.stream()
      .filter(e -> e > 10));
      
    //Stream may have 0, 1, or more values
    
    //Optional may have 0 or 1 value
    
    process(numbers.stream()
      .filter(e -> e > 5)
      .findFirst()
      .stream());
  }
}