package hhrr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hhrr.entity.Notificaciones;
import hhrr.services.NotificacionesService;


@RestController
@RequestMapping("/notificaciones")
public class NotificacionesController {
	
	@Autowired
	NotificacionesService notificacionesService;
	
	@RequestMapping("/")
	public List<Notificaciones> findAll(){
		return notificacionesService.findAll();
	}
	
	@RequestMapping(value="/eliminar/{id}",method = RequestMethod.DELETE )
	public void eliminar(@PathVariable(value = "id") Long id) {
		notificacionesService.delete(id);
	}

	@PostMapping("/guardar")
	public void guardar(Notificaciones notificacion) {
		notificacionesService.save(notificacion);
	}
	
	@RequestMapping("/editar/{id}")
	public Notificaciones editar(@PathVariable(value = "id") Long id) {
		return notificacionesService.findById(id);
	}
}
