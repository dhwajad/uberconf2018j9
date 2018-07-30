import java.util.*;

public class Sample {  
  public void use() {
    Util.printCallerInfo();
  }

  public static void main(String[] args) {
    Util.printCallerInfo();
    System.out.println("-----");
    new Sample().use();
    System.out.println("-----");
    Util.call();
  }
}