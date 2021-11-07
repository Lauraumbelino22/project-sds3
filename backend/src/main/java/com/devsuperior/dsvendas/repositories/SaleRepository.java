package com.devsuperior.dsvendas.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.devsuperior.dsvendas.dto.SaleSucessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Seller;

public interface SaleRepository extends JpaRepository <Seller, Long> {

	public static void main(String[] args) {
		
	}
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale As obj GROUP BY obj.seller ")
	List<SaleSumDTO> amountGrounpedBySeller ();
	
	@Query("SELECT newcom.devsuperior.dsvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited)SUM(obj.deals)) "
			+ " FROM Sale As obj GROUP BY obj.seller ")
	List<SaleSucessDTO> sucessGrounpedBySeller ();

}
