package com.algarworks;

import com.algarworks.modelo.Cliente;
import com.google.gson.Gson;

public class LendoJson {

	public static void main(String[] args) {
		Gson gson = new Gson();
		Cliente cliente = new Cliente();
		
		String json = gson.toJson(cliente);
		
		Cliente clientes = gson.fromJson(json, Cliente.class);
		
		System.out.println(clientes.getNome());
		System.out.println(clientes.getTelefones().get(0).getNumero());

	}

}
