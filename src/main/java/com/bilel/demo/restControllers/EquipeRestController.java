package com.bilel.demo.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bilel.demo.entities.Equipe;
import com.bilel.demo.repos.EquioeRepository;

@RestController
@RequestMapping("/api/equ")
@CrossOrigin("*")
public class EquipeRestController {
	
	@Autowired
	 EquioeRepository equipeRepository ;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Equipe> getAllEquipes()
	{
		return equipeRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Equipe getEquipeById(@PathVariable("id") Long id) {
	return equipeRepository.findById(id).get();
	}


}
