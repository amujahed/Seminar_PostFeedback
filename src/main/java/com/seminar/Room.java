package com.seminar;

public class Room {
    private int roomId;
    private int noOfSeats;
    private int noOfBookedSeats=0;

    public Room(int roomId,int noOfSeats,int noOfBookedSeats)
    {
        this.roomId=roomId;
        this.noOfSeats=noOfSeats;
        this.noOfBookedSeats=noOfBookedSeats;
    }
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfBookedSeats() {
        return noOfBookedSeats;
    }

    public void setNoOfBookedSeats(int noOfBookedSeats) {
        this.noOfBookedSeats = noOfBookedSeats;
    }
    public int getNoOfAvailableSeats()
    {
       return getNoOfSeats()- getNoOfBookedSeats();
    }
    public boolean isAvailable()
    {
        return getNoOfAvailableSeats() >0;
    }
    public void occupySeat()
    {
        noOfBookedSeats++;
    }
    public void freeSeat()
    {
        noOfBookedSeats--;
    }
}
