package com.example.jobSearch.models;


import javax.persistence.*;

@Entity
@Table(name="Greeting")
public class Greeting {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private final long id;
	@Column(name="name", length=50, nullable=false)
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
