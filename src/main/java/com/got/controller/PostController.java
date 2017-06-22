package com.got.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.got.domain.Post;
import com.got.service.PostService;

@Controller
public class PostController {

	@Inject private PostService postService;
	
	@RequestMapping("list.do")
	public ModelAndView list(@RequestParam(name = "currPage", defaultValue = "1") int currPage) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", postService.getPosts(currPage));
		mav.setViewName("list");
		return mav;
	}
	
	@RequestMapping(value = "insert.do", method = RequestMethod.GET)
	public void insertForm() {}
	
	@RequestMapping(value = "insert.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(Post post) {
		postService.createPost(post);
		return new ModelAndView("redirect:/list.do");
	}
	
	@RequestMapping(value = "detail.do")
	public void detail(Model model, Integer id) {
		model.addAttribute("p", postService.getPost(id));
	}
	
	@RequestMapping(value = "delete.do")
	public ModelAndView delete(Integer id) {
		postService.deletePost(id);
		return new ModelAndView("redirect:/list.do");
	}
}
