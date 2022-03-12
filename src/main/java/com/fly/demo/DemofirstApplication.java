package com.fly.demo;

import com.fly.demo.dao.PatientRepository;
import com.fly.demo.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemofirstApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemofirstApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		for (int i=0;i<9;i++){
//			patientRepository.save(new Patient(null,"Dietrich",new Date(),false));
//			patientRepository.save(new Patient(null,"Samira",new Date(),false));
//			patientRepository.save(new Patient(null,"Dru",new Date(),false));
//			patientRepository.save(new Patient(null,"Gru",new Date(),false));
//			patientRepository.save(new Patient(null,"Peace",new Date(),false));
//
//		}
//
//		patientRepository.findAll().forEach(p->{
//			System.out.println(p.toString());
//		});
	}
}
