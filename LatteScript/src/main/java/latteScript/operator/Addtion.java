package latteScript.operator;

import java.math.BigDecimal;
import java.util.List;
import latteScript.Engine;


public class Addtion implements IOperator{
    @Override
    public Object call(Engine engine,List<?>args){
       BigDecimal val=BigDecimal.ZERO;
       for(Object arg:args){
           Object v=engine.eval(arg);
           val=val.add((BigDecimal)v);
       }
       return val;
    }
}
