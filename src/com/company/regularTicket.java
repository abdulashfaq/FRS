package com.company;

public class regularTicket extends Ticket{
    private String food;
    private String water;
    private String  snacks;



    public regularTicket(long pnrNumber, String departureLoc, String destinationLoc,
                         boolean confirmed, Flight flight, Passenger passenger, String food,
                         String water, String snacks,int price) {
        super(pnrNumber, departureLoc, destinationLoc, confirmed, flight, passenger,price);
        this.food = food;
        this.water = water;
        this.snacks = snacks;
    }

    public String getSpecialService(){
         return food+", "+water+", "+snacks;
     }

    public void updateSpecialService(String food,String water,String snacks){
         this.snacks = snacks;
         this.food = food;
         this.water = water;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }
}
