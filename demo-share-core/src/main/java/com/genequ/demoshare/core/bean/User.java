/**
 * 
 */
package com.genequ.demoshare.core.bean;

import com.fasterxml.jackson.annotation.JsonView;

import com.genequ.demoshare.core.validator.MyConstraint;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.Past;
import java.util.Date;

public class User{
	
	public interface UserSimpleView {};
	public interface UserDetailView extends UserSimpleView {};
	
	private String id;
	
	@MyConstraint(message = "这是一个测试")
	@ApiModelProperty(value = "用户名")
	private String username;
	
	@NotBlank(message = "密码不能为空")
	private String password;
	
	@Past(message = "生日必须是过去的时间")
	private Date birthday;

	@JsonView(UserSimpleView.class)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@JsonView(UserDetailView.class)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonView(UserSimpleView.class)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@JsonView(UserSimpleView.class)
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
