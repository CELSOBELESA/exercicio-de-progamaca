package com.programacao-iv.modulos.status.dto;

import java.io.Serializable;
import java.util.Date;

public class StatusDTO implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private static final String MESSAGEM = "Servidor está Funcionando!";
  private static final String VERSAO = "0.0.1";

  private String versao = VERSAO;
  private String menssagem = MESSAGEM;
  private Date data = new Date();

  public StatusDTO() {}

  public StatusDTO(String versao, String menssagem, Date data) {
    this.versao = versao;
    this.menssagem = menssagem;
    this.data = data;
  }

  public String getVersao() {
    return this.versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public String getMenssagem() {
    return this.menssagem;
  }

  public void setMenssagem(String menssagem) {
    this.menssagem = menssagem;
  }

  public Date getData() {
    return this.data;
  }

  public void setData(Date data) {
    this.data = data;
  }
}
