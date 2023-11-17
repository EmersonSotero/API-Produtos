package com.hib.jpaHib.service;


import java.util.List;

import com.hib.jpaHib.entity.Produto;
import com.hib.jpaHib.entity.dto.ProdutoDTO;

public interface ProdutoService {

	Produto findById(Long id);
	List<Produto> FindAll();
	Produto create(ProdutoDTO obj);
}
