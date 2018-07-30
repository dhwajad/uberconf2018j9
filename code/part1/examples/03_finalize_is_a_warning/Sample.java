import java.util.*;

class Resource {
  public Resource() { System.out.println("Created..."); }
  public Resource op1() {
    System.out.println("op1");
    return this;
  }
  public void finalize() {
    System.out.println("clear external resources");
  }
}                      

public class Sample {  
  public static void main(String[] args) {
    Resource resource = new Resource();
    resource.op1();         

    //bad idea
    //Rich Hickey: complecting
    
    System.gc(); //terrible
  }
}