package cn.bao.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWord  implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-------hello tgb-----");
		
		String hello = "lsh hello";
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("map1", "sdfsdf");
		map.put("map2", "sdfdf");
		map.put("map3", "sdfsdfffh");
		
		return new ModelAndView("/welcome","map",map);
	}

}
