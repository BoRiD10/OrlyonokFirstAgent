import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class WackerBehavior extends WakerBehaviour {

    public WackerBehavior(Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    protected void onWake() {
        System.out.println("Прошло 10 секунд");
    }


}
