package com.thp.vintud.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEntities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Cre_Vin");

		

	}

}
