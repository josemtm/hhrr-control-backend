package hhrr.dao;




import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import hhrr.entity.Trabajos;

public interface TrabajosDao extends PagingAndSortingRepository<Trabajos, Long> {


	@Query("SELECT t FROM Trabajos t WHERE t.estado = 'cerrada'")
	List<Trabajos> findAllCerradas(); 
	
	@Query("SELECT t FROM Trabajos t WHERE t.estado = 'abierta'")
	List<Trabajos> findAllAbiertas(); 
	
	
}
