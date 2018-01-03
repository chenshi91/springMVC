/**Created	by	chenshi  at	2018年1月3日 下午1:59:41*/
package com.quanhu.chens.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @description:	ModelControal.java
 * @packageName:	com.quanhu.chens.controller
 * @projectName:	quanhu-springMVC1
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */

@Controller
@RequestMapping(value="/model")
@SessionAttributes(value={"name","age"})
public class ModelControal {

	@RequestMapping(value="m1",method=RequestMethod.GET)
	public	String	m1(Model model,HttpServletRequest request){
		model.addAttribute("name", "jquery网页前端开发");
		model.addAttribute("age", 10);
		request.setAttribute("name", "c++高级开发");
		request.setAttribute("age", 15);
		System.out.println("request 存储:"+request.getAttribute("name")+request.getAttribute("age"));
		return	"forward:/index.jsp";
	}
	
	@RequestMapping(value="m2",method=RequestMethod.GET)
	public	String	m2(ModelMap modelMap){
		modelMap.addAttribute("name", "sql数据库管理");
		modelMap.addAttribute("age", 18);
		return	"index";
	}
}
