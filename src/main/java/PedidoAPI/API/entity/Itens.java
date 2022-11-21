package PedidoAPI.API.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Itens {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private Double precoIndividual;
    private Double precoTotal;
    private int quantidade;
    public Itens(String nome, Double precoIndividual, Double precoTotal, int quantidade) {
        this.nome = nome;
        this.precoIndividual = precoIndividual;
        this.precoTotal = precoTotal;
        this.quantidade = quantidade;
    }

    public Itens() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoIndividual() {
        return precoIndividual;
    }

    public void setPrecoIndividual(Double precoIndividual) {
        this.precoIndividual = precoIndividual;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
