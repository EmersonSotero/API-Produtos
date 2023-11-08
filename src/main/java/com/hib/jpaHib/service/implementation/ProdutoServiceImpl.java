package com.hib.jpaHib.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hib.jpaHib.entity.Produto;
import com.hib.jpaHib.repository.ProdutoRepository;
import com.hib.jpaHib.service.ProdutoService;
import com.hib.jpaHib.service.exception.ObjectNotFoundException;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	ProdutoRepository repository;
	
	@Override
	public Produto findById(Long id) {
		Optional<Produto> produto = repository.findById(id);
		return produto.orElseThrow(() -> new ObjectNotFoundException("Produto não encontrado"));
	}

	@Override
	public List<Produto> FindAll(){
		return repository.findAll();
	}
	
	

}
