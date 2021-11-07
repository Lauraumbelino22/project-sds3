package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleSucessDTO;
import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.service.SellerService;

@RestController
@RequestMapping(value ="/sellers")
public class SaleController {
	
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	
	
	}
	
	@GetMapping (value = "/amount-by-seller")
	public ResponseEntity<List<SellerDTO>> amountGrounpedBySeller() {
		List<SellerDTO> list = service.amountGrounpedBySeller();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping (value = "/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGrounpedBySeller() {
		List<SaleSucessDTO> list =service.sucessGrounpedBySeller();
		return ResponseEntity.ok(list);
	}
}
