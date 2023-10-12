package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	@GetMapping("/homePage")
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
}
