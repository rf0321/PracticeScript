package latteScript.operator;
import latteScript.Engine;
import java.util.List;

public class GetOperator implements IOperator {
    @Override
    public Object call(Engine engine, List<?>args){
        return engine.variables.get(engine.eval(args.get(0)));
    }
}
