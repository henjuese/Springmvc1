package cn.bao.web.annotation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.bao.web.annotation.model.Person;

@Service
public class DummyService {

	//
	public List<Person> getPsersonList(){
		List<Person> list=new ArrayList<Person>();
		Person p1=new Person();
		p1.setId(1);
		p1.setName("baowen");
		p1.setAge(10);
		p1.setAddress("kunming");
		
		Person p2=new Person();
		p2.setId(3);
		p2.setName("baowen2");
		p2.setAge(12);
		p2.setAddress("kunming2");
		
		list.add(p1);
		list.add(p2);
		return list;
	}
	
	//根据id获取值
	public Person retrievePerson(int id) { 
	        Person person = new Person(); 
	        person.setId(56789); 
	        person.setName("Nikki"); 
	        person.setAge(63); 
	        person.setAddress("Dalaguete, Cebu"); 
	        return person; 
    } 
	
	//保存
	public void savePerson(Person person){
		System.out.println(person.toString());
	}
	
}


















