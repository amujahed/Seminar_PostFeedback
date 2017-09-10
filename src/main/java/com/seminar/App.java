package com.seminar;

public class App {

    public static void main(String[] args) {

        Conference conference=new Conference(1,"Vapasi");

        conference.addSession(new Session(1,"Java",new Room(1,100,20)));
        conference.addSession(new Session(2,"Agile",new Room(2,100,20)));
        conference.addSession(new Session(3,"SOLID",new Room(3,50,50)));
        conference.addUser("abc@xyz.com","Java");
        conference.addUser("def@xyz.com","Java");
        conference.addUser("abc@xyz.com","Agile");
        conference.addUser("abc@xyz.com","Java");
        conference.addUser("abc@xyz.com","SOLID");



    }
}
