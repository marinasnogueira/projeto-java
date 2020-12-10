package loja.varejo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import loja.varejo.model.Produto;
import loja.varejo.service.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;

	@GetMapping("/listar")
	public ResponseEntity<List<Produto>> listarClientes(String chave, String valor) {

		return new ResponseEntity<>(produtoService.findAll(), HttpStatus.OK);

	}

}
