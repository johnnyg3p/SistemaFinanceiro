package com.johnny.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.johnny.model.Pessoa;

public class GestaoPessoas {

	private static Map<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();

	static {
		pessoas.put(1, new Pessoa(1, "Johnny"));
		pessoas.put(2, new Pessoa(2, "Pablo "));
		pessoas.put(3, new Pessoa(3, "Mario"));
	}

	public List<Pessoa> listarTodas() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.addAll(GestaoPessoas.pessoas.values());
		return pessoas;
	}

	public Pessoa buscarPorCodigo(Integer codigo) {
		return pessoas.get(codigo);
	}

}
