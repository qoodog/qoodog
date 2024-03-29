package com.fm.www.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	
	/*
	 * main 컨트롤러
	 * main 창 띄우기
	 * GET
	 * */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainGet() {		
		return "common/main";
	}
}
