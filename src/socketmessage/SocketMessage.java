/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketmessage;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class SocketMessage implements Serializable{
    private ArrayList<SocketMessageObject> socketMessageObjects;
    private SocketMessageCommunicationType socketMessageCommunicationType;
    private SocketMessageResponseStatus socketMessageResponseStatus;
    private SocketMessageErrorType socketMessageErrorType;
    private SocketMessageRequest socketMessageRequest;

    public SocketMessage() {
        socketMessageObjects=new ArrayList<SocketMessageObject>();
    }
    
    public SocketMessageObject getObjectFromMessage(Class clazz){
        for(SocketMessageObject socketMessageObject : socketMessageObjects){
            if(isOf(clazz, socketMessageObject))
                return socketMessageObject;
        }
        return null;
    }
    
    public static boolean isOf(Class clazz, Object obj){
        return clazz.isInstance(obj);
    }
    
    public enum SocketMessageCommunicationType{
        REQUEST,RESPONSE
    }
    
    public enum SocketMessageResponseStatus{
        APPROVAL,DENIAL,ERROR
    }

    public ArrayList<SocketMessageObject> getSocketMessageObjects() {
        return socketMessageObjects;
    }

    public void setSocketMessageObjects(ArrayList<SocketMessageObject> socketMessageObjects) {
        this.socketMessageObjects = socketMessageObjects;
    }

    public SocketMessageResponseStatus getSocketMessageResponseStatus() {
        return socketMessageResponseStatus;
    }

    public void setSocketMessageResponseStatus(SocketMessageResponseStatus socketMessageResponseStatus) {
        this.socketMessageResponseStatus = socketMessageResponseStatus;
    }

    public SocketMessageErrorType getSocketMessageErrorType() {
        return socketMessageErrorType;
    }

    public void setSocketMessageErrorType(SocketMessageErrorType socketMessageErrorType) {
        this.socketMessageErrorType = socketMessageErrorType;
    }

    public SocketMessageRequest getSocketMessageRequest() {
        return socketMessageRequest;
    }

    public void setSocketMessageRequest(SocketMessageRequest socketMessageRequest) {
        this.socketMessageRequest = socketMessageRequest;
    }

    public SocketMessageCommunicationType getSocketMessageCommunicationType() {
        return socketMessageCommunicationType;
    }

    public void setSocketMessageCommunicationType(SocketMessageCommunicationType socketMessageCommunicationType) {
        this.socketMessageCommunicationType = socketMessageCommunicationType;
    }
    
}
