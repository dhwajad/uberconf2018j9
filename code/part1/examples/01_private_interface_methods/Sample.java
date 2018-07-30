import java.util.*;

interface Util {
  default int getNumberOfProcessors() { 
    return getProcessorCount();
  }

  static int getNumberOfProcessors2() { 
    return getProcessorCount2();
  }
  
  private int getProcessorCount() {
    return Runtime.getRuntime().availableProcessors(); 
  }                             
  
  private static int getProcessorCount2() {
    return Runtime.getRuntime().availableProcessors(); 
  }
  //use private methods within interface sparingly
}

public class Sample {  
  public static void main(String[] args) {
    System.out.println("OK");
  }
}