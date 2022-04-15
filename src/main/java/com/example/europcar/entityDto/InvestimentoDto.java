package com.example.europcar.entityDto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class InvestimentoDto {
    

    private String nome;
    private double totale_investimento;
    private LocalDate data_investimento;
    private String nome_categoria;

}
