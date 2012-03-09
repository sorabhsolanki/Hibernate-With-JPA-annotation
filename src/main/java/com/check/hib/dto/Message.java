package com.check.hib.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MESSAGE")
public class Message {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private Long id;
	
	@Column(name="MESSAGE_TEXT")
	private String messageText;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}	
	
	
}
