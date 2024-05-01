public class ExampleNode2 extends StateNode {
    private static int count = 0;
    public static void enter() {
        count = 0;
    }

    public static void tick() throws Exception{
        //do thing
        System.out.println("Ticking State 2: " + count);
        count += 1;
        if(count == 5) {
            StateController.transitionState(ExampleNode1.class);
        }
    }

    public static void exit() {
        //do thing
    }
}
