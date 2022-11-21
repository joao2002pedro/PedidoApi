package PedidoAPI.API.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String endereco;
    private int cep;
    private int numero;
    private String formaPagamento;
    private int parcelas;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Itens> itens;

    public Cliente() {
    }

    public Cliente(Long id, String endereco, int cep, int numero, String formaPagamento, int parcelas, List<Itens> itens) {
        this.id = id;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}
