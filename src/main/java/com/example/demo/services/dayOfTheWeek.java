package com.example.demo.services;

import java.time.LocalDate;

public class dayOfTheWeek {
    public dayOfTheWeek(){}

    LocalDate myDateObj = LocalDate.now();

    int q = myDateObj.getDayOfMonth();
    int m = myDateObj.getMonthValue();
    int j = myDateObj.getYear()/100;
    int k = myDateObj.getYear()%100;

    public int isItFriday(){
        if(m<3){
            m += 12;
            k -= 1;
        }
        int h=(q+(13*(m+1)/5)+k+(k/4)+(j/4)-2*j%7);
        int d = ((h+5)%7)+1;

        return d;
    }

    public String whichDayIsIt(){
        if(m<3){
            m += 12;
            k -= 1;
        }
        int h=(q+(13*(m+1)/5)+k+(k/4)+(j/4)-2*j%7);
        int d = ((h+5)%7)+1;

        String weekDay = "error";
        switch(d){
            case 1: weekDay="Mandag";
                break;
            case 2: weekDay="Tirsdag";
                break;
            case 3: weekDay="Onsdag";
                break;
            case 4: weekDay="Torsdag";
                break;
            case 5: weekDay="Fredag";
                break;
            case 6: weekDay="Lørdag";
                break;
            case 7: weekDay="Søndag";
                break;
        }
        return weekDay;
    }

}
