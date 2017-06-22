package com.got.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.got.dao.MemberDao;
import com.got.dao.PostDao;
import com.got.domain.Member;
import com.got.domain.Post;
import com.got.vo.PageVO;

@Service
public class MemberService {
	
	@Inject private MemberDao dao;

	public void createMember(Member m) {
		dao.insert(m);
	}
}
