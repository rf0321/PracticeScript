package latteScript.expression;
import java.util.List;
import latteScript.Engine;
import latteScript.operator.IOperator;

public class Operator implements IExpression{
    private IOperator operator;
    private List<?>args;
    public Operator(IOperator operator,List<?>args){
        this.operator=operator;
        this.args=args;
    }
    @Override
    public Object eval(Engine engine) {
        return operator.call(engine, args);
    }
}
