package petShop.repository;

import petShop.model.clientePetShop;

public interface petShopRepository {
	public void procurar(String nome);
	public void listarTodos();
	public void cadastrarCliente(clientePetShop clientePetShop);
	public void atualizar(clientePetShop clientePetShop);
	public void deletar(int numero);
}
