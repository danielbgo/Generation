package petShop.model;

public abstract class clientePetShop {
	private int numero;
	private String nomeDono;
	private float telefone;
	private String nomeAnimal;
	private String raca;
	private int sexoAnimal;// 1 - Macho, 2 - Femea
	private String porteAnimal;
	
	
	public clientePetShop(int numero, String nomeDono, int telefone, String nomeAnimal, String raca, int sexoAnimal,
			String porteAnimal) {
		this.numero = numero;
		this.nomeDono = nomeDono;
		this.telefone = telefone;
		this.nomeAnimal = nomeAnimal;
		this.raca = raca;
		this.sexoAnimal = sexoAnimal;
		this.porteAnimal = porteAnimal;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public float getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getSexoAnimal() {
		return sexoAnimal;
	}

	public void setSexoAnimal(int sexoAnimal) {
		this.sexoAnimal = sexoAnimal;
	}

	public String getPorteAnimal() {
		return porteAnimal;
	}

	public void setPorteAnimal(String porteAnimal) {
		this.porteAnimal = porteAnimal;
	}
	
	
	public abstract void visualizar();{
		System.out.println("\n\n*********************************************");
		System.out.println("Dados do Cliente: ");
		System.out.println("                                                  ");
		System.out.println("Nome do Cliente: "+ this.nomeDono);
		System.out.println("Telefone: "+ this.telefone);
		System.out.println("Nome do Animal: "+ this.nomeAnimal);
		System.out.println("Raça do Anima: "+ this.raca);
		System.out.println("Porte do Animal: "+this.porteAnimal);
	}
	protected abstract String getnumero();
	
	
	
}
