import java.util.*;

public class Sample { 
  public static void process(Optional<Integer> result) {
    System.out.println(result);   //Java 8
    //System.out.println(result.get()); //forget   //Java 8
    
    System.out.println(result.orElse(0));   //Java 8

    //imperative solution
    if(result.isPresent()) //Java 8
      System.out.println("The value is " + result.orElse(0));
    else
      System.out.println("No value");
    
    //result.ifPresent(e -> System.out.println("The value is " + e)); //Java 8                     
    
    //Java 9  ifPresentOrElse(Consumer, Runnable)
    result.ifPresentOrElse(e -> System.out.println("The value is " + e),
      () -> System.out.println("No value"));
                       
    //Java 8
    //Given an Optional<T> with either e(T)           or empty(T)
    //orElse(value(T)) ->       either e              or value
    //map(t -> k)                  Optional<K>(k)     or Optional<K>(empty)
    
    //orElse goes from Optional to Value - inject a value
    //map goes from Optional to Optional - transform existing value
    //what if you want to inject a value, like orElse, but stay with Optional
    //instead of type T
    
    
    System.out.println(Optional.of(result.orElse(99)));//Java 8
    System.out.println(result.or(() -> Optional.of(99)));//Java 9
    
    System.out.println("---------");
  } 
  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    process(numbers.stream()
      .filter(e -> e > 5)
      .findFirst());

    process(numbers.stream()
      .filter(e -> e > 50)
      .findFirst());

  }
}