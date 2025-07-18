package com.eduardo.springboot_banco_dados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.springboot_banco_dados.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
