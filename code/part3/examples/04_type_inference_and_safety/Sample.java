import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    //System.out.println(
    //    Map.<Integer, String>of(1, "a", 2, "b", 3, "c", 4, 4));

    System.out.println(
        Map.<Integer, String>of(1, "a", 2, "b", 3, "c", 4, "4"));
    //be careful with typeinference as it may infer to a type you did
    //not intend
  }
}