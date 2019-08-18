package hhrr.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import hhrr.entity.Empresas;

public interface EmpresasDao extends PagingAndSortingRepository<Empresas,Long> {

}
