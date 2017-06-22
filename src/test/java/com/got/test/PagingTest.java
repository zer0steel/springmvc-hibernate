package com.got.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.got.vo.PageVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class PagingTest {
	
	@Test
	public void page() {
		PageVO page = new PageVO(54, 1);
		System.out.println(page);
		page = new PageVO(54, 2);
		System.out.println(page);
		page = new PageVO(54, 3);
		System.out.println(page);
		page = new PageVO(54, 4);
		System.out.println(page);
	}
}
