package cn.bao.web.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bao.web.annotation.service.DummyService;

@Controller
public class PersonDisplay {

	private final DummyService service;
	
	@Autowired
	public PersonDisplay(DummyService service){
		this.service=service;
	}
	
	//这里配置要返回的页面，文件的后缀可以随便写，它最终对应的是spring-servlet.xml配置文件里面的，返回试图为jsp文件下面的后缀为jsp的文件
	//这里最终返回的是personDisplay2.jsp，这里属于伪静态
	@RequestMapping("/personDisplay2.htm")
	public ModelMap defaultHandler(){
		return new ModelMap("personlist",this.service.getPsersonList());
	}
	
	
}
