package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SaleSucessDTO;
import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll() {
		List<Sale> result = sellerRepository.findAll();
		return result.stream().map (x -> new SellerDTO ()).collect(Collectors.toList());
	}

	public List<SellerDTO> amountGrounpedBySeller() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SaleSucessDTO> sucessGrounpedBySeller() {
		
		return null;
	}

}
