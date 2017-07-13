package latteScript;
import  latteScript.expression.IExpression;
import  latteScript.expression.Operator;
import  latteScript.expression.ImmutableValue;
import latteScript.operator.*;
import  latteScript.expression.Operator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Engine {
    public Map<String, IOperator> operators = new HashMap<String, IOperator>();
    public Map<String, Object> variables = new HashMap<String, Object>();

    public Engine(){
        operators.put("+",new Addtion());
        operators.put("*",new Multipl());
        operators.put("-",new Sub());
        operators.put("%",new Division());
        operators.put("=",new Equal());
        operators.put("val",new SetValue());
        operators.put("pointer",new GetOperator());
        operators.put("until",new WhileOperator());
        operators.put("step",new CalculateAuthOp());
    }

    public Object eval(Object script){
        return getExpression(script).eval(this);
    }
    private IExpression getExpression(Object script) {
        if (script instanceof List) {
            List<?> scriptList = (List<?>) script;
            return new Operator(
                    operators.get(scriptList.get(0)),
                    scriptList.subList(1, scriptList.size()));
        } else {
            return new ImmutableValue(script);
        }
    }
}
