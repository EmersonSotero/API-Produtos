package com.hib.jpaHib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hib.jpaHib.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
