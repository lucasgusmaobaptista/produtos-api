package me.lucasgusmao.produtos_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.lucasgusmao.produtos_api.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
  
} 