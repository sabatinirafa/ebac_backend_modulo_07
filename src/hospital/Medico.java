package hospital;

/**
 * A isntância dessa classe deve ser gerada com a palavra "medico" mais um número de 4 dígitos igual ao número total de médicos cadastrados mais um.
 * 
 * @author rafaelsabatinileite
 */

public class Medico {

	
	private String id;
	
	private String nome;
	
	private String especialidade;
	
	

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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
