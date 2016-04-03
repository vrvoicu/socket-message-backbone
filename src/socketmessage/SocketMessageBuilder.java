/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketmessage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author victor
 */
public class SocketMessageBuilder implements Serializable{
    
    public static SocketMessage createSocketMessage(){
        return new SocketMessage();
    }
    
    public static SocketMessage createSocketMessage(SocketMessageRequest socketMessageRequest){
        SocketMessage socketMessage = new SocketMessage();
        socketMessage.setSocketMessageRequest(socketMessageRequest);
        return socketMessage;
    }
    
    public static void addToSocketMessage(SocketMessage socketMessage, ArrayList<SocketMessageObject> socketMessageObjects){
        for(SocketMessageObject socketMessageObject : socketMessageObjects)
            socketMessage.getSocketMessageObjects().addAll(socketMessageObjects);
    }
    
    public static void addToSocketMessage(SocketMessage socketMessage, SocketMessageObject ...socketMessageObjects){
        for(SocketMessageObject socketMessageObject : socketMessageObjects)
            socketMessage.getSocketMessageObjects().addAll(new ArrayList<SocketMessageObject>(Arrays.asList(socketMessageObjects)));
    }
    
    public static SocketMessage createSocketMessage(SocketMessageRequest socketMessageRequest, ArrayList<SocketMessageObject> socketMessageObjects){
        SocketMessage socketMessage = new SocketMessage();
        socketMessage.setSocketMessageRequest(socketMessageRequest);
        
        socketMessage.setSocketMessageObjects(socketMessageObjects);
        
        return socketMessage;
    }
    
    public static SocketMessage createSocketMessage(SocketMessageRequest socketMessageRequest, SocketMessageObject ...socketMessageObjects){
        SocketMessage socketMessage = new SocketMessage();
        socketMessage.setSocketMessageRequest(socketMessageRequest);
        
        socketMessage.setSocketMessageObjects(new ArrayList<SocketMessageObject>(Arrays.asList(socketMessageObjects)));
        
        return socketMessage;
    }
}
