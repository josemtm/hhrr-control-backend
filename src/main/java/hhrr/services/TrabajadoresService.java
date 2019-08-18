package hhrr.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hhrr.dao.TrabajadoresDao;
import hhrr.entity.Trabajadores;



@Service
public class TrabajadoresService implements ITrabajadoresService {
	
	@Autowired
	TrabajadoresDao trabajadoresDao;

	@Override
	@Transactional(readOnly = true)
	public List<Trabajadores> findAll() {
		
		return (List<Trabajadores>) trabajadoresDao.findAll();
	}

	@Override
	@Transactional
	public void save(Trabajadores trabajador) {
		
		trabajadoresDao.save(trabajador);
		
	}

	@Override
	@Transactional
	public void delete(Long id) {
		
		trabajadoresDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Trabajadores findById(Long id) {
	
		return trabajadoresDao.findById(id).orElse(null);
	}

	
}
