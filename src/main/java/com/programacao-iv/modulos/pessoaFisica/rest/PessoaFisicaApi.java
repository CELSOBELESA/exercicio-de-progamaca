package com.programacao-iv.modulos.pessoaFisica.rest;

import com.programacao-iv.modulos.pessoaFisica.model.PessoaFisica;
import java.util.List;
import org.springframework.http.ResponseEntity;

public interface PessoaFisicaApi {
  ResponseEntity<List<PessoaFisica>> ListarPessoas();
  ResponseEntity<PessoaFisica> BuscarPorId(Long id);
 ResponseEntity<PessoaFisica> Adcionar(PessoaFisica pessoaFisica);
}
