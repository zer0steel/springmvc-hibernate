package com.got.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "reply")
public class Reply {
	
	@Id
	@SequenceGenerator(name = "pk", sequenceName = "reply_seq", allocationSize = 1)
	@GeneratedValue(generator = "pk")
	private Integer id;
	
	private String content;
	
	@CreationTimestamp
	private Timestamp regdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", content=" + content + ", regdate=" + regdate + "]";
	}
	
}
