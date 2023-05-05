package com.Ankit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class Addcontroller {
	
	@RequestMapping("/add")
	public String add()
	{
		System.out.print("I am here ");
		
		return "display.jsp";
	}
	
}
