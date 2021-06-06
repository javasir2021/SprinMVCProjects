package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestContoller {

	@RequestMapping("/")
	public String getMEthod1()
	{
		return "firstJSP";
	}
}
