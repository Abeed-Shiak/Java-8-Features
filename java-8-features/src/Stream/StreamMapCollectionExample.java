package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollectionExample {
       public static void main(String[] args) {
    	   
    	   List<User>users = new ArrayList<>();
    	   users.add(new User(1, "abid", "secret", "abid@123"));
    	   users.add(new User(2, "alone", "secret", "alone@567"));
    	   users.add(new User(3, "king", "secret", "king@99"));
    	   
    	   
    	   List<UserDto>userDto = new ArrayList<UserDto>();
    	   for(User user :users) {
    		      userDto.add(new UserDto(user.getId(),user.getUserName(),user.getEmail()));
    		   }
    	   
    	   for(UserDto dto : userDto) {
    		   System.out.println(dto);
    	   }
    	   //using stream 
    	   List<UserDto>usersDto=  users.stream().map((User user)-> 
				 new UserDto(user.getId(),user.getUserName(), user.getEmail()))
    	        .collect(Collectors.toList());
    	   
    	   usersDto.forEach(System.out::println);
		  	   
    	   
	}
}

class UserDto{
	private int id;
	private String userName;
	private String email;
	
	public UserDto(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	
}
class User{
	private int id;
	private String userName;
	private String password;
	private String email;
	
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
}