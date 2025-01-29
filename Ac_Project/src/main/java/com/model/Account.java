package com.model;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;
@Entity
@DynamicUpdate
public class Account {


	@Id
//	@GeneratedValue(generator = "acNo",strategy = GenerationType.SEQUENCE)
//	@SequenceGenerator(name="acNo",sequenceName = "AccountNo's",initialValue = 10001,allocationSize = 1)
	@Column(name="Account_No")
	private long acNo;
	
	@Column(name="Account_Name")
	private String acName;
	
	@Column(name="Account_Address")
	private String address;
	
	@Column(name="Account_MobileNo")
	private long mobileNo;
	
	@Column(name="Account_AdharNo")
	private long aadharNo;
	
	@Column(name="Account_PANNo")
	private String panNo;
	
	@Column(name="Account_Balance")
	private double balance;
	
	@Column(name="Account_Type")
	private String acType;
	
	@Column(name="Account_Gender")
	private String gender;
	
	public long getAcNo() {
		return acNo;
	}
	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Account [acNo=" + acNo + ", acName=" + acName + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", aadharNo=" + aadharNo + ", panNo=" + panNo + ", balance=" + balance + ", acType=" + acType
				+ ", gender=" + gender + "]";
	}
	
	
	
}
