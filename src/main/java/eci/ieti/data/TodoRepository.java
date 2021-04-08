package eci.ieti.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import eci.ieti.data.model.Todo;

/**
 *
 * @author JuanRomero11
 */
public interface TodoRepository extends CrudRepository<Todo, Long>{
    
    Page<Todo> findByResponsible(String responsible, Pageable pageable);
    
}