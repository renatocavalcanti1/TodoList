package br.com.desafio.desafio_todolist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    private boolean concluido;
    private Integer prioridade = 0;

    public Todo(String nome, String descricao, boolean concluido, Integer prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.concluido = concluido;
        this.prioridade = prioridade;
    }
}
