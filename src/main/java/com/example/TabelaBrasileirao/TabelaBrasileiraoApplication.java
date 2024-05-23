package com.example.TabelaBrasileirao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class TabelaBrasileiraoApplication {

	public static void main(String[] args) {
         ClubeFutebol santos = new ClubeFutebol("Santos Futebol Club", "Peixei", "Baleião", "Carille") ;
		 ClubeFutebol sao_paulo = new ClubeFutebol("São Paulo Futebol Club", "Trikas", "Santo Paulo", "Zubeldía");
		 ClubeFutebol flamengo = new ClubeFutebol("Clube de Regatas do Flamengo", "Mengão", "Urubu", "Tite");
		 ClubeFutebol bragantino = new ClubeFutebol("Red Bull Bragantino", "Massa Bruta", "Toro Loko", "Caixinha");
		 ClubeFutebol cruzeiro = new ClubeFutebol("Cruzeiro Esporte Clube","Raposa", "Raposa", "Fernando Seabra" );
		 ClubeFutebol portuguesa = new ClubeFutebol("Associação Atlética Portuguesa", "Briosa","Cachopinha", "Sérgio Guedes" );
		 ClubeFutebol ferroviaria = new ClubeFutebol("Associação Ferroviária de Esportes", "Ferroviaira", "Oswaldinho","Vinícius Bergantin" );
		 ClubeFutebol paysandu = new ClubeFutebol("Paysandu Sport Club","O Clube de Suiço", "Lobo Mau", "Hélio dos Anjos");
		 ClubeFutebol quatorze_de_julho = new ClubeFutebol("Esporte Clube 14 de Julho", "Leão da Fronteira", "Leão", "null");
		 ClubeFutebol fluminense = new ClubeFutebol("Fluminense Football Club", "Flu", "Guerreirinho", "Diniz");

		 // função para sortear um numero de 0 até 7, esse valor será a quantidade de gol do club na partida, função
		 // deve pegar dois clubs aleatórios, sortear os gols e comparar, com o resultado da comparação, chama determinada função




	}

}
