package org.ssm.dufy.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssm.dufy.dao.ClassesDao;
import org.ssm.dufy.entity.Classes;

@RequestMapping("test")
@Controller
public class TestController {
	
	@Autowired
	private ClassesDao classesDao;
	
	@RequestMapping(value="/index")
	public void index(){
		System.out.println("=============== test/index");
	}
	
	@RequestMapping(value="/getClassByCid")
	public void getClassByCid(int id){
		List<Classes> class1 = classesDao.getClass4();
//		System.out.println("class:"+class1.getName());
//		System.out.println("teacher:"+class1.getTeacher().getName());
	}
}
