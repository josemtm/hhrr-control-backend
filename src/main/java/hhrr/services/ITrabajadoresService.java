package hhrr.services;

import java.util.List;

import hhrr.entity.Trabajadores;



public interface ITrabajadoresService {
	
public List<Trabajadores> findAll();
	
	public void save(Trabajadores trabajador);
	
	public void delete(Long id);

	public Trabajadores findById(Long id);

}
