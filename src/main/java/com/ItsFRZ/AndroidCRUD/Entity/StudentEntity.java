package com.ItsFRZ.AndroidCRUD.Entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "studentregistration")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String city;
	private String state;
	private String hscm;
	private String sscm;
	private String filename;
	
	@Lob
	private byte[] photoid;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getHscm() {
		return hscm;
	}
	public void setHscm(String hscm) {
		this.hscm = hscm;
	}
	public String getSscm() {
		return sscm;
	}
	public void setSscm(String sscm) {
		this.sscm = sscm;
	}
	public byte[] getPhotoid() {
		return photoid;
	}
	public void setPhotoid(byte[] photoid) {
		this.photoid = photoid;
	}
	
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", fname=" + fname + ", city=" + city + ", state=" + state + ", hscm=" + hscm
				+ ", sscm=" + sscm + ", photoid=" + Arrays.toString(photoid) + "]";
	}
	
	
	

}
