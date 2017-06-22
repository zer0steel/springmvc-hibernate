package com.got.domain;

import java.util.List;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.got.dao.PostDao;
import com.got.domain.Post;
import com.got.service.PostService;
import com.got.util.DomainUtil;
import com.got.util.PrintUtil;
import com.got.vo.PageVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class PostTest {
	
	@Inject PostService postService;
	@Inject PostDao dao;
	List<Post> mockPosts;
	List<Post> posts;
	
	@Before
	public void setup() {
		mockPosts = DomainUtil.createPosts(10);
	}
	
	@After
	public void print() {
		System.out.println();
	}
	
	@Test
	public void insert() {
		PrintUtil.print("insert");
//		postService.createPost(mockPosts.get(3));
//		List<Post> list = dao.selectAll(new PageVO(dao.selectRowCount(), 1));
//		list.forEach(System.out::println);
	}
	
	@Test 
	public void selectOne() {
		PrintUtil.print("selectOne");
		Post post = postService.getPost(36);
		System.out.println(post);
	}
	
	@Test
	public void selectAll() {
		PrintUtil.print("selectAll");
		List<Post> list = dao.selectAll(new PageVO(dao.selectRowCount(), 1));
		list.forEach(System.out::println);
	}
}
