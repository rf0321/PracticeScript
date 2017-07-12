package latteScript.operator;
import java.util.List;
import latteScript.Engine;


public class Equal implements IOperator{
    @Override
    public Object call(Engine engine, List<?> args) {
        return engine.eval(args.get(0)).equals(engine.eval(args.get(1)));
    }
}
