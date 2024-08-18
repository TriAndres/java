package ru.yandex.practicum.user;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    private String name;
    private String lastName;
    private String password;
    private String argument;
    private LocalDateTime localDateTime = LocalDateTime.now();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

    public String getLocalDateTime() {
        return localDateTime.format(formatter);

    }

    public String getLocalDateTimePlusDay(int day) {
        localDateTime = localDateTime.plusDays(day);
        return localDateTime.format(formatter);

    }
}