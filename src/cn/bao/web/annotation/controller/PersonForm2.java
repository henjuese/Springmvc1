package cn.bao.web.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import cn.bao.web.annotation.model.Person;
import cn.bao.web.annotation.service.DummyService;

@Controller
@RequestMapping("/personForm2.htm")//路由
@SessionAttributes("person")
public class PersonForm2 {

	private final DummyService service;
	
	@Autowired
	public PersonForm2(DummyService service) { 
		this.service=service;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String setupForm(){
		return "personForm2";
	}
	
	//return new ModelAndView(new RedirectView("../index.jsp"));  // 采用重定向方式跳转页面
    // 重定向还有一种简单写法
    // return new ModelAndView("redirect:../index.jsp");
	//不管personForm2.jsp里面form表单里面name是多少，只要提交的表单值和person相同就会被转换成person对象
	@RequestMapping(method=RequestMethod.POST)//post请求
	public String processSubmit(Person person, BindingResult result, SessionStatus status) { 
		System.out.println(person.getName());
		this.service.savePerson(person);
		status.setComplete();
		return "redirect:personDisplay2.htm";//重定向
	}
}



















