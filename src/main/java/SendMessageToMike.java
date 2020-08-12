import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class SendMessageToMike extends Behaviour{

    @Override
    public void action() {
        //Обмен сообщениями
        ACLMessage message = new ACLMessage(ACLMessage.INFORM);
        message.addReceiver(myAgent.getAID("Mike"));
        message.setContent("Hello Mike");
        myAgent.send(message);

        ACLMessage receivedMsg = myAgent.receive();
        if (receivedMsg != null){
            System.out.println(receivedMsg.getContent());
            System.out.println(receivedMsg.getSender().getLocalName() + " thank you for your message");
            ACLMessage reply = receivedMsg.createReply();
            reply.setPerformative(ACLMessage.INFORM);
            reply.setContent(receivedMsg.getSender().getLocalName() + " thank you for your message");
            getAgent().send(reply);
        }else {
            block();
        }
    }

    @Override
    public boolean done() {
        return false;
    }
}
