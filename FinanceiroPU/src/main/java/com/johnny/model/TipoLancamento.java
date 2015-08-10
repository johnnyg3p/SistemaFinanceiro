package com.johnny.model;

public enum TipoLancamento {

	RECEITA,
	DESPESA;
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
