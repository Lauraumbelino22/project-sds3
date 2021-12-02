package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.devsuperior.dsvendas.entities.Seller;

@Repository
public class SaleSucessDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSucessDTO () {
		
	}
	

	public SaleSucessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}


	public SaleSucessDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public Long getVisited() {
		return visited;
	}


	public void setVisited(Long visited) {
		this.visited = visited;
	}


	public Long getDeals() {
		return deals;
	}


	public void setDeals(Long deals) {
		this.deals = deals;
	}

	

}
