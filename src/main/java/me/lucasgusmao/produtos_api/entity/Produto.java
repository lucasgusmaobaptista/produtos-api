package me.lucasgusmao.produtos_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  @Column(name="produto_nome", nullable=false)
  private String nome;
  @Column(name="produto_desc", nullable=true)
  private String descricao;
  @Column(name="produto_preco", nullable = false)
  private Integer preco;

    public Produto(String descricao, String nome, Integer preco) {
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {

    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produtos{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", descricao=").append(descricao);
        sb.append(", preço=").append(preco);
        sb.append('}');
        return sb.toString();
    }

  
}
