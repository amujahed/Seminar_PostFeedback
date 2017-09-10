package com.seminar;

import java.util.ArrayList;
import java.util.List;

public class Session {
    private int sessionId;
    private String sessionName;
    private Room room;
    private List userList;


    public Session()
    {
        userList=new ArrayList();
    }
    public Session(int sessionId,String sessionName)
    {
        userList=new ArrayList();
        this.sessionId=sessionId;
        this.sessionName=sessionName;

    }
    public Session(int sessionId,String sessionName,Room room)
    {
        userList=new ArrayList();
        this.sessionId=sessionId;
        this.sessionName=sessionName;
        this.room=room;
    }
    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List getUserList() {
        return userList;
    }

    public void setUserList(List userList) {
        this.userList = userList;
    }
    public void addUser(String userEmailId)
    {
        if(getRoom().isAvailable())
        {
            if(getUserList().contains(userEmailId))
                System.out.println("User "+userEmailId+" is already registered for the session "+getSessionName() );
            getUserList().add(userEmailId);
            getRoom().occupySeat();
            System.out.println("User "+userEmailId+" added to the session "+ getSessionName());
        }
        else
            System.out.printf("Session "+ getSessionName()+" is already booked");

    }


}
