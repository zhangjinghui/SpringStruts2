package com.zjh.spring.actions;

import com.zjh.spring.service.UserService;

public class UserAction {
	private UserService service;

	public String execute() {
		System.out.println("execute...");
		service.add();
		return "success";
	}

	public void setService(UserService service) {
		this.service = service;
	}
}
