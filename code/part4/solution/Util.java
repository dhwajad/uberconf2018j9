public class Util {
  public static void printCallerInfo() {
    String info = 
      StackWalker.getInstance()
        .walk(frames ->
          frames
            .map(frame -> String.format("%s %s %d",
               frame.getClassName(), frame.getMethodName(), frame.getLineNumber()))
            .skip(1)
            .findFirst()
            .orElse(""));
     
     System.out.println(info);
  }
  
  public static void call() {
    printCallerInfo();
  }
}