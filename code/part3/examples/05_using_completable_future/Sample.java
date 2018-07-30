import java.util.*;
import java.util.concurrent.*;

public class Sample {  
  public static int compute() {
    //imagine going out to a webservice to get this result
    System.out.println("In compute: " + Thread.currentThread());                                         
    return 2;
  }
  
  public static void main(String[] args) {
    //Java 8
    //Both in life and programming never do anything without timeout
    
    System.out.println("In main: " + Thread.currentThread());                                         
    
    CompletableFuture<Integer> task = 
      CompletableFuture.supplyAsync(() -> compute());
      
    System.out.println("Sent...");  
    
    task.thenAccept(result -> System.out.println(result));
  }
}