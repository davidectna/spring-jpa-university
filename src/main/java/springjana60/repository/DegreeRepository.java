package springjana60.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springjana60.model.Degree;

@Repository
public interface DegreeRepository extends CrudRepository<Degree, Integer>{

}
