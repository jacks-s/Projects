package com.myCafe.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Food_Order")
public class foodOrder {
	
	@Override
	public String toString() {
		return "foodOrder [id=" + id + ", description=" + description + "]";
	}
	public void getFood() {
		System.out.println(id+""+description);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	
	@Column(name="food_Desc")
    private	String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	} 
	

}
