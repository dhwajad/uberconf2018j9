import java.util.*;
import java.awt.Color;
import java.lang.reflect.*;
import static java.util.stream.Collectors.*;

class Pencil {
  private final int id;
  private final Color color;
  
  public Pencil(int theId, Color theColor) {
    id = theId;
    color = theColor;
  }
  
  public int getId() { return id; }
  public Color getColor() { return color; }
}

public class Sample {  
  public static List<Pencil> createPencils() throws Exception {
    List<Color> colors = new ArrayList<>();

    for(Field field : Color.class.getFields()) {
      if(field.getType().equals(Color.class)) {
        colors.add((Color)(field.get(null)));
      }
    }
    
    List<Pencil> pencils = new ArrayList<>();
    for(int i = 0; i < 100; i++) {
      pencils.add(new Pencil(i, colors.get(i % colors.size())));
    }
    
    return pencils;
  }
  
  public static void main(String[] args) throws Exception {
    List<Pencil> pencils = createPencils();

    Map<Color, List<Integer>> byColor =
      pencils.stream()
        .collect(groupingBy(Pencil::getColor, 
           mapping(Pencil::getId, filtering(id -> id % 5 != 0, toList()))));
    
    for(Color color: byColor.keySet()) {
      System.out.println(color + ":" + byColor.get(color));
    }
  }
}