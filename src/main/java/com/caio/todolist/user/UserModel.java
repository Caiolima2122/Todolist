package com.caio.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data //Annotation responsavel por substituir getters e setters
@Entity(name = "tb_users") //Vira uma tabela no banco de dados
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id; //UUID é um tipo de sequencia unica

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
