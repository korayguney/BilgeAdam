package ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entity.User;

@Path("UserService")
public class UserService {
	
	@GET
	@Path("getUserbyId/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserbyId(@PathParam("userId") int id) {
	
		Map<Integer, User> map = new HashMap<Integer, User>();
		map.put(1, new User(1, "Ali", "Veli"));
		map.put(2, new User(2, "Fatma", "Korkmaz"));
		map.put(3, new User(3, "Ayþe", "Türkmen"));
		
		return map.get(id);
	}
	
	@GET
	@Path("getAllUsers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers() {
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Ali", "Veli"));
		users.add(new User(2, "Fatma", "Korkmaz"));
		users.add(new User(3, "Ayþe", "Türkmen"));
		
		return users;
	}
	
}
