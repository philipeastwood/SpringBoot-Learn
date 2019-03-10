package com.os.china.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZhangPengFei
 * @Discription
 * @Data 2017-3-16
 * @Version 1.0.0
 */
@Data
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Integer age;

	public Person() {
		super();
	}

	public Person(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
