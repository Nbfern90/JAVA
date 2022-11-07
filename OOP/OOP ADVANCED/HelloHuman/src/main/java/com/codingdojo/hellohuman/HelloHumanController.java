package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloHumanController {
    @RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String searchQuery,
            @RequestParam(value="last_name", required=false) String last_name,
            @RequestParam(value ="times", required=false) Integer number )
    {
        if(searchQuery == null) {
            return "Hello Human";
        }else {
            String myString = "";
            for(int i = 0; i<= number; i++ ) { 

            myString += "Hello " + searchQuery +" " + last_name + " ";
            }
            return myString;       
        }
        
    }

}