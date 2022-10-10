package com.design.pattern.creational.builder;

import java.time.LocalDate;

public class UserDto {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;    

    private UserDto() {
    }

    public String getFirstName() {
        return firstName;
    }
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }




    public static class UserDtoBuilder{
        private String fName;
        private String lName;
        private LocalDate bDate;


        public UserDtoBuilder firstName(String fName){
            this.fName = fName;
            return this;
        }
        public UserDtoBuilder lastName(String lName){
            this.lName = lName;
            return this;
        }
        public UserDtoBuilder birthDate(LocalDate bDate){
            this.bDate = bDate;
            return this;
        }

        public UserDto build(){
            UserDto userDto = new UserDto();
            userDto.setFirstName(this.fName);
            userDto.setLastName(this.lName);
            userDto.setBirthDate(this.bDate);
            return userDto;                
        }
    }

    public static UserDtoBuilder builder(){
        return new UserDtoBuilder();
    }

    @Override
    public String toString() {
        return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + "]";
    }
}
