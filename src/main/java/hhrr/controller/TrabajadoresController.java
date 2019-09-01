package hhrr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hhrr.entity.Trabajadores;
import hhrr.services.TrabajadoresService;

@RestController
@RequestMapping("/trabajadores")
@CrossOrigin(origins = "https://josemtm.github.io/duman-control/")
public class TrabajadoresController {
	
	@Autowired
	TrabajadoresService trabajadoresService;

	@RequestMapping("/")
	public List<Trabajadores> findAll(){
		return trabajadoresService.findAll();
	}
	
	@RequestMapping("/editar/{id}")
	public Trabajadores editar(@PathVariable(value = "id")Long id) {
		return trabajadoresService.findById(id);
	}
	
	@RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable(value = "id") Long id) {
		
	}
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Trabajadores trabajador) {
		trabajadoresService.save(trabajador);
	}
}
