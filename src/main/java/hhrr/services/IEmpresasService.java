package hhrr.services;

import java.util.List;

import hhrr.entity.Empresas;



public interface IEmpresasService {
	
	public List<Empresas> findAll();
	
	public Empresas findById(Long id);

	public void save(Empresas empresa);
	
	public void delete(Long id);

}
