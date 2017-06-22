package com.got.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Hibernate;
import org.hibernate.LockOptions;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.got.domain.Member;
import com.got.domain.Post;
import com.got.vo.PageVO;

@Repository
@Transactional
public class MemberDao extends HibernateDaoSupport {
	
	@Inject
	public void init(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	public void insert(Member m) {
		getHibernateTemplate().save(m);
	}
}
