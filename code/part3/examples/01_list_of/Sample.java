import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    //List<Integer> list = new ArrayList<Integer>();
    //
    //list.add(1);
    //list.add(2);
    //System.out.println(list);
    
    //List<Integer> list = Arrays.asList(1, 2);
    //
    ////list.add(3); //ERROR
    //list.set(0, 4); //OOPS
    //
    //System.out.println(list);
    //System.out.println(list.getClass());
    
    //Java 9
    List<Integer> list = List.of(1, 2, 3, 4);
    
    //list.add(5); //ERROR
    //list.set(0, 4); //ERROR
    System.out.println(list);
    System.out.println(list.getClass());
  }
}