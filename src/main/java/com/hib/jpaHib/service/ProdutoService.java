package com.hib.jpaHib.service;


import java.util.List;

import com.hib.jpaHib.entity.Produto;

public interface ProdutoService {

	Produto findById(Long id);
	List<Produto> FindAll();
}
