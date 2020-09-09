package com.example.demo.controllers;

import com.example.demo.services.dayOfTheWeek;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @GetMapping("/fredag")
    @ResponseBody
    public String returnDay(){

        dayOfTheWeek dayObj = new dayOfTheWeek();

        String hvilkenDagErDet = dayObj.whichDayIsIt();

        String erDetFredag;
        if (dayObj.isItFriday()==5){
            erDetFredag="Ja";
        } else {
            erDetFredag="Nej";
        }

        return hvilkenDagErDet;
    }

}
