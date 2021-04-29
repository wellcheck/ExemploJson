package com.algarworks;

import java.util.ArrayList;
import java.util.List;

import com.algarworks.modelo.Cliente;
import com.algarworks.modelo.Endereco;
import com.algarworks.modelo.Telefone;
import com.google.gson.Gson;

public class GerandoJson {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Rua Pedro de São Martinho, 467", "São Paulo", "SP");

		Telefone residencial = new Telefone("Residencial", "11 99871-3923");
		Telefone comercial = new Telefone("Comercial", "11 4097-5659");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(comercial);
		telefones.add(residencial);

		Cliente cliente = new Cliente("Wellington da Paixão", 29, endereco, telefones);

		// Gerando Json da Google
		Gson gson = new Gson();
		String json = gson.toJson(cliente);

		System.out.println(json);

		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();

		// Recuperando Json
		Cliente c2 = gson.fromJson(json, Cliente.class);

		System.out.println(c2.getNome());
		System.out.println(c2.getTelefones().get(0).getNumero());

	}

}
