package com.userspring.userspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.userspring.userspring.UserRepository;
import com.userspring.userspring.User;

import java.util.List;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;



	/*@GetMapping("/user")
	public String user(@RequestParam(name="nom", required=false, defaultValue="Bienvenue ") String nom, Model model) {
		model.addAttribute("nom", nom);
		return "user";

	}*/
	
	@GetMapping("/User")
	public String getAllUsers(Model model){
		Iterable<User> userList =  userRepository.findAll();

		model.addAttribute("listUser",userList);
		
		return "index";
	}
	
	
}