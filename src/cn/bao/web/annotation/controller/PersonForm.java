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
@RequestMapping("/personForm.htm")//路由
@SessionAttributes("person")
public class PersonForm {

	private final DummyService service;
	
	@Autowired
	public PersonForm(DummyService service) { 
		this.service=service;
	}
	
	@RequestMapping(method=RequestMethod.GET)//get方法，需要出传入personId=?
	public String setupForm(@RequestParam("personId") int id, ModelMap model){
		Person person=this.service.retrievePerson(id);
		model.addAttribute("person", person);
		return "personForm";
	}
	
	//return new ModelAndView(new RedirectView("../index.jsp"));  // 采用重定向方式跳转页面
    // 重定向还有一种简单写法
    // return new ModelAndView("redirect:../index.jsp");
	@RequestMapping(method=RequestMethod.POST)//post请求
	public String processSubmit(@ModelAttribute("person") Person person, BindingResult result, SessionStatus status) { 
		this.service.savePerson(person);
		status.setComplete();
		return "redirect:personDisplay2.htm";//重定向
	}
}



















