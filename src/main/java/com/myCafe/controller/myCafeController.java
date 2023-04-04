package com.myCafe.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myCafe.DTO.foodOrder;
import com.myCafe.service.MyCafeServiceImpl;


@Controller
public class myCafeController {
	@Autowired
	private MyCafeServiceImpl myCafeServiceImpl;
	

	@RequestMapping("placeOrder")
	public String placeOrder( HttpServletRequest request,ModelMap model) {
	
		return "placeOrder";
	}
	
	@RequestMapping("processOrder")
	public String orderProcessed(HttpServletRequest request, ModelMap model) {
		String userEnteredValue = request.getParameter("foodType");
		model.addAttribute("userInput", userEnteredValue);
		myCafeServiceImpl.saveData(userEnteredValue);
		return "processOrder";
	}

	@ResponseBody
	@RequestMapping("allOrder")
	public String allOrder() {
		List<foodOrder> list = myCafeServiceImpl.allOrder();
		
		return list.toString();
	}

	
	
}
