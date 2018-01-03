/**Created	by	chenshi  at	2018年1月1日 下午6:49:32*/
package com.quanhu.chens.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:	ParamControal.java
 * @packageName:	com.quanhu.chens.controller
 * @projectName:	quanhu-springMVC1
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
@Controller
@RequestMapping(value="/param")
public class ParamControal {
	
	@RequestMapping(value="param1")
	public	String	param1(HttpServletRequest	request){
		String parameter = request.getParameter("userName");
		System.out.println("userName:"+parameter);
		return	"forward:/index.jsp";
	}
	
	@RequestMapping(value="param2")
	public	String	param2(HttpServletRequest	request,HttpServletResponse 	response){
		System.out.println("------param2---------");
		request.setAttribute("name", "java高级开发");
		return	"forward:/index.jsp";
	}
	
	@RequestMapping(value="param3")
	public	String	param3(HttpSession	session){
		System.out.println("------param3---------");
		return	"redirect:/param/param2.do";
	}
}
