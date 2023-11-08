package com.hib.jpaHib.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hib.jpaHib.entity.Produto;
import com.hib.jpaHib.entity.dto.ProdutoDTO;
import com.hib.jpaHib.repository.ProdutoRepository;
import com.hib.jpaHib.service.ProdutoService;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	ModelMapper mapper;
	
	@Autowired
	ProdutoRepository pr;
	
	@Autowired
	ProdutoService serviceRepository;
	
	@GetMapping
	public ResponseEntity<List<ProdutoDTO>> getAll(){
		List<ProdutoDTO> listDTO = serviceRepository.FindAll().stream().map(obj -> mapper.map(obj, ProdutoDTO.class)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoDTO> getProdutoById(@PathVariable Long id){
		ProdutoDTO ob = mapper.map(serviceRepository.findById(id), ProdutoDTO.class);
		System.out.println(ob.getNome());
		/*
		 * teste
		 * 
		 * */
		return ResponseEntity.status(HttpStatus.OK).body(ob);
	}
	
	
	@PostMapping
	public void setProduto(@RequestBody Produto produto){
		pr.save(produto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long id) {
		pr.deleteById(id);
	}
	
	@PutMapping("{id}")
	public String updateProdutoById(@PathVariable Long id, @RequestBody Produto produto) {
		if(pr.existsById(id)) {
			pr.save(produto);
			return "message: produto encontrado";
		}else {
			return "erro, produto n existe";
		}
	}
}
