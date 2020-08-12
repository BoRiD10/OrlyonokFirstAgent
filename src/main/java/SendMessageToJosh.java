import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class SendMessageToJosh extends Behaviour{
    private int sendMessage = 0;

    @Override
    public void action() {

        ACLMessage message = new ACLMessage(ACLMessage.INFORM);
        message.addReceiver(myAgent.getAID("Josh"));
        message.setContent("Hello Josh");
        myAgent.send(message);

        ACLMessage receivedMsg = myAgent.receive();
        if (receivedMsg != null){
            System.out.println(receivedMsg.getContent());
            System.out.println(receivedMsg.getSender().getLocalName() + " thank you for your message");
            ACLMessage reply = receivedMsg.createReply();
            reply.setPerformative(ACLMessage.INFORM);
            reply.setContent(receivedMsg.getSender().getLocalName() + " thank you for your message");
            getAgent().send(reply);
            sendMessage++;
        }else {
            block();
        }
    }

    @Override
    public boolean done() {
        if (sendMessage == 1){
            return true;
        }else {
            return false;
        }
    }
}
