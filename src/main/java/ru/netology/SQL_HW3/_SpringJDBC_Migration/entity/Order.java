package ru.netology.SQL_HW3._SpringJDBC_Migration.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders2", schema = "netology2")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Упорядочивание идентичности использует специальные столбцы IDENTITY в бд, чтобы позволить базе автоматически присваивать идентификатор объекту при вставке его строки.
    private int id;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false, name = "product_name")
    private String productName;
    @Column(nullable = false)
    private int amount;

    @ManyToOne // отношение заказа к покупателю
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
