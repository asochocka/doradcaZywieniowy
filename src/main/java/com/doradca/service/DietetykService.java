package com.doradca.service;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.doradca.model.Dietetyk;
import com.doradca.repository.DietetykRepository;



@Service
@Transactional
public class DietetykService {

	private final DietetykRepository dietetykRepository;

	public DietetykService(DietetykRepository dietetykRepository) {
		this.dietetykRepository = dietetykRepository;
	}

	public List<Dietetyk> findAll(){
		List<Dietetyk> dietetycy = new ArrayList<>();
		for(Dietetyk dietetyk : dietetykRepository.findAll()) {
			dietetycy.add(dietetyk);
		}
			return dietetycy;
	}
	
}
