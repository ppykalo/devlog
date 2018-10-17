package com.ppjr.devlog;

import javax.persistence.*;

@Entity
@Table(name="blog_post")
public class BlogPost {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	@Column(name="name")
	private String title;
	@Column(name="content")
	private String content;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
