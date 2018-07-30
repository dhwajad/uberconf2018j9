import java.util.*;
import java.util.stream.*;
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
  public static Color getColorFromField(Field field) {
    try {
      return (Color)(field.get(null));      
    } catch(Exception ex) {
      throw new RuntimeException(ex);
    }
  }                                 
  
  public static List<Pencil> createPencils() throws Exception {
    List<Color> colors = Stream.of(Color.class.getFields())
      .filter(field -> field.getType().equals(Color.class))
      .map(Sample::getColorFromField)
      .collect(toList());
    
    return IntStream.range(0, 100)
      .mapToObj(i -> new Pencil(i, colors.get(i % colors.size())))
      .collect(toList());
  }                                                   
  
  public static void main(String[] args) throws Exception {
    List<Pencil> pencils = createPencils();

    long count = pencils.stream()
      .dropWhile(pencil -> pencil.getColor() != Color.GREEN)
      .takeWhile(pencil -> pencil.getColor() != Color.YELLOW)
      .skip(1)
      .count();

    System.out.println(count);
  }
}