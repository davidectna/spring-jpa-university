package springjana60.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springjana60.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
