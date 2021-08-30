package mx.com.gm.HolaSpring.services;

import mx.com.gm.HolaSpring.domain.Person;

import java.util.List;

public interface PersonService {

    public List<Person> listPersons();

    public void savePerson(Person person);

    public void deletePerson(Person person);

    public Person findPerson(Person person);


}