package latteScript.operator;
import java.math.BigDecimal;
import java.util.List;
import latteScript.Engine;

public class Multipl implements IOperator{
    @Override
    public Object call(Engine engine, List<?> args) {
        BigDecimal val = BigDecimal.ONE;
        for(Object arg: args){
            Object v = engine.eval(arg);
            val = val.multiply((BigDecimal)v);
        }
        return val;
    }

}
