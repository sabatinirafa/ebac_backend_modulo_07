package hospital;

/**
 * A isntância dessa classe deve ser gerada com a palavra "exame", mais o  pacienteId do paciente que passará no exame, mais "_e" e um número igual ao número total exames desse paciente mais um.
 * 
 * @author rafaelsabatinileite
 */

public class Exame {
	
	
	private String nomeExame;
	
	private String pacienteId;
	
	private String indicacaoMedicoId;
	
	private String dataEHora;
	
	

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(String pacienteId) {
		this.pacienteId = pacienteId;
	}

	public String getIndicacaoMedicoId() {
		return indicacaoMedicoId;
	}

	public void setIndicacaoMedicoId(String indicacaoMedicoId) {
		this.indicacaoMedicoId = indicacaoMedicoId;
	}

	public String getDataEHora() {
		return dataEHora;
	}

	public void setDataEHora(String dataEHora) {
		this.dataEHora = dataEHora;
	}


}
