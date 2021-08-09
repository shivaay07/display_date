package com.duttech.Display_Date_Assignment;

import java.util.Calendar;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		LocalDateTime myDateObj = LocalDateTime.now();  
	    System.out.println("Before Formatting: " + myDateObj);  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");  
	    
	    String myDate = myDateObj.format(myFormatObj);  
//		Date myDate = new Date();
		model.addAttribute("date", myDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalDateTime myDateObj = LocalDateTime.now();  
	    System.out.println("Before Formatting: " + myDateObj);  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("h:mm a");  
	    
	    String myTime = myDateObj.format(myFormatObj);  
//		Date myTime = c1.getTime();
		model.addAttribute("time", myTime);
		return "time.jsp";
	}
	
	
}
		
		



