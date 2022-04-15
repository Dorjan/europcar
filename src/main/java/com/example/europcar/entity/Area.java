package com.example.europcar.entity;

import lombok.Data;

import javax.persistence.*;

import java.util.List;

@Entity
@Data
@Table(name = "HB_AREA")
public class Area {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome_area")
    private String nome;

    @OneToMany
    @JoinColumn(name = "id_investimento", referencedColumnName = "id")
    List<Investimento>  investimenti;
}
