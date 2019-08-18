package hhrr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hhrr.dao.NotificacionesDao;
import hhrr.entity.Notificaciones;
@Service
public class NotificacionesService implements INotificacionesService {
	
	@Autowired
	NotificacionesDao notificacionesDao;

	@Override
	@Transactional(readOnly = true)
	public List<Notificaciones> findAll() {
		
		return (List<Notificaciones>) notificacionesDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Notificaciones findById(Long id) {
		
		return notificacionesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void save(Notificaciones notificacion) {
		notificacionesDao.save(notificacion);
		
	}

	@Override
	@Transactional
	public void delete(Long id) {

		notificacionesDao.deleteById(id);
	}
	


}
