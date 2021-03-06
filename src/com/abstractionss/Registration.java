package com.abstractionss;

/*Create Registration Class in which you would have variables as email, 
userName and password that have an access scope only within its own class.
After creating an object of the class user should be able to call methods 
and in each method separately pass values to set users email, username and 
password. Requirements: 
A. Valid email consider to be only gmail
 B. Valid userName
and password cannot be empty and should be of length larger than 6 characters.
Also valid password cannot contain userName.*/

public class Registration {
private String  email;
private String userName;
private String password;


public void  setEmail( String  email) {
	if(email.endsWith("gmail.com")) {
		this.email=email;
	}else {
		System.out.println("please enter an email with gmail");
	}
	
}

public void  setUserName(String userName) {
	this.userName=userName;
	if(!userName.isEmpty()) {
		if(userName.length()>=6) {
			this.userName=userName;
		}else {
			System.out.println("the username can not be smaller than 6 char");
		}
		
	}else {
		System.out.println("username can not be empty ");
	}
}

public void  setPassword(String password) {
	
	if(!password.isEmpty()  ) {
		if(!password.contains(userName)) {
			if(password.length()>=6) {
				this.password=password;
			}else {
				System.out.println("password cant be smaller than 6");
			}}
			else {
				System.out.println("password can not contain username");
			}
		}
		
			else{
		System.out.println("Password can not be empty ");
	}
}
public String getEmail() {
	return email;
}
public String getUserName() {
	return userName;
}
public String getPassword() {
	return password;
}

}
