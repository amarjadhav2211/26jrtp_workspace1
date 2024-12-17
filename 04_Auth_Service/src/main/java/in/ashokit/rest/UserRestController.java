package in.ashokit.rest;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.constants.AppConstants;
import in.ashokit.entity.User;
import in.ashokit.props.AppProperties;
import in.ashokit.response.ApiResponse;
import in.ashokit.service.UserServiceI;


@RestController
public class UserRestController {
	
	private static final Logger log=LoggerFactory.getLogger(UserRestController.class);
	@Autowired
	private UserServiceI userService;
	@Autowired
	private AppProperties props;
	
	@PostMapping("/register")
	public ResponseEntity<ApiResponse<User>> createUser(@RequestParam("user") String userJson,@RequestParam("file") MultipartFile file) throws Exception
	{	
		log.info("User Registration started");
		Map<String, String> messages = props.getMessages();
		ApiResponse<User> response=new ApiResponse<>();
		ObjectMapper mapper=new ObjectMapper();
		User user = mapper.readValue(userJson, User.class);
		User addedUser = userService.addUser(user, file);
		if(addedUser!=null)
		{
			response.setStatus(201);
			response.setMessage(messages.get(AppConstants.USER_REG));
			response.setData(addedUser);
		}
		else
		{
			log.error("User Registration failed");
			response.setStatus(500);
			response.setMessage(messages.get(AppConstants.USER_REG_Err));
		}
		log.info("User Registration ended");
		return new ResponseEntity<ApiResponse<User>>(response,HttpStatus.CREATED);
	}
	@PostMapping("/login")
	public ResponseEntity<ApiResponse<User>> login(@RequestBody User user)
	{
		log.info("User login started");
		Map<String, String> messages = props.getMessages();
		ApiResponse<User> response=new ApiResponse<>();
		User loginuser = userService.login(user);
		if(loginuser!=null)
		{
			response.setStatus(200);
			response.setMessage(messages.get(AppConstants.LOGIN));
			response.setData(loginuser);
		}
		else {
			log.error("User login failed");
			response.setStatus(500);
			response.setMessage(messages.get(AppConstants.Login_Err));

		}
		log.info("User login ended");
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
}
