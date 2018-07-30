import java.util.*;

//Java 7: try-with-resource ARM (Automatic Resource Management)

class Resource implements AutoCloseable {
  public Resource() { System.out.println("Created..."); }
  public Resource op1() {
    System.out.println("op1");
    return this;
  }
  public void close() {
    System.out.println("clear external resources");
  }
}                      

public class Sample {  
  public static void use(Resource resource) {
    try(resource) { //resource should be final or effectively final
      resource.op1();         
    }       

    //resource is not modifiable here, but you may access the
    //state of the object and change state as well. Use caution
  }

  public static void main(String[] args) {
    use(new Resource());
  }
}