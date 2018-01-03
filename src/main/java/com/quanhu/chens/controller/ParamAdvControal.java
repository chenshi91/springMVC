/**Created	by	chenshi  at	2018年1月1日 下午6:49:32*/
package com.quanhu.chens.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.quanhu.chens.entity.User;
import com.quanhu.chens.entity.UserDto;

/**
 * @description:	ParamControal.java
 * @packageName:	com.quanhu.chens.controller
 * @projectName:	quanhu-springMVC1
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
@Controller
@RequestMapping(value="/paramadv")
public class ParamAdvControal {
	
	@RequestMapping(value="param1")
	public	String	param1(String	name){
		System.out.println("--------基本数据类型传参------------");
		System.out.println("name:"+name);
		return	"forward:/index.jsp";
	}
	
	@RequestMapping(value="param2")
	public	String	param2(@RequestParam("name")String n,@RequestParam("age")int a){
		System.out.println("--------注解传参------------");
		System.out.println("name:"+n+",age:"+a);
		return	"forward:/index.jsp";
	}
	
	@RequestMapping(value="param3",method=RequestMethod.POST)
	public	String	param2(User	user){
		System.out.println("--------对象传参------------");
		System.out.println("user   userName:"+user.getUserName());
		System.out.println("user   passWord:"+user.getPassWord());
		System.out.println("user   city:"+user.getAddr().getCity());
		System.out.println("user   street:"+user.getAddr().getStreet());
		return	"forward:/index.jsp";
	}
	
	@RequestMapping(value="param4",method=RequestMethod.POST)
	public	String	param4(String[]	ids){
		System.out.println("--------数组传参------------");
		for (String string : ids) {
			System.out.println("id:"+string);
		}
		return	"forward:/index.jsp";
	}
	
	@RequestMapping(value="param5",method=RequestMethod.POST)
	public	String	param5(UserDto userList){
		System.out.println("--------集合list传参------------");
		List<User> list = userList.getUserList();
		for (User user : list) {
			System.out.println("user   userName:"+user.getUserName());
			System.out.println("user   passWord:"+user.getPassWord());
			System.out.println("user   city:"+user.getAddr().getCity());
			System.out.println("user   street:"+user.getAddr().getStreet());
			System.out.println();
		}
		return	"forward:/index.jsp";
	}
	
	@RequestMapping(value="/param6",method=RequestMethod.POST)
	public	String	papam6(User user){
		System.out.println("--------日期转换传参------------");
		System.out.println("user   userName:"+user.getUserName());
		System.out.println("user   passWord:"+user.getPassWord());
		System.out.println("user   birthday:"+user.getBirthday());
		System.out.println("user   city:"+user.getAddr().getCity());
		System.out.println("user   street:"+user.getAddr().getStreet());
		System.out.println();
		return	"index";
	}
	
}
