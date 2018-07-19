package com.aks.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITIES")
public class Authorities {
	@Id
	@Column(name = "AUTHORITY")
	private String authority;
	
	@Column(name = "USERNAME")
	private String user;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "USERNAME")
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
