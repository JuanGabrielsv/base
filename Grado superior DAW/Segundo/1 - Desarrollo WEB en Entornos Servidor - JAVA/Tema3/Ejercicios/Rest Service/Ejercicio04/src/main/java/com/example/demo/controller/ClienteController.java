package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ClienteController {

	List<Cliente> clientes = new ArrayList<>();

	public ClienteController() {

		Cliente cliente1 = new Cliente("1", "Laura", "Laurita86", "654854");
		Cliente cliente2 = new Cliente("2", "Carmen", "Carmenlamejor", "85241");
		Cliente cliente3 = new Cliente("3", "Paula", "Divarock", "785823");
		Cliente cliente4 = new Cliente("4", "Jazmín", "HijadelaLuna", "845215");

		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);

	}

	@GetMapping("clientes")
	public List<Cliente> listaClientes() {
		return clientes;
	}

	@GetMapping("clientes/{username}")
	public ResponseEntity<Cliente> saberCliente(@PathVariable String username) {

		for (Cliente cliente : clientes) {
			if (cliente.getUsername().contains(username)) {
				return ResponseEntity.ok(cliente);
			}
		}

		return ResponseEntity.notFound().build();

	}

	@PostMapping("clientes")
	public Cliente introducirCliente(@RequestBody Cliente cliente) {
		clientes.add(cliente);
		return cliente;
	}

//* El método debe recibir el cliente y en caso de encontrar el id en la lista de clientes, actualizar sus datos.
	@PutMapping("clientes")
	public String putMethodName(@RequestBody String entity) {
		
		
		return entity;
	}
	
//* Crear otro endpoint para que reciba el id del cliente a modificar, en el path: /clientes/123
	@PutMapping("clientes/{id}")
	public Cliente modificarClienteCompleto(@PathVariable String id, @RequestBody Cliente clienteModificado) {
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(id)) {
				cliente.setNombre(clienteModificado.getNombre());
				cliente.setUsername(clienteModificado.getUsername());
				cliente.setPassword(clienteModificado.getPassword());
				return cliente;
			}
		}
		return null;
	}

}