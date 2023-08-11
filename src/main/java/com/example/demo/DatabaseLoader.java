package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final InstrumentoRepository repositoryI;
	private final MusicoRepository repositoryM;

	@Autowired
	public DatabaseLoader(InstrumentoRepository repositoryI, MusicoRepository repositoryM) {
		this.repositoryI = repositoryI;
		this.repositoryM = repositoryM;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repositoryI.save(new Instrumento("Guitarra", "Cuerda", "hecho en Peru de madera de roble"));
		this.repositoryI.save(new Instrumento("Violin", "Cuerda", "de cedro"));
		this.repositoryI.save(new Instrumento("Piano", "Tecla", "Teclado pequeño de 2 octavas"));
		this.repositoryM.save(new Musico("David S"));
	}
}