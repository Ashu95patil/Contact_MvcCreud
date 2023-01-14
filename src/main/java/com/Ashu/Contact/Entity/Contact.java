package com.Ashu.Contact.Entity;

import java.time.LocalDate;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="Contacte_Details")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Contact_Id")
	private Integer contactid;
	
	@Column(name="Contact_Name")
	private String contactname;
	
	@Column(name="Contact_No")
	private long contactnumber;
	
	@Column(name="Contact_Email")
	private String contactemail;
	
	@Column(name="Create_date",updatable =  false)
	@CreationTimestamp
	private LocalDate createdate;
	
	@Column(name="update_date", insertable = false)
	@UpdateTimestamp
	private LocalDate updatedate;
	
	@Column(name="isactive_switch")
	private String isactive;

	public Contact(Integer contactid, String contactname, long contactnumber, String contactemail, LocalDate createdate,
			LocalDate updatedate, String isactive) {
		super();
		this.contactid = contactid;
		this.contactname = contactname;
		this.contactnumber = contactnumber;
		this.contactemail = contactemail;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.isactive = isactive;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
