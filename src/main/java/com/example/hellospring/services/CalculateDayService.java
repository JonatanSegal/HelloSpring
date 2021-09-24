package com.example.hellospring.services;

import java.time.LocalDate;

public class CalculateDayService {
    private final int year = LocalDate.now().getYear();
    private final int day = LocalDate.now().getDayOfMonth();
    private final int month = LocalDate.now().getMonthValue();
    private int k = year%100;
    private int j = year/100;


    public CalculateDayService(){}

    public boolean isFriday(){
        int h = (day + ((13*(month+1))/5)+k+(k/4)+(j/4)-2*j)%7;
        int d =((h+5)%7)+1;
        return d == 5;
    }

    public String firdayString(){
        if(isFriday()){
            return "Yay it is Friday";
        }
        return "Ew it is not Friday";
    }

}
