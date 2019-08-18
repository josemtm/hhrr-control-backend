package hhrr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hhrr.dao.EmpresasDao;
import hhrr.entity.Empresas;

@Service
public class EmpresasService implements IEmpresasService {

	@Autowired
	EmpresasDao empresasDao;
	
	@Override
	public List<Empresas> findAll() {
		
		return (List<Empresas>) empresasDao.findAll();
	}

	@Override
	public Empresas findById(Long id) {
		
		return empresasDao.findById(id).orElse(null);
	}

	@Override
	public void save(Empresas empresa) {
		
		empresasDao.save(empresa);
	}

	@Override
	public void delete(Long id) {
		
		empresasDao.deleteById(id);
	}

}
