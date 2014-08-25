package cn.edu.cust.rbac.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	private int userId;
	private String username;
	private String password;
	private String roles;
	/**组织编号*/
	private String orgcode;
	
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getOrgcode() {
		return orgcode;
	}
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}
	
	public void setFields(ResultSet rs) throws SQLException {
		userId = rs.getInt("c_userId");
		username=rs.getString("c_username");
		password=rs.getString("c_password");
		roles = rs.getString("c_roles");
		orgcode=rs.getString("c_orgcode");
	}

}
