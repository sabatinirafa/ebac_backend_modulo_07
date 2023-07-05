package hospital;

/**
 * @author rafaelsabatinileite
 * 
 * A isntância dessa classe deve ser gerada com a palavra "consulta", mais o  pacienteId do paciente que passará na consulta, mais "_c" e um número igual ao número total consultas desse paciente mais um.
 */

public class Consulta {
	

	private String pacienteId;
	
	private String medicoId;
	
	private String especialidade;
	
	private String dataEHora;
	
	

	public String getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(String pacienteId) {
		this.pacienteId = pacienteId;
	}

	public String getMedico() {
		return medicoId;
	}

	public void setMedicoId(String medicoId) {
		this.medicoId = medicoId;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getDataEHora() {
		return dataEHora;
	}

	public void setDataEHora(String dataEHora) {
		this.dataEHora = dataEHora;
	}
	
	
}
