package cn.bao.web.annotation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bao.web.annotation.model.Person;
import cn.bao.web.annotation.service.DummyService;

@Controller
@RequestMapping("/rest")
public class PersonDisplay_rest {

	private final DummyService service;
	
	@Autowired
	public PersonDisplay_rest(DummyService service){
		this.service=service;
	}
	
	 @RequestMapping("/index")  
	 @ResponseBody//加了则个东西后，return返回的是index.jsp这个字，而不是定向到index.jsp
    public String index(HttpServletRequest request ,HttpServletResponse response){  
        //
        request.setAttribute("message", "Hello,This is a example of Spring3 RESTful!");  
        return "index.jsp";  
    }  
	//这种是rest返回格式，当访问/rest/personlist的时候返回的一串json格式，而不是某个具体的页面
	@RequestMapping("/personlist")
	@ResponseBody//将数据返回json格式
	public List<Person> defaultHandler(HttpServletRequest request ,HttpServletResponse response){
		return this.service.getPsersonList();
	}
	
	
}
