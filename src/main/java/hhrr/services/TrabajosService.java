package hhrr.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hhrr.dao.TrabajosDao;
import hhrr.entity.Trabajos;

@Service
public class TrabajosService implements ITrabajosService {

	@Autowired
	TrabajosDao trabajosDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Trabajos> findAll() {
		
		return (List<Trabajos>) trabajosDao.findAll();
	}

	@Override
	@Transactional
	public void save(Trabajos trabajo) {
		
		trabajosDao.save(trabajo);
		
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		
		trabajosDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Trabajos findById(Long id) {
		
		return trabajosDao.findById(id).orElse(null);
	}
	
	

}
