package br.com.alura.dao;

import javax.persistence.EntityManager;

import br.com.alura.modelo.Produto;

public class ProdutoDAO {
	private EntityManager em;

	public ProdutoDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Produto produto) {
		this.em.persist(produto);
	}
}
