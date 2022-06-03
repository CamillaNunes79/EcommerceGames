package com.generation.lojadegames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos") 
public class Produtos {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
private String foto;

@NotBlank(message = "Informe o nome do jogo!") 
@Size(min = 5, max = 30, message = "O nome deve conter no mínimo 05 e no máximo 30 caracteres")
private String nome; 

@NotNull(message = "O nome do jogo é obrigatório!")
@Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 500 caracteres")
private String descricao;


@NotNull(message = "A data de lançamento é obrigatória!")
private String dataLancamento;

@JsonFormat(shape = JsonFormat.Shape.STRING)
@NotNull(message = "O preço é obrigatório!")
@Positive(message = "O preço deve ser maior que zero!")
private BigDecimal preco;

@ManyToOne
@JsonIgnoreProperties("produtos")
private Categoria categoria;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFoto() {
	return foto;
}

public void setFoto(String foto) {
	this.foto = foto;
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

public String getDataLancamento() {
	return dataLancamento;
}

public void setDataLancamento(String dataLancamento) {
	this.dataLancamento = dataLancamento;
}

public BigDecimal getPreco() {
	return preco;
}

public void setPreco(BigDecimal preco) {
	this.preco = preco;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria; }

}