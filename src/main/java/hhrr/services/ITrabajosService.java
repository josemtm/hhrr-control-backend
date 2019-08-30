package hhrr.services;

import java.util.List;

import hhrr.entity.Trabajos;

public interface ITrabajosService {
	
	public List<Trabajos> findAll();
	
	public void save(Trabajos trabajo);
	
	public void delete(Long id);

	public Trabajos findById(Long id);
	
	public List<Trabajos> findAllCerradas();
	
	List<Trabajos> findAllAbiertas();
	
}
