package com.spring.jpa.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spring.jpa.acpk.AccountPk;

@Entity
@Table(name="account")
public class Account {
	@Column(name="holdername")
	private String accHldName;
	@Column(name="branch")
	private String branch;
	@Column(name="adrs")
	private String adrs;
	@EmbeddedId
	private AccountPk accpk;
	
	public Account() {
		
	}
	public Account(String accHldName, String branch, String adrs, AccountPk accpk) {
		this.accHldName = accHldName;
		this.branch = branch;
		this.adrs = adrs;
		this.accpk = accpk;
	}

	public String getAccHldName() {
		return accHldName;
	}

	public void setAccHldName(String accHldName) {
		this.accHldName = accHldName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAdrs() {
		return adrs;
	}

	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}

	public AccountPk getAccpk() {
		return accpk;
	}

	public void setAccpk(AccountPk accpk) {
		this.accpk = accpk;
	}
	@Override
	public String toString() {
		return "Account [accHldName=" + accHldName + ", branch=" + branch + ", adrs=" + adrs + ", accpk=" + accpk + "]";
	}
	
	
	
	
}
