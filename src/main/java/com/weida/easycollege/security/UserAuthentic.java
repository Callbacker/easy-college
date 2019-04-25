package com.weida.easycollege.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserAuthentic implements Serializable,UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4867613903306792830L;

	private Integer userId ;
	
	private String phone ;
	
	private String password ;
	
	private Integer roleId ;
	
	private String roleName ;

	private List<String> roleList = new ArrayList<String>();
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();  
		 if(this.roleName != null) {
			 String[] roles = this.roleName.split(",");
		        for(String r : roles){  
		            if(r != null && !"".equals(r)){  
		                GrantedAuthority authority = new SimpleGrantedAuthority(r);  
		                authorities.add(authority);
		                roleList.add(r);
		            }  
		        } 
		 }
		 return authorities;
	}



	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return this.phone;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public List<String> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}
}
