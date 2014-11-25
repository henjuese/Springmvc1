package cn.bao.web.annotation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.bao.web.annotation.model.Person;
import cn.bao.web.annotation.service.DummyService;

@RestController//rest风格的注册+控制器
@RequestMapping("/rest2")
public class PersonDisplay_rest2 {

	private final DummyService service;
	
	@Autowired
	public PersonDisplay_rest2(DummyService service){
		this.service=service;
	}
	
	 @RequestMapping("/index")
    public String index(HttpServletRequest request ,HttpServletResponse response){  
        return "Hello,This is a example of Spring3 RESTful!";  
    }  
	
	@RequestMapping("/personlist")
	public List<Person> defaultHandler(HttpServletRequest request ,HttpServletResponse response){
		return this.service.getPsersonList();
	}
	
	 @RequestMapping(value="/personlist2",method=RequestMethod.GET)
	public List<Person> defaultHandler2(HttpServletRequest request ,HttpServletResponse response){
		return this.service.getPsersonList();
	}
	
	
}
