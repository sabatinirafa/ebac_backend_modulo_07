package hospital;

/**
 * @author rafaelsabatinileite
 * 
 * A isntância dessa classe deve ser gerada com a palavra "paciente" mais um número de 6 dígitos igual ao número total de pacientes cadastrados mais um.
 * 
 */

public class Paciente {
	

	private String id;
	
	private String nome;
	
	private int idade;
	
	private String endereco;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
