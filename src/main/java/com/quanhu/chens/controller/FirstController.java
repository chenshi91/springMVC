/**Created	by	chenshi  at	2018年1月1日 下午5:11:16*/
package com.quanhu.chens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description:	FirstController.java
 * @packageName:	com.quanhu.chens.controller
 * @projectName:	quanhu-springMVC1
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
@Controller
@RequestMapping(value="/chens")
public class FirstController {
	
	@RequestMapping(value="/login",method={RequestMethod.GET})
	public	String login(){
		System.out.println("------springMVC  success	login-----------");
		return	"index";
	}
	
	@RequestMapping(value="/regist",method=RequestMethod.POST)
	public	String regist(){
		System.out.println("------springMVC  success	regist-----------");
		return	"index";
	}

}
