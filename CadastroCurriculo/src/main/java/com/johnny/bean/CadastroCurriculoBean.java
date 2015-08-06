package com.johnny.bean;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class CadastroCurriculoBean {
	private String vaga = "A0382D";
	private String cargo = "Programador Java Senior";
	private String sexo ;
	
	public String getVaga() {
		return vaga;
	}
	public void setVaga(String vaga) {
		this.vaga = vaga;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	

}
