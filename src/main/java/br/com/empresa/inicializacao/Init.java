//package br.com.empresa.inicializacao;
//
////import java.lang.reflect.Array;
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//import br.com.empresa.entity.Aluno;
//import br.com.empresa.entity.Disciplina;
//import br.com.empresa.entity.Turma;
//import br.com.empresa.repository.AlunoRepository;
//import br.com.empresa.repository.DisciplinaRepository;
//import br.com.empresa.repository.TurmaRepository;
////import br.com.empresa.service.DisciplinaService;
//
//@Component
//public class Init implements ApplicationListener<ContextRefreshedEvent> {
//	
//	@Autowired
//	AlunoRepository alunoRepo;
//	
//	@Autowired
//	DisciplinaRepository disciplinaRepo;
//	
//	@Autowired
//	TurmaRepository turmaRepo;
//	
//	public void onApplicationEvent(ContextRefreshedEvent event) {
//		
//		
//		Aluno aluno1 = new Aluno();
//		aluno1.setNome("Mariana Paulina");
//		
//		
//		Aluno aluno2 = new Aluno();
//		aluno2.setNome("Pedro Alencastro");
//		
//		
//		Aluno aluno3 = new Aluno();
//		aluno3.setNome("Tábata Arruda");
//		
//		alunoRepo.saveAll(Arrays.asList(aluno1, aluno2, aluno3));
//		
//		Disciplina java = new Disciplina();
//		java.setNome("Java");
//		
//		disciplinaRepo.save(java);
//		
//		Disciplina java2 = new Disciplina();
//		java2.setNome("Java2");
//		
//		disciplinaRepo.save(java2);
//		
//		Disciplina arquitetura = new Disciplina();
//		arquitetura.setNome("Arquitetura");
//		disciplinaRepo.save(arquitetura);
//		
//		Turma rede = new Turma();
//		rede.setNome("Rede");
//		turmaRepo.save(rede);
//		
////		Turma ADS = new Turma ();
////		ADS.setNome("ADS");
////		turmaRepo.save("ADS");
////		
////		aluno1.setTurma(ADS);
////		aluno2.setTurma(rede);
////		aluno3.setTurma(ADS);
//		
//		aluno1.setDisciplinas(Arrays.asList(java, arquitetura, java2));
//	aluno2.setDisciplinas(Arrays.asList(java,java2));
//	aluno3.setDisciplinas(Arrays.asList(java,arquitetura));
//		
//		alunoRepo.save(aluno1);
//		alunoRepo.save(aluno2);
//		alunoRepo.save(aluno3);
//	}
//	
//}
