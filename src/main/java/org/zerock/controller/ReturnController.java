package org.zerock.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.Member;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ret")
@Log4j
public class ReturnController {

	@RequestMapping("/a")
	public void methoda() {
		log.info("a method");
	}

	@RequestMapping("/b")
	public String methodb() {
		log.info("b method");
		log.info("a.jsp로 포워드합니다");
		return "/ret/a";
	}

	@RequestMapping("/c")
	@ResponseBody
	public String methodc() {
		log.info("c method");

		return "<h1>hello world</h1>";
	}

	@RequestMapping("/d")
	public String methodd(Model model) {
		log.info("d method");

		model.addAttribute("myAttr", "my-val");

		return "/ret/a";
	}

	@RequestMapping("/e")
	public String methode(Model model) {
		log.info("e method");

		Member mem = new Member();
		mem.setName("name");
		mem.setAge(17);

		model.addAttribute("member", mem);

		return "/ret/a";
	}

	@RequestMapping("/f")
	public String methodf(Model model) {
		log.info("f method");
		
		Member member = new Member();
		member.setName("seoul");
		member.setAge(1000);
		model.addAttribute(member);
		
		return "/ret/a";
	}
	
	@RequestMapping("/g")
	public String methodg(Model model) {
		log.info("g method");
		
		String[] strs = new String[] {"seoul", "jeju", "korea" };
		
		model.addAttribute("strs", strs);
		
		return "/ret/b";
	}
	
	@RequestMapping("/h")
	public String methodh(Model model) {
		log.info("h method");
		
		Member m1 = new Member();
		m1.setName("seoul");
		m1.setAge(22);
		
		Member m2 = new Member();
		m2.setName("jeju");
		m2.setAge(40);
		
		List<Member> list = new ArrayList<Member>();
		list.add(m1);
		list.add(m2);
		
		model.addAttribute("memList", list);
		
		return "/ret/b";
	}
	
	// /i?name=jeju
	@RequestMapping("/i")
	public String methodi(@ModelAttribute("name") String name) {
		log.info("i method");	
		log.info(name);
		
		return "/ret/c";
	}
	
	// /j?name=seoul&age=88
	@RequestMapping("/j")
	public String methodj(Member member) {
		log.info("j method");
		
		return "/ret/c";
	}
	
	// /k?name=seoul&age=77
	@RequestMapping("/k")
	public String methodk(@ModelAttribute("mem") Member member) {
		log.info("k method");
		
		return "/ret/c";
	}
}