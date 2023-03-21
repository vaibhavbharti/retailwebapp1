package com.retailapp.signupservice.POJO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;




@NamedQuery(name = "User.findByEmailId", query = "select u from User u where u.email=:email")

@Entity
@Table(name ="user")
@DynamicUpdate
@DynamicInsert
public class User implements Serializable {

	private static final  long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="contactNumber")
	private String contactNumber;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="password")
	private String password;
	
	//@OneToOne
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cartId;
	
	

	public Integer getCartId() {
		return cartId;
	}



	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}



	public User() {
		super();
	}



	public User(Integer id, String name, String contactNumber, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.email = email;
		this.password = password;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", email=" + email
				+ ", password=" + password + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getContactNumber()=" + getContactNumber() + ", getEmail()=" + getEmail() + ", getPassword()="
				+ getPassword() + "]";
	}
	
	
	
	 
}
