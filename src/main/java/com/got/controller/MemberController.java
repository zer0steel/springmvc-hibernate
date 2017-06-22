package com.got.controller;

import java.util.Enumeration;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.got.domain.Member;
import com.got.service.MemberService;
import com.got.vo.UserContainer;
import com.got.vo.UserVO;

@Controller
public class MemberController {
	
	@Inject private MemberService service;

	@RequestMapping(value = "join.do", method = RequestMethod.GET)
	public void joinForm() {}
	
	@RequestMapping(value = "join.do", method = RequestMethod.POST)
	public ModelAndView joinSubmit(Member m) {
		service.createMember(m);
		return new ModelAndView("redirect:/list.do");
	}
	
	@ResponseBody
	@RequestMapping(value = "ajax.do", method = RequestMethod.POST)
	public void test(HttpServletRequest req, UserContainer users) {
		Enumeration<String> names = req.getParameterNames();
		while(names.hasMoreElements())
			System.out.println(names.nextElement());
		System.out.println("옴");
	}
}
