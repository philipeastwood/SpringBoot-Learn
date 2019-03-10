package com.os.china.controller;

import com.os.china.dao.PersonDao;
import com.os.china.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangPengFei
 * @Discription
 * @Data 2017-3-17
 * @Version 1.0.0
 */
@RestController
@Slf4j
public class RedisController {

	@Autowired
	private PersonDao personDao;

	@RequestMapping("/set")
    @ResponseBody
	public String set(){
		Person person = new Person("001", "Array", 22);
		personDao.save(person);
		personDao.stringRedisTemplateDemo();
		log.info(person.getId().toString());
        return person.getName().toString();

	}

	@RequestMapping("/getStr")
	public String getStr(){
		return personDao.getString();
	}

	@RequestMapping("/getPerson")
	public Person getPerson(){
		return personDao.getPerson();
	}
}
