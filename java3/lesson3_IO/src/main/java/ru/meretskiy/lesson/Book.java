package ru.meretskiy.lesson;

import java.io.Serializable;

public class Book implements Serializable {

    String name;

    public void setName(String name) {
        this.name = name;
    }
}
