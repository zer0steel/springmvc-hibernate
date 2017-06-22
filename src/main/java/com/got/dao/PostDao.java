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

import com.got.domain.Post;
import com.got.vo.PageVO;

@Repository
@Transactional
public class PostDao extends HibernateDaoSupport {
	
	@Inject
	public void init(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Post> selectAll(PageVO page) {
		return getHibernateTemplate().execute(session -> {
			Query<Post> query = session.createQuery("FROM Post ORDER BY id DESC");
			query.setFirstResult(page.getStart());
			query.setMaxResults(page.getShowRecordCount());
			return query.list();
		});
	}
	
	@Transactional(readOnly = true)
	public Post selectOne(Integer id) {
		Post post = getHibernateTemplate().get(Post.class, id);
		Hibernate.initialize(post.getReplys());
		return post;
	}
	
	@Transactional(readOnly = true)
	public int selectRowCount() {
		return getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Post.class)).size();
	}
	
	public void insert(Post post) {
		getHibernateTemplate().save(post);
	}
	
	public void deleteOne(Integer id) {
		getHibernateTemplate().delete(getHibernateTemplate().load(Post.class, id));
	}
	
	public void updateOne(Post p) {
		getHibernateTemplate().update(p);
	}
}
