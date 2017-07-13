import latteScript.Engine;
import net.arnx.jsonic.JSON;

public class Main {
  public static void main(String[]args){
      Engine engine = new Engine();
      Object result = engine.eval(JSON.decode("[\"+\", 1, 2, [\"*\", 3, 4]]"));
      System.out.println(result);
  }
}
