package com.project.student.entity;
import javax.persistence.*;

@Entity
public class StudentEntity {
	@Id
	private long id;
	private String name;
	private String city;
	
	public StudentEntity(long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}