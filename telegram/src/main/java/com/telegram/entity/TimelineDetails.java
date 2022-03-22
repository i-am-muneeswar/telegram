package com.telegram.entity;

public class TimelineDetails {
	
	private String messageid;
	private String sender;
	private String reciever;
	private String message;
	private String date;
	
	public String getMessageid() {
		return messageid;
	}
	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReciever() {
		return reciever;
	}
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}

}
