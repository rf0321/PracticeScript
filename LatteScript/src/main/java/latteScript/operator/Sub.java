package latteScript.operator;

import latteScript.Engine;

import java.math.BigDecimal;
import java.util.List;

public class Sub implements IOperator{
    @Override
    public Object call(Engine engine, List<?> args){
        BigDecimal val=BigDecimal.ZERO;
        for(Object arg:args){
            Object v=engine.eval(arg);
            val=val.subtract((BigDecimal)v);
        }
        return val;
    }
}
