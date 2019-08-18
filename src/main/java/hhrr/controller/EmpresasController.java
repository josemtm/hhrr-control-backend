package hhrr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hhrr.entity.Empresas;
import hhrr.services.EmpresasService;

@RestController
@RequestMapping("/empresas")
public class EmpresasController {

	@Autowired
	EmpresasService empresasService;
	
	@RequestMapping("/")
	public List<Empresas> findAll(){
		return empresasService.findAll();
	}
	
	//pendiente configurar la logica para guardar las fotos
	@PostMapping("/guardar")
	public void guardar(Empresas empresa) {
		
		empresasService.save(empresa);
	}
	
	@RequestMapping(value = "/eliminar/{id}",method = RequestMethod.DELETE )
	public void eliminar(@PathVariable(value = "id")Long id) {
	
		empresasService.delete(id);
	}
	
	@RequestMapping(value = "/editar/{id}")
	public Empresas editar(@PathVariable(value = "id")Long id) {
		return empresasService.findById(id);
	}
	
}
