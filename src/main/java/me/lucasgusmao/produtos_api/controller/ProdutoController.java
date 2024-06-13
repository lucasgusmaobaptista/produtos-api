package me.lucasgusmao.produtos_api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.lucasgusmao.produtos_api.entity.Produto;
import me.lucasgusmao.produtos_api.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
  
  private ProdutoService service;
  
  public ProdutoController(ProdutoService service) {
    this.service = service;
  }

  @GetMapping("/ver")
  public void verProdutos() {
    service.verProdutos();
  }

  @GetMapping("/ver/{id}")
  public void verProdutoPorId(@PathVariable Long id) {
    service.verProdutoPorId(id);
  }

  @PostMapping("/criar")
  public void criarProduto(@RequestBody String nome, String descricao, Double preco) {
    service.criarProduto(nome, descricao, preco);
  }

  @PutMapping("/atualizar")
  public void atualizarProduto(@RequestBody Produto produto) {
    service.atualizarProduto(produto);
  }

  @DeleteMapping("/delete/{id}")
  public void removerProdutoPorId(@PathVariable Long id) {
    service.removerProdutoPorId(id);
  }


}
