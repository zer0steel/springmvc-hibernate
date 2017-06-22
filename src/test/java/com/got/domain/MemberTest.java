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

import com.got.dao.MemberDao;
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
public class MemberTest {
	
	@Inject MemberDao dao;
	
	@Before
	public void setup() {
	}
	
	@After
	public void print() {
		System.out.println();
	}
	
	@Test
	public void insert() {
		PrintUtil.print("insert");
		Member m = new Member();
		m.setMemberId("jyc228");
		m.setPwd("1234");
		dao.insert(m);
	}
	
	@Test 
	public void selectOne() {
		PrintUtil.print("selectOne");
	}
	
	@Test
	public void selectAll() {
		PrintUtil.print("selectAll");
	}
}
