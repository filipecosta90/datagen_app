package com.test.datagen;
import com.github.javafaker.*;
/**
 * Hello world!
 * includes Faker sample
 */
public class App {
  public static void main(String[] args) {
    Faker faker = new Faker();
    Name name = faker.name();
    String fullName = name.fullName();
    String firstName = name.firstName();
    String lastName = name.lastName();
    String streetAddress =
        faker.address().streetAddress();

    System.out.println("Full Name: " + fullName.toString() + "\tFirst Name: " + firstName.toString() + "\tLast Name: " + lastName.toString() + "\nAddress: "+ streetAddress.toString() );
  }
}
