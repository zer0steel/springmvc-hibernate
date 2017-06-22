package com.got.dao;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.got.domain.Reply;
import com.got.vo.PageVO;

@Repository
@Transactional
public class ReplyDao extends HibernateDaoSupport {
	
	@Inject
	public void init(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	@SuppressWarnings("unchecked")
	public List<Reply> selectByPostId(Integer postId) {
		return (List<Reply>) getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Reply.class).add(Restrictions.eq("postId", postId)));
	}
	
	public void insert(Reply Reply) {
		getHibernateTemplate().save(Reply);
	}
	
	public void deleteOne(Integer id) {
		getHibernateTemplate().delete(getHibernateTemplate().load(Reply.class, id));
	}
	
	public void updateOne(Reply r) {
		getHibernateTemplate().update(r);
	}
}
