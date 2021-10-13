package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
	    Flight flight1 = new Flight("Missile","Air India",250,"15/oct/2021",
                "17/oct/2021","15:30:00","09:00:00");
        Flight flight2 = new Flight("Bejing","Air India",200,"14/oct/2021",
                "15/oct/2021","09:00:00","20:00:00");
        Passenger passenger1 = new Passenger("Ashfaq","+91 1023456789","xyz@gmail.com",
                "Chandrayan Gutta","Hyderabad","Telangana");
        Passenger passenger2 = new Passenger("Zubair","+91 1234567890","pqr@gmail.com",
                "Ghazi-e-millat colony","Hyderabad","Telangana");
        String[] touristLocation = {"Agra","Red Fort","Qutab Minar","India Gate","Lotus Temple"};
        touristTicket ticket1 = new touristTicket(51575928667L,"Rajiv Ghandi International airport",
                "Delhi International Airport",true,flight1,passenger1,"new delhi",
                touristLocation,15000);
        regularTicket ticket2 = new regularTicket(15486245645L,"Delhi","America",
                true,flight2,passenger2,"Chicken Biriyani","Lime Water","Potato Chips",25000);

        flight1.flightName;
        flight1.getFlightName();
        System.out.println(passenger1.getContactDetails());
        System.out.println(passenger2.getAddressDetails());
        System.out.println(ticket1.durationOfJourney());
        System.out.println(ticket2.durationOfJourney());
        System.out.println(flight1.getFlightDetails());
        System.out.println(ticket1.addTouristLocation(touristLocation));
    }
}
