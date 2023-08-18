package petShop.controller;

import java.util.ArrayList;

import petShop.model.clientePetShop;
import petShop.repository.petShopRepository;

public class petShopController implements petShopRepository {

	private ArrayList<clientePetShop> listaClientes = new ArrayList<clientePetShop>();
	


	@Override
	public void listarTodos() {
		for(var clientePetShop : listaClientes) {
			clientePetShop.visualizar();
		}
		
	}

	@Override
	public void cadastrarCliente(clientePetShop clientePetShop) {
		listaClientes.add(clientePetShop);
		System.out.println("\nO Cliente Foi cadastrado no sustema com sucesso!!");
	}

	@Override
	public void atualizar(clientePetShop clientePetShop) {
		
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	public int gerarNumero() {
		int numero = 0;
		return ++ numero;
	}

	@Override
	public void procurar(String nome) {
		
	}
	

}
