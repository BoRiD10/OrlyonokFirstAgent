import jade.core.behaviours.OneShotBehaviour;

public class OneShotBehavior extends OneShotBehaviour {
    private double a = 2;

    @Override
    public void action() {
        double a2 = Math.pow(a, 2);
        System.out.println("а в квадрате: " + a2);
    }
}
