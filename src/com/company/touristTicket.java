package com.company;

public class touristTicket extends Ticket {
    private String hotelLocation;
    private String[] touristLocation = new String[5];

    public touristTicket(long pnrNumber, String departureLoc, String destinationLoc, boolean confirmed,
                         Flight flight, Passenger passenger, String hotelLocation, String[] touristLocation,int price) {
        super(pnrNumber, departureLoc, destinationLoc, confirmed, flight, passenger,price);
        this.hotelLocation = hotelLocation;
        this.touristLocation = touristLocation;
    }


    public void addTouristLocation(String[] location) {
          for(int i = 0;i<touristLocation.length;i++){
              for(int j = 0;j< location.length;j++){
                  if(touristLocation[i] != location[j]){
                      touristLocation[i] = location[j];
                  }
              }
          }
    }

    public void removeTouristLocation(String[] location){
        for(int i = 0; i<touristLocation.length;i++){
            for(int j=0; j<location.length;j++){
                if(touristLocation[i] == location[j]);
                    touristLocation[i] = null;
            }
        }
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }
}
