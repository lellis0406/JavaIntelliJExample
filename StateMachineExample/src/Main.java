public class Main {
    public static void main(String[] args) throws Exception {
        StateController.init();
        while(true) {
            StateController.tick();
        }
    }
}
