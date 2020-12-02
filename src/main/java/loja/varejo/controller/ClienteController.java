package loja.varejo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import loja.varejo.model.Cliente;
import loja.varejo.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ConnectionController connection;

	@Autowired
	ClienteService clienteservice;

	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> listarClientes(String chave, String valor) {

		MongoClientSettings clientSettings = connection.conectDB("clientes");

		MongoClient mongoClient = MongoClients.create(clientSettings);
		MongoDatabase db = mongoClient.getDatabase("test");
		MongoCollection<Cliente> collectionClientes = db.getCollection("clientes", Cliente.class);

		List<Cliente> listaClientes = new ArrayList<Cliente>();

		if (chave != null && !chave.isEmpty() || valor != null && !valor.isEmpty() ) {
			MongoCursor<Cliente> clientes = collectionClientes.find(Filters.in(chave, valor), Cliente.class).iterator();
			listaClientes = clienteservice.popularCliente(clientes);
		} else {
			MongoCursor<Cliente> clientes = collectionClientes.find().iterator();
			listaClientes = clienteservice.popularCliente(clientes);

		}

		return new ResponseEntity<>(listaClientes, HttpStatus.OK);

	}
}
