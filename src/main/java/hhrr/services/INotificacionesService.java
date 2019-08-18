package hhrr.services;

import java.util.List;

import hhrr.entity.Notificaciones;

public interface INotificacionesService {
	
	public List<Notificaciones> findAll();
	
	public Notificaciones findById(Long id);

	public void save(Notificaciones notificacion);
	
	public void delete(Long id);
}
