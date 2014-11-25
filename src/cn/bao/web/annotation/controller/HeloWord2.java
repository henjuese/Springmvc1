package cn.bao.web.annotation.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//1.注册改类为mvc的控制器
@Controller
public class HeloWord2 {

	//2.路由
	@RequestMapping("/test1/helloword2") 
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-------hello tgb-----");
		
		String hello = "lsh hello 你好";
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("map1", "bao");
		map.put("map2", "问");
		map.put("map3", "哈哈");
		
		return new ModelAndView("/welcome","map",map);
	}

}
