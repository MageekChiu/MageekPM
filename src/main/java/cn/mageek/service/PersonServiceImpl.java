package cn.mageek.service;

import cn.mageek.dao.PersonRepository;
import cn.mageek.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findByAddress(String address) {
        return personRepository.findByAddress(address);
    }
}
