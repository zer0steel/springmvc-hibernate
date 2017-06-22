package com.got.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.got.dao.PostDao;
import com.got.domain.Post;
import com.got.vo.PageVO;

@Service
public class PostService {
	
	@Inject private PostDao postDao;

	public void createPost(Post p) {
		postDao.insert(p);
	}
	
	public void updatePost(Post p) {
		postDao.updateOne(p);
	}
	
	public Post getPost(Integer id) {
		return postDao.selectOne(id);
	}
	
	public List<Post> getPosts(int currPage) {
		return postDao.selectAll(new PageVO(postDao.selectRowCount(), currPage));
	}

	public void deletePost(Integer id) {
		postDao.deleteOne(id);
	}
}
