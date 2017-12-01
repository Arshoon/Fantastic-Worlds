package fantasticworlds.network;

import com.jme3.network.serializing.Serializer;

public class NetworkUtility
{
    public static final int PORT = 8966;
    
    public static void initializeSerializables()
    {
        Serializer.registerClass(StringMessage.class);
    }
}