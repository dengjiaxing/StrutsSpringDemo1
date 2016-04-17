package com.integration;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWord extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "SUCCESS";
	}
}
