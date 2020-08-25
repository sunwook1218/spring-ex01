package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

/*
 * @Controller <- @Component의 역할을 하면서 Spring이 이 Bean을 특별하게 취급
 */

@Controller
@RequestMapping("/my/*")
@Log4j
public class MyController {
	
	@RequestMapping("")
	public void myHandler1() {
		log.info("my controller is working.....");
	}
	
	@RequestMapping("/a")
	public void myHandler2() {
		log.info("my controller is working2.....");
	}
	
	@RequestMapping("/b")
	public void myHandler3() {
		log.info("my handler3 is working (3)");
	}
	
	@RequestMapping("/c")
	public void myHandler4() {
		log.info("my handler4 is working (4)");
	}
	
}