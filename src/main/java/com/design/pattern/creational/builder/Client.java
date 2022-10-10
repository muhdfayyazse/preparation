package com.design.pattern.creational.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        UserDto userDto = UserDto.builder()
        .firstName("Muhammad")
        .lastName("Fayyaz")
        .birthDate(LocalDate.of(1978, 12,28))
        .build();

        System.out.println(userDto);
    }
}
