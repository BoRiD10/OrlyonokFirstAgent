import jade.core.behaviours.Behaviour;

public class Behavior extends Behaviour {
    private int a = 0;

    @Override
    //Метод выполняется один раз в самом начале поведения
    public void onStart() {
        System.out.println(myAgent.getLocalName() + " начал расчет");
    }

    @Override
    //Этот метод будет повторятся до тех пор, пока done != true
    public void action() {
        a++;
        System.out.println("Current Result: " + a);
        //Задержка
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public boolean done() {
        if (a == 15){
            return true;
        }
        else {
            return false;
        }
    }
}
