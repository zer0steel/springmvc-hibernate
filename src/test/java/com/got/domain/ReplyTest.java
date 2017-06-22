package com.got.domain;


import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.got.dao.ReplyDao;
import com.got.service.PostService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class ReplyTest {
	
	@Inject ReplyDao replyDao;
	@Inject PostService postService;
	
	@Test
	public void insert() {
		Integer postId = postService.getPosts(1).get(0).getId();
		Reply r = new Reply();
//		r.setPostId(postId);
		r.setContent("테스트");
		replyDao.insert(r);
		
		replyDao.selectByPostId(postId).forEach(System.out::println);;
	}
}
