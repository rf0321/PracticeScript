package latteScript.expression;
import  latteScript.Engine;
public class ImmutableValue implements IExpression {
    private Object value;
    public ImmutableValue(Object value){
        this.value=value;
    }
    @Override
    public Object eval(Engine engine){
        return value;
    }
}
