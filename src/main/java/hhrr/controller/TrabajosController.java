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

import hhrr.entity.Trabajos;
import hhrr.services.ITrabajosService;

@RestController
@RequestMapping("/trabajos")
@CrossOrigin(origins = "*")
public class TrabajosController {
	
	@Autowired
	ITrabajosService trabajosService;

	@RequestMapping("/")
	public List<Trabajos> findAll(){
		return trabajosService.findAll();
	}
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Trabajos trabajo) {
		trabajosService.save(trabajo);
	}
	
	
	@RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable(value = "id")Long id) {
		if(id>0) {
		trabajosService.delete(id);
		}
		
		
	}
	
	@RequestMapping("/editar/{id}")
	public Trabajos editar(@PathVariable(value = "id") Long id) {
		
		return trabajosService.findById(id);
	}
	
	@RequestMapping("/cerrados")
	public List<Trabajos> findAllCerrados(){
		return trabajosService.findAllCerradas();
	}
	
	@RequestMapping("/abiertos")
	public List<Trabajos> findAllAbiertas(){
		return trabajosService.findAllAbiertas();
	}
	
}
	