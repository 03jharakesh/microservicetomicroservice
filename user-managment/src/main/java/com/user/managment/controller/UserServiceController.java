package com.user.managment.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.managment.model.User;

@RestController
public class UserServiceController {

	
	private static Map<String, List<User>> userDB = new HashMap<String, List<User>>();
	
	static {
		userDB = new HashMap<String, List<User>>();

		List<User> lst = new ArrayList<User>();
		User std = new User("Sajal", "atos");
		lst.add(std);
		std = new User("Lokesh", "atos-syntel");
		lst.add(std);

		userDB.put("atos", lst);

		lst = new ArrayList<User>();
		std = new User("Kajal", "hexaware");
		lst.add(std);
		std = new User("Sukesh", "hexaware");
		lst.add(std);

		userDB.put("hexaware", lst);

	}
	
	@RequestMapping(value = "/getuserdetail/{oragname}", method = RequestMethod.GET)
	public List<User> getUser(@PathVariable String oragname) {
		System.out.println("Getting user details for " + oragname);

		List<User> userList = userDB.get(oragname);
		if (userList == null) {
			userList = new ArrayList<User>();
			User std = new User("Not Found", "N/A");
			userList.add(std);
		}
		return userList;
	}
}
