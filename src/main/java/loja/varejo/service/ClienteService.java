package loja.varejo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mongodb.client.MongoCursor;

import loja.varejo.model.Cliente;

@Service
public class ClienteService {

	public List<Cliente> popularCliente(MongoCursor<Cliente> clientes) {
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		while(clientes.hasNext()) {
			listaClientes.add(clientes.next());
		}
		
		return listaClientes;

	}
}