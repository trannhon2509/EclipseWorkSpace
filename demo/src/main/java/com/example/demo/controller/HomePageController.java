package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.model.MemberExample;



@RestController
public class HomePageController {
	 
	@Autowired
	MemberMapper memebermapper;
	
	 @GetMapping("/data")
	    public String getData() {
		 MemberExample example = new MemberExample();
		 List list = memebermapper.selectByExample(example);
		 
		 System.out.println(list.size());
	        return "View";
	    }	 
}
