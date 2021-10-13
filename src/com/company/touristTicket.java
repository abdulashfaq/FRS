package com.company;

public class touristTicket extends Ticket {
    private String hotelLocation;
    private String[] touristLocation = new String[5];

    public touristTicket(long pnrNumber, String departureLoc, String destinationLoc, boolean confirmed,
                         Flight flight, Passenger passenger, String hotelLocation, String[] touristLocation, int price) {
        super(pnrNumber, departureLoc, destinationLoc, confirmed, flight, passenger, price);
        this.hotelLocation = hotelLocation;
        this.touristLocation = touristLocation;
    }


    public void addLocation(String location1) {
        touristLocation = new String[]{location1};
    }

    public void addLocation(String location1, String location2) {
        touristLocation = new String[]{location1, location2};
    }

    public void addLocation(String location1, String location2, String location3) {
        touristLocation = new String[]{location1, location2, location3};
    }

    public void addLocation(String location1, String location2, String location3, String location4) {
        touristLocation = new String[]{location1, location2, location3, location4};
    }

    public void addLocation(String location1, String location2, String location3, String location4, String location5) {
        touristLocation = new String[]{location1, location2, location3, location4, location5};
    }

    public void removeLocation(String location1) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i] == location1)
                touristLocation[i] = null;
    }

    public void removeLocation(String location1, String location2) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i] == location1 || touristLocation[i] == location2)
                touristLocation[i] = null;
    }

    public void removeLocation(String location1, String location2, String location3) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i] == location1 || touristLocation[i] == location2 || touristLocation[i] == location3)
                touristLocation[i] = null;
    }

    public void removeLocation(String location1, String location2, String location3, String location4) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i] == location1 || touristLocation[i] == location2 || touristLocation[i] == location3 || touristLocation[i] == location4)
                touristLocation[i] = null;
    }

    public void removeLocation(String location1, String location2, String location3, String location4, String location5) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i] == location1 || touristLocation[i] == location2 || touristLocation[i] == location3 ||
                    touristLocation[i] == location4 || touristLocation[i] == location5)
                touristLocation[i] = null;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }
}
