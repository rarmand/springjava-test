package com.dataproject.testproject.topic;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
// oznacza ze klasa jest mapowaniem na tabele relacyjnej bazy
public class Topic {


    @Id
    // kolumny tabeli bazy danych
    private String id;
    private String name;
    private String description;


    public Topic() {

    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
