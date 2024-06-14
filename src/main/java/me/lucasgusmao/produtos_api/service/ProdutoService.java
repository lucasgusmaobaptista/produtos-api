package me.lucasgusmao.produtos_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.lucasgusmao.produtos_api.entity.Produto;
import me.lucasgusmao.produtos_api.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> verProdutos() {
        return repository.findAll();
    }

    public Optional<Produto> verProdutoPorId(Long id) {
        return repository.findById(id);
    }

    public Produto criarProduto(Produto produto) {
        return repository.save(produto);
    }

    public void atualizarProduto(Long id, Produto produto) {
        repository.save(produto);
    }

    public void removerProdutoPorId(Long id) {
        repository.deleteById(id);
    }
}

