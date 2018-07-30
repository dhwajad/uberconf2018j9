import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(11, 12, 13, 41, 51, 16, 17, 81, 91, 110);
    
    numbers.stream()
      //.filter(e -> e < 50) //Java 8
      //.limit(3) //Java 8
      //.skip(7) //Java 8
      //.takeWhile(e -> e < 50) //Java 9
      .dropWhile(e -> e < 50)
      .forEach(System.out::println);
      
    //filter: takes a Predicate - it is like a flat that open/closes for each element
    //limit: takes an int - it is like a gate that is open, but closes forever
    //skip: takes in int - it is like a gate that is closed, but opens forever  
    
    //filter takes a Predicate but limit and skip only take a number
    
    //Haskell       vs.         Java
    //take(n)                   limit(n)
    //drop(n)                   skip(n)
    //takeWhile(predicate)      takeWhile()
    //dropWhile(predicate)      dropWhile()
    
    //not quite the same but think of takeWhile as functional equivalent of
    //break and dropWhile as functional equivalent of continue
    
  }
}