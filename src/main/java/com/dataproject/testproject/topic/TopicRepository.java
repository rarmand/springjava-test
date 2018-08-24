package com.dataproject.testproject.topic;

import org.springframework.data.repository.CrudRepository;

// implementuje logike dzialania entity class
// wszystkie elementy pobierania danych w SQL
public interface TopicRepository extends CrudRepository<Topic, String> {


    // metody do dzialania w bazie SQL
    // ktore chyba nie musza byc zaimplementowane
    // dlatego nalezy tu stworzyc interface

    // getAllTopics()
    // getTopic(String id)
    // updateTopic(Topic t)
    // deleteTopic(String id)
}
