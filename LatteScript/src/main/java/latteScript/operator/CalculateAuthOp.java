package latteScript.operator;
import java.util.List;
import latteScript.Engine;

public class CalculateAuthOp implements IOperator
{
    @Override
    public Object call(Engine engine, List<?> args) {
        Object val = null;
        for(Object arg: args){
            val = engine.eval(arg);
        }
        return val;
    }
}
