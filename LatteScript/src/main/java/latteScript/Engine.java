package latteScript;
import  latteScript.expression.IExpression;
import  latteScript.expression.Operator;
import  latteScript.expression.ImmutableValue;
import  latteScript.operator.IOperator;
import  latteScript.expression.Operator;
import  latteScript.operator.Addtion;
import  latteScript.operator.Multipl;
import  latteScript.operator.Sub;
import  latteScript.operator.SetValue;
import  latteScript.operator.CalculateAuthOp;
import  latteScript.operator.WhileOperator;
import  latteScript.operator.GetOperator;
import  latteScript.operator.Equal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Engine {
    public Map<String, IOperator> operators = new HashMap<String, IOperator>();
    public Map<String, Object> variables = new HashMap<String, Object>();

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

