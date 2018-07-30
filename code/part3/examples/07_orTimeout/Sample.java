import java.util.*;
import java.util.concurrent.*;

public class Sample {  
  public static int compute() {
    //imagine going out to a webservice to get this result
    sleep(3000); //simulate a delay of computation
    System.out.println("In compute: " + Thread.currentThread());                                         
    return 2;
  }
  
  public static void main(String[] args) {
    //Both in life and programming never do anything without timeout
    
    System.out.println("In main: " + Thread.currentThread());                                         
    
    CompletableFuture<Integer> task = 
      CompletableFuture.supplyAsync(() -> compute());
                                                     
    task.orTimeout(2, TimeUnit.SECONDS);
    
    System.out.println("Sent...");  
    
    task.thenAccept(result -> System.out.println(result))
        .exceptionally(err -> {
          System.out.println(err);
          throw new RuntimeException(err);
        });
    
    System.out.println("taking a nap");          
    
    sleep(4000);
  }             
  
  private static boolean sleep(int ms) {
    try {
      Thread.sleep(ms);
      return true;
    } catch (InterruptedException e) {
      return false;
    }
  }
}