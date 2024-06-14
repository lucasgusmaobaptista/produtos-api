package me.lucasgusmao.produtos_api.controller;

import java.util.List;
import java.util.Optional;

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

import me.lucasgusmao.produtos_api.entity.Produto;
import me.lucasgusmao.produtos_api.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Produto> verProdutos() {
        List<Produto> produtos = service.verProdutos();
        return produtos;
    }

    @GetMapping("/{id}")
    public Optional<Produto> verProdutoPorId(@PathVariable Long id) {
        return service.verProdutoPorId(id);
    }

    @PostMapping("/criar")
    public Produto criarProduto(@RequestBody Produto produto) {
        return service.criarProduto(produto);
    }

    @PutMapping("/atualizar/{id}")
    public String atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        service.atualizarProduto(id, produto);
        return "Atualização realizada com sucesso.";
    }

    @DeleteMapping("/remover/{id}")
    public void removerProduto(@PathVariable Long id) {
        service.removerProdutoPorId(id);
    }

}

