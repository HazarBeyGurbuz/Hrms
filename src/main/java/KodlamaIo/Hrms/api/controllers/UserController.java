package KodlamaIo.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.UserService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.entities.abstracts.User;

@RestController
@RequestMapping("api/users")
public class UserController {

	UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/getall")
	public DataResult<List<User>> getAll() {
		return userService.getAll();
	}

}
