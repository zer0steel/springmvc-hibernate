package com.got.util;

import java.util.ArrayList;
import java.util.List;

import com.got.domain.Post;

public class DomainUtil {

	public static List<Post> createPosts(int count) {
		List<Post> posts = new ArrayList<>();
		for(int i = 0; i < count; i++) {
			Post p = new Post();
			p.setTitle("제목 - " + i);
			p.setContent("내용 - " + i);
			p.setWriter("글쓴이 - " + i);
			posts.add(p);
		}
		return posts;
	}
}
