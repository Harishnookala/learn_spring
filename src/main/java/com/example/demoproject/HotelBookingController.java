package com.example.demoproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/Hotels")
public class HotelBookingController {

   private  List<HotelBookingsModel> bookings = new ArrayList<>();
   public  HotelBookingController(){
       bookings.add(new HotelBookingsModel("Savanna", 2000.0, 2));
       bookings.add(new HotelBookingsModel("Uday",3000.0,3));
       bookings.add(new HotelBookingsModel("Sarvanas",5000.0,4));
       bookings.add(new HotelBookingsModel("Bhimas",4000.0,1));
   }

  @RequestMapping(value="/all",method = RequestMethod.GET)
   public  List<HotelBookingsModel>getAll(){
     return  bookings;
   }

   @RequestMapping(value = "/affordable/{price}" , method = RequestMethod.GET)
    public  List<HotelBookingsModel> affordable(@PathVariable double price){
       return  bookings.stream().filter(day_price -> day_price.getPerDay_price()<=price).collect(Collectors.toList());
   }
}
