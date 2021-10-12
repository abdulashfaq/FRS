package com.company;

public class touristTicket {
    private String hotelLocation;
    private String[] touristLocation = new String[5];

    public void addTouristLocation(String[] location) {
          touristLocation = location;
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
