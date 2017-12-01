package fantasticworlds.network;

import com.jme3.network.AbstractMessage;
import com.jme3.network.serializing.Serializable;

@Serializable
public class StringMessage extends AbstractMessage
{
    private String message;
    
    public String getMassgae(){ return message; }
    
    public StringMessage(){}
    
    public StringMessage(String message)
    {
        this.message = message;
    }
}