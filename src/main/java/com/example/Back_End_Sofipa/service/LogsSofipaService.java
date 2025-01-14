package com.example.Back_End_Sofipa.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

import com.example.Back_End_Sofipa.repository.LogsSofipaRepository;
import com.example.Back_End_Sofipa.repository.ModelDAO.logs_sofipa;

@Service
public class LogsSofipaService {

	public boolean guardar(logs_sofipa logs_sofipa_,LogsSofipaRepository logsRepository) {		
		logsRepository.save(logs_sofipa_);
		return true;
	}
	
}
