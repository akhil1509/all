package com.example.sms.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter

@NoArgsConstructor
@Entity
@Table(name = "school")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private  String address;
    private String course;
    private Double fee;
    
    
    
    
    
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + ", fee=" + fee
				+ "]";
	}
	public Student(Long id, String name, String address, String course, Double fee) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.course =  course;
		this.fee =  fee;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
    
}
