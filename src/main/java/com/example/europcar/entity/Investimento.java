package com.example.europcar.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "HB_INVESTIMENTO")
public class Investimento {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome_investimento")
    private String nome;

    @Column(name = "totale_investimento")
    private double totale_invest;

    @Column(name = "data_investimento")
    private LocalDate data_invest;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Categoria categoria;
}
