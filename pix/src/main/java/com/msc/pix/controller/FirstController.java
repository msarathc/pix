package com.msc.pix.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.msc.pix.response.WelcomeResponse;

@RestController
@RequestMapping("/home")
public class FirstController {

	@RequestMapping(value="welcome", method=RequestMethod.GET)
	public String welcome(@RequestParam(value="who") String who){
		return "Welcome, "+ who + "!";
	}
	@RequestMapping(value="hello/{who}", method=RequestMethod.GET)
	public String hello(@PathVariable String who){
		return "Hello, "+ who + "!";
	}

	@RequestMapping(value="sayHello", method=RequestMethod.GET)
	public @ResponseBody WelcomeResponse sayHello(){
		WelcomeResponse welcomeResponse = new WelcomeResponse();
		welcomeResponse.setName("Sarath");
		welcomeResponse.setPhone("123456");
		return welcomeResponse;
	}


}
