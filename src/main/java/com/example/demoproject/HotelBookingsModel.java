package com.example.demoproject;

public class HotelBookingsModel {
   public String hotelName;
   public double perDay_price;
   public int no_Of_Nights;

   public HotelBookingsModel(String hotelName,double perDay_price,int no_Of_Nights){
       this.hotelName = hotelName;
       this.perDay_price = perDay_price;
       this.no_Of_Nights = no_Of_Nights;
   }



    public String getHotelName() {
        return hotelName;
    }

    public double getPerDay_price() {
        return perDay_price;
    }

    public int getNo_Of_Nights() {
        return no_Of_Nights;
    }
    public  double getTotalPrice(){
       return  perDay_price * no_Of_Nights;
    }

}
