package com.indiatour.etour.modal;

import java.util.Set;

public class LoginRespons {

	boolean accessToken;
	int cust_Id;
	String email;
//	Set<Role> roles;
//	Role roles;
	String roles;
	String password;
	
	public boolean isAccessToken() {
		return accessToken;
	}
	public void setAccessToken(boolean accessToken) {
		this.accessToken = accessToken;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCust_Id() {
		return cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public Set<Role> getRoles() {
//		return roles;
//	}
//	public void setRoles(Set<Role> roles) {
//		this.roles = roles;
//	}
//	public Role getRoles() {
//		return roles;
//	}
//	public void setRoles(Role roles) {
//		this.roles = roles;
//	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
}
