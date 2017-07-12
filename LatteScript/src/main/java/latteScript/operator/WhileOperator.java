package latteScript.operator;
import java.util.List;
import latteScript.Engine;
import org.omg.PortableInterceptor.ObjectReferenceFactory;

public class WhileOperator implements IOperator{
    @Override
    public Object call(Engine engine,List<?>args){
        Object val=null;
        while (!(boolean)engine.eval(args.get(0))){
            val=engine.eval(args.get(1));
        }
        return val;
    }
}
