package com.thp.vintud.entity;



import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "Category")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	
    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id_category ;
    
    
	private String name  ;
	private String description  ;
	
	
    @OneToMany(mappedBy="categoryAnnonce")
    private Collection<Announcement> annoncesCategory ;
    
    
	
	public Category() {
	}

	public int getId_category() {
		return id_category;
	}

	
	
	
	


	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public Category(int id_category, String name, String description) {
		this.id_category = id_category;
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Announcement> getAnnoncesCategory() {
		return annoncesCategory;
	}

	public void setAnnoncesCategory(Collection<Announcement> annoncesCategory) {
		this.annoncesCategory = annoncesCategory;
	}

	@Override
	public String toString() {
		return "Category [id_category=" + id_category + ", name=" + name + ", description=" + description
				+ ", annoncesCategory=" + annoncesCategory + "]";
	}



}
