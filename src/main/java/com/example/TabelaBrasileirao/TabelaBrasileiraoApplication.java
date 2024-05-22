package com.example.TabelaBrasileirao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class TabelaBrasileiraoApplication {

	public static void main(String[] args) {
         ClubeFutebol santos = new ClubeFutebol("Santos Futebol Club", "Peixei", "Baleião", "Carille") ;
		 ClubeFutebol sao_paulo = new ClubeFutebol("São Paulo Futebol Club", "Bambi", "Santo Paulo", "Zubeldía");
		 ClubeFutebol flamengo = new ClubeFutebol("Clube de Regatas do Flamengo", "Mengão", "Urubu", "Tite");
		 ClubeFutebol bragantino = new ClubeFutebol("Red Bull Bragantino", "Massa Bruta", "Toro Loko", "Caixinha");
	}

}
