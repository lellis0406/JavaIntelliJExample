import javax.swing.plaf.nimbus.State;
import java.lang.reflect.Method;

public class StateController {

    private static Class<? extends StateNode> currentState;

    public static void init() throws Exception{
        setState(ExampleNode1.class);
    }
    public static void tick() throws Exception{
        Method tick = currentState.getMethod("tick");
        tick.invoke(null);
    }

    public static void transitionState(Class<? extends StateNode> newState) throws Exception{
        Method end = currentState.getMethod("exit");
        end.invoke(null);
        currentState = newState;
        Method enter = currentState.getMethod("enter");
        enter.invoke(null);
    }

    public static void setState(Class<? extends StateNode> newState) throws Exception{
        currentState = newState;
    }
}
