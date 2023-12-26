package ru.netology.SQL_HW3._SpringJDBC_Migration.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers2", schema = "netology2")
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Упорядочивание идентичности использует специальные столбцы IDENTITY в DB, чтобы позволить базе автоматически присваивать идентификатор объекту при вставке его строки.
    private int id;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 50)
    private String surname;
    private int age;
    @Column(nullable = false, name = "phone_number", unique = true, length = 10)
    private String phoneNumber;
}
