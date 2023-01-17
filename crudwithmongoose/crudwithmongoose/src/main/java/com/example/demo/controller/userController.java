package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.userinfo;
import com.example.demo.repository.userreposit;

@RestController
public class userController {
	@Autowired
	userreposit userreposit;

	@RequestMapping(path = "/save",method = RequestMethod.POST)
	public String saveuser(@RequestBody userinfo us) {
		userreposit.save(us);
		return "user is added";
	}
	@RequestMapping(path = "/get",method = RequestMethod.GET)
	public List<userinfo> getusers() {
		
		return userreposit.findAll();
	}
	@RequestMapping(path = "/update",method = RequestMethod.POST)
	public String updateuser(@RequestBody userinfo us) {
		userreposit.save(us);
		return "user is added";
	}
	@RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE)
	public String deleteuser(@PathVariable String id) {
		userreposit.deleteById(id);
		return "user is added";
	}
}
