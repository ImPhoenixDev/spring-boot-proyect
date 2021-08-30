package mx.com.gm.HolaSpring.services;

import mx.com.gm.HolaSpring.domain.Person;

import java.util.List;

public interface PersonService {

    public List<Person> listPersons();

    public void saveNewPerson(Person person);

    public void deletePerson(Person person);

    public void findPerson(Person person);


}