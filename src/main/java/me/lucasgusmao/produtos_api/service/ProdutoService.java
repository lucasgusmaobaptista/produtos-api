package me.lucasgusmao.produtos_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.lucasgusmao.produtos_api.entity.Produto;
import me.lucasgusmao.produtos_api.repository.ProdutoRepository;

@Service
public class ProdutoService {
  @Autowired
  private ProdutoRepository repository;

  public void verProdutos() {
    repository.findAll();
  }

  public void verProdutoPorId(Long id) {
    repository.findById(id);
  }

  public void criarProduto(String nome, String descricao, Double preco) {
    Produto p = new Produto(nome, descricao, preco);
    repository.save(p);
  }
  
  public void atualizarProduto(Produto produto) {
    repository.save(produto);
  }

  public void removerProdutoPorId(Long id) {
    repository.deleteById(id);
  }

}
