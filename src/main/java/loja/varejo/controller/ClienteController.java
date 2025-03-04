package loja.varejo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import loja.varejo.model.Cliente;
import loja.varejo.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteService clienteservice;

	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> listarClientes(String chave, String valor) {

		return new ResponseEntity<>(clienteservice.findAll(), HttpStatus.OK);

	}
}
