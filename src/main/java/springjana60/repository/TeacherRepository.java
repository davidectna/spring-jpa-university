package springjana60.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springjana60.model.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer>{

}
