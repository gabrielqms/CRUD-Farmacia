package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")

public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 1, max = 100, message = "O nome deve ter no mínimo 1 caracter e no máximo 100")
	@NotBlank(message = "O nome do produto é obrigatório")
	private String nome;
	
	@NotNull(message = "Atributo preço é obrigatório")
	private double preco;
	
	@Size(min = 1, max = 50, message = "A descricao deve ter no mínimo 1 caracter e no máximo 50")
	private String descricao;
	
	@Size(min = 1, max = 50, message = "O nome da fabricante deve ter no mínimo 1 caracter e no máximo 50")
	private String fabricante;
	
	@NotNull(message = "Atributo quantidade é obrigatório")
	private int quantidade;
	
	@Size(max = 5000, message = "O link da foto não deve conter mais do que 5000 caracteres!")
	private String foto;
	
	@Size(min = 10, max = 10, message = "A data de validade deve ser informada no padrão DD/MM/AAAA")
	private String dataValidade;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Long getId() {
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
