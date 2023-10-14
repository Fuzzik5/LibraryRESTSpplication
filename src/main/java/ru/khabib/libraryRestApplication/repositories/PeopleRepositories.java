package ru.khabib.libraryRestApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.khabib.libraryRestApplication.models.Person;

import java.util.Optional;

@Repository
public interface PeopleRepositories extends JpaRepository<Person, Integer> {
    Optional<Person> findPersonByName(String name);

}


