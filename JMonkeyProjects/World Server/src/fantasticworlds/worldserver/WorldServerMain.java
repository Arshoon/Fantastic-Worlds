package fantasticworlds.worldserver;

import com.jme3.app.SimpleApplication;
import com.jme3.network.Network;
import com.jme3.network.Server;
import com.jme3.system.JmeContext;
import fantasticworlds.network.NetworkUtility;
import fantasticworlds.network.StringMessage;
import java.io.IOException;

public class WorldServerMain extends SimpleApplication 
{
    private Server server;
    
    @Override
    public void destroy()
    {
        server.close();
        super.destroy();
    }
    
    public static void main(String[] args) 
    {
        WorldServerMain app = new WorldServerMain();
        app.start(JmeContext.Type.Headless);
    }

    @Override
    public void simpleInitApp() 
    {
        //do all setup things here
        try
        {
            server = Network.createServer(NetworkUtility.PORT);
            server.start();
        }
        catch(IOException exception)
        {
            
        }
    }

    @Override
    public void simpleUpdate(float tpf) 
    {
        server.broadcast(new StringMessage("HELLO WORLD at " + tpf));
    }
}