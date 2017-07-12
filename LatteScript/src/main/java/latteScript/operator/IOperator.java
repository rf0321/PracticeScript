package latteScript.operator;
import java.util.List;
import latteScript.Engine;

public interface IOperator {
    Object call(Engine engine,List<?>args);
}
