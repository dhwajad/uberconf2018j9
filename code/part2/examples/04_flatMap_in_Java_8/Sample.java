import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Sample {  
  public static void main(String[] args) {
    //Java 8
    
    //If you have a one to one function - R f1(T)
    //Stream<T>.map(f1) ==> Stream<R>
    
    //If you have a one to many function - List<R> f2(T)
    //Stream<T>.map(f2) ==> Stream<List<R>>

    //But you may want Stream<T> to Stream<R> using f2
    //Stream<T>.map(f2).flatten() => Stream<R>
    //Will be nice to combine those to operations:
    //so we want Stream<T>.mapFlatten(f2) => Stream<R>
    
    //flatMap was created to save human jaw
    
    //use map for one to one function mapping
    //use flatMap for one to many function mapping 
    
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    System.out.println(numbers.stream()
      .map(e -> e * 2)
      .collect(toList()));
    System.out.println("-----");
    
    System.out.println(numbers.stream()
      .map(e -> new Object[] { e - 1, e + 1})
      .collect(toList()));
    System.out.println("-----");
    
    System.out.println(numbers.stream()
      .flatMap(e -> Stream.of(new Object[] { e - 1, e + 1}))
      .collect(toList()));
    System.out.println("-----");
  }
}