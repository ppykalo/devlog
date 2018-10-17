package com.ppjr.devlog;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
	
//	@Autowired
//	private SessionFactory sessionFactory;
	
//	public void createBlogPost(BlogPost blogPost) {
//		Session session = null;
//		try {
//			session = sessionFactory.openSession();
//			session.beginTransaction();
//			Integer id = (Integer) session.save(blogPost);
//			System.out.println("BlogPost is created with Id = " + id);
//			session.getTransaction().commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
