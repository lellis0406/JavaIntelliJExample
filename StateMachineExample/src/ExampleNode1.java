import javax.swing.plaf.nimbus.State;

public class ExampleNode1 extends StateNode {
    private static int count = 5;
    public static void enter() {
        count = 5;
    }

    public static void tick() throws Exception{
        //do thing
        System.out.println("Ticking State 1: " + count);
        count -= 1;
        if(count == 0) {
            StateController.transitionState(ExampleNode2.class);
        }
    }

    public static void exit() {
        //do thing
    }
}
