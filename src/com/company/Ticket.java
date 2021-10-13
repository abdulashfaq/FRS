package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Ticket {

    private long pnrNumber;
    private String departureLoc;
    private String destinationLoc;
    private boolean confirmed;
    Flight flight = new Flight();
    Passenger passenger;

    public Ticket(long pnrNumber, String departureLoc, String destinationLoc,
                  boolean confirmed, Flight flight, Passenger passenger) {
        this.pnrNumber = pnrNumber;
        this.departureLoc = departureLoc;
        this.destinationLoc = destinationLoc;
        this.confirmed = confirmed;
        this.flight = flight;
        this.passenger = passenger;
        if(confirmed == true)
            updateSeats();
    }

    public boolean getTicketStatus(){
        return  confirmed;
    }
    public Flight getFlightDetails(){
        return flight;
    }

   public long durationOfJourney() throws ParseException {
       SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
       Date time1 = format.parse(flight.getTimeOfDeparture());
       Date time2 = format.parse(flight.getTimeOfArrival());

       long duration = time1.getTime() - time2.getTime();
       return  duration;
  }
    public void updateSeats() {
        if (confirmed == true)
            flight.setNoOfSeatsBooked(flight.getNoOfSeatsBooked()+1);
    }
  public  void cancelTicket(){
        confirmed = false;
        flight.setNoOfSeatsBooked(flight.getNoOfSeatsBooked()-1);//5
  }
  public  void confirmTicket(){
        confirmed = true;
  }

    public long getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(long pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepartureLoc() {
        return departureLoc;
    }

    public void setDepartureLoc(String departureLoc) {
        this.departureLoc = departureLoc;
    }

    public String getDestinationLoc() {
        return destinationLoc;
    }

    public void setDestinationLoc(String destinationLoc) {
        this.destinationLoc = destinationLoc;
    }

    public boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
}
