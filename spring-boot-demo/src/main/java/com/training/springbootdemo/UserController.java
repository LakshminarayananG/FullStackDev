package com.training.springbootdemo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController  {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping
	public Iterable<User> findAllUsers(){
		return userRepository.findAll();
	}
	
	
	@GetMapping("{/id}")
	public Object findUserById(@PathVariable int id) throws UserNotFoundException {
		
		Optional<User> findById=userRepository.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}else throw new UserNotFoundException("User not found"); 
	}
	
	@PostMapping()
	public String addUser(@RequestBody User user) {
			userRepository.save(user);
			return "New User Created";
	}
	
	@PutMapping
	public String updateUser(@RequestBody User user) {
		userRepository.save(user);
		return "User details Updated";
	}
	
	@PatchMapping
	public String partialUpdateUser(@RequestBody User user) {
		userRepository.save(user);
		return "Partial Update done";
	}
	
	@DeleteMapping("{/id}")
	public String deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
		return "User with id "+id +"Deleted";
	}
	
	/*
	 * @DeleteMapping public String deleteUsingRequest(@RequestParam int id) {
	 * userRepository.deleteById(id); return "User Deleted"; }
	 */
	
	
	

}
