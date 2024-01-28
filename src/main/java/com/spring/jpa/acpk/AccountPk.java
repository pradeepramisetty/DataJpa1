package com.spring.jpa.acpk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AccountPk implements Serializable{
	@Column(name="accid")
	private Integer accId;
	@Column(name="acctype")
	private String accType;
	@Column(name="accnum")
	private Long accNum;
	
	public AccountPk() {
		
	}
	public AccountPk(Integer accId, String accType, Long accNum) {
		this.accId = accId;
		this.accType = accType;
		this.accNum = accNum;
	}
	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Long getAccNum() {
		return accNum;
	}

	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}
	@Override
	public String toString() {
		return "AccountPk [accId=" + accId + ", accType=" + accType + ", accNum=" + accNum + "]";
	}
	
	
}
