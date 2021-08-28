package mx.com.gm.HolaSpring.dao;


import mx.com.gm.HolaSpring.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Long> {

}