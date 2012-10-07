package com.examples.srini;

public class Note {
	public Note(String to2, String from2, String heading2, String body2) {
		this.to = to2;
		this.from = from2;
		this.heading = heading2;
		this.body = body2;
		
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	private String to;
	private String from;
	private String heading;
	private String body;
	
}
