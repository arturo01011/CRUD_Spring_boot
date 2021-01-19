package com.mx.example.spring.boot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@GetMapping({"/index","/home","/",})	
public String home() {
	// TODO Auto-generated method stub
	return "home";
}
}
