package fantasticworlds.client;

import com.jme3.app.SimpleApplication;
import com.jme3.network.Client;
import com.jme3.network.Message;
import com.jme3.network.MessageListener;
import com.jme3.network.Network;
import com.jme3.renderer.RenderManager;
import fantasticworlds.network.NetworkUtility;
import fantasticworlds.network.StringMessage;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ClientMain extends SimpleApplication 
{
    Client client;
    private ConcurrentLinkedQueue<String> stringMessageQueue;
    
    private class NetworkMessageListener implements MessageListener<ClientMain>
    {

        @Override
        public void messageReceived(ClientMain source, Message m)
        {
            if(m instanceof StringMessage)
            {
                StringMessage stringMessage = (StringMessage) m;
            }
        }
        
    }
    
    public static void main(String[] args) 
    {
        ClientMain app = new ClientMain();
        app.start();
    }

    @Override
    public void simpleInitApp() 
    {
        try
        {
            client = Network.connectToServer("localhost", NetworkUtility.PORT);
            client.start();
        }
        catch(IOException iOException)
        {
            
        }
    }

    @Override
    public void simpleUpdate(float tpf)
    {
        
    }

    @Override
    public void simpleRender(RenderManager rm) 
    {
        
    }
}
