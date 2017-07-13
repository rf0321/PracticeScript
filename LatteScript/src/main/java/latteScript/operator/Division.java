package latteScript.operator;
import latteScript.Engine;

import java.math.BigDecimal;
import java.util.List;

public class Division implements IOperator{
    @Override
    public Object call(Engine engine,List<?> args){
        BigDecimal val=BigDecimal.ONE;
        for(Object arg:args){
            Object v=engine.eval(arg);
            val=val.divide((BigDecimal)v);
        }
        return val;
    }

}
