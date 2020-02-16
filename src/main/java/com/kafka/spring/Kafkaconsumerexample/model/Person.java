package com.kafka.spring.Kafkaconsumerexample.model;

public class Person {

   private String id;
   private String name;

   @Override
   public String toString() {
      return "Person{" +
              "id='" + id + '\'' +
              ", name='" + name + '\'' +
              '}';
   }
}
