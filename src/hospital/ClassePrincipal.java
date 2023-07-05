package hospital;

/**
 * Sistema hospitlar para controle de pacientes, médicos, exames e consultas
 * 
 * @author rafaelsabatinileite
 * 
 * @version 1.0
 */

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente paciente000435 = new Paciente();
		paciente000435.setId("000435");
		paciente000435.setNome("Jośe da Silva");
		paciente000435.setIdade(43);
		paciente000435.setEndereco("Rua 1, nº2, Bairro 3");
		
		Medico medico0017 = new Medico();
		medico0017.setId("0017");
		medico0017.setNome("Antônio Santos");
		medico0017.setEspecialidade("Cardiologia");
		
		Consulta consulta000435_c6 = new Consulta();
		consulta000435_c6.setPacienteId(paciente000435.getId());
		consulta000435_c6.setMedicoId(medico0017.getId());
		consulta000435_c6.setEspecialidade("Cardiologia");
		consulta000435_c6.setDataEHora("04/07/2023 - 09:00");
		
		Exame exame000435_e2 = new Exame();
		exame000435_e2.setNomeExame("Cardiograma");
		exame000435_e2.setPacienteId(paciente000435.getId());
		exame000435_e2.setIndicacaoMedicoId(medico0017.getId());
		exame000435_e2.setDataEHora("11/07/2023 - 12:00");
		
		
		System.out.println(paciente000435.getIdade());
		System.out.println(medico0017.getEspecialidade());
		System.out.println(consulta000435_c6.getDataEHora());
		System.out.println(exame000435_e2.getPacienteId());
		
		
		
	}

}
