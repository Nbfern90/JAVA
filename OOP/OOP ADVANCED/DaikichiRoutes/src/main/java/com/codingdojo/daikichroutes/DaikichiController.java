package com.codingdojo.daikichroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

	@RequestMapping(value="/today", method=RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value="/tommorrow", method=RequestMethod.GET)
	public String tommorrow() {
		return "Tomorrow, an opportnity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping(value="/{travel}/{Honolulu}",method=RequestMethod.GET)
	public String congrats(@PathVariable("travel") String travel, @PathVariable("Honolulu") String Honolulu) {
		return "Congratulations! You will soon " + travel + " to " + Honolulu;
	}
	
	
	@RequestMapping(value="/lotto/{num}",method=RequestMethod.GET)
	public String index(@PathVariable("num") Integer num) {
		if(num % 2 == 0 ) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}
	
	
	

}
