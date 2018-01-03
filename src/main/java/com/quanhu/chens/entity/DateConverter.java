/**Created	by	chenshi  at	2018年1月2日 下午12:51:59*/
package com.quanhu.chens.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * @description:	DateConverter.java
 * @packageName:	com.quanhu.chens.entity
 * @projectName:	quanhu-springMVC1
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class DateConverter implements Converter<String, Date> {

	/**
	 * @description:convert(自定义的String转Date)
	 * @param date
	 * @return Date
	 */
	public Date convert(String date) {
		SimpleDateFormat simpleDateFormat = new 	SimpleDateFormat("yyyy-mm-dd");
		try {
			Date parse = simpleDateFormat.parse(date);
			return	parse;
		} catch (ParseException e) {
			e.printStackTrace();
			throw	new	RuntimeException("我自定义的日期类型转换异常");
		}
	}

}
