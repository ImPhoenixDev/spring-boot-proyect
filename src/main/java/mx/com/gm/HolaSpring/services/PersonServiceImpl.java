package mx.com.gm.HolaSpring.services;

import mx.com.gm.HolaSpring.dao.PersonDao;
import mx.com.gm.HolaSpring.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    @Transactional(readOnly = true)
    public List<Person> listPersons() {
        return (List<Person>) this.personDao.findAll();
    }

    @Override
    @Transactional
    public void savePerson(Person person) {
        this.personDao.save(person);
    }

    @Override
    @Transactional
    public void deletePerson(Person person) {
        this.personDao.delete(person);
    }

    @Override
    public Person findPerson(Person person) {
        return this.personDao.findById(person.getId_person()).orElse(null);
    }
}