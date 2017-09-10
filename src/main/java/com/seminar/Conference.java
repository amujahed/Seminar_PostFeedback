package com.seminar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Conference {
    private int conferenceId;
    private String conferenceName;
    private List<Session> sessionList;

    public Conference()
    {
        sessionList=new ArrayList();
    }
    public Conference(int conferenceId,String conferenceName)
    {
        this.conferenceId=conferenceId;
        this.conferenceName=conferenceName;
        sessionList=new ArrayList();
    }

    public Conference(int conferenceId,String conferenceName,List<Session> sessionList)
    {
       this.conferenceId=conferenceId;
       this.conferenceName=conferenceName;
       this.sessionList=sessionList;
    }

    public int getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(int conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
    }
    public Session getSession(String sessionName)
    {

            return sessionList.stream()
                    .filter(session -> sessionName.equals(session.getSessionName()))
                    .collect(Collectors.toList()).get(0);
    }
    public void addUser(String userEmailId,String sessionName)
    {
           Session session=getSession(sessionName);
           if(session != null)
           {
                session.addUser(userEmailId);
           }
           else
               System.out.println("Invalid session name " +sessionName);
    }
    public void addSession(Session session)
    {
        if(sessionList.contains(session))
        {
            System.out.println("Session "+session.getSessionName()+" already present in the conference");
        }
        else
        {
            sessionList.add(session);
        }

    }
}
