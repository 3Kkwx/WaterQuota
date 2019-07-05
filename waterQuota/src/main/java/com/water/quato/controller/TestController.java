package com.water.quato.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sd")
public class TestController {
@RequestMapping("/getAnswer")
public String getAnswer(){
	return "shenzihua";
}
}
