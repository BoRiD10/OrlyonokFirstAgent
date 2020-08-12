import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

//Бесконечно будет выполнять метод onTick
public class TickerBehavior extends TickerBehaviour {


    public TickerBehavior(Agent a, long period) {
        super(a, period);
    }

    @Override
    protected void onTick() {
        System.out.println("Tick for " + myAgent.getLocalName());
    }
}
