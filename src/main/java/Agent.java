import jade.lang.acl.ACLMessage;

// Создание агента
public class Agent extends jade.core.Agent {

    //Стартовый метод
    @Override
    protected void setup() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getLocalName() + " was Born ");
        //Добавление и запуск поведений
//        addBehaviour(new Behavior());
//        addBehaviour(new OneShotBehavior());
//        addBehaviour(new TickerBehavior(this, 1000));
//        addBehaviour(new WackerBehavior(this, 10000));

        //Обмен сообщениями
        if (getLocalName().equals("Mike")){
            addBehaviour(new SendMessageToJosh());
        } else if (getLocalName().equals("Josh")){
            addBehaviour(new SendMessageToMike());
        } else {
            System.out.println("Недопустимый агент");
        }
    }
}
