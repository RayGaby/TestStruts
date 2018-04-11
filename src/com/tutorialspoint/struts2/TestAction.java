package com.tutorialspoint.struts2;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class TestAction extends ActionSupport{
	//private HttpServletRequest request;
	
	public String add(){
		//request.setAttribute("path","update");
		return "add";
	}
	public String update(){
		System.out.println("Ö´ÐÐupdate.jsp");
		return "update";
	}
	@Override
	public String execute() throws Exception {
		System.out.println("Ö´ÐÐtest.jsp");
		return SUCCESS;
	}

}
