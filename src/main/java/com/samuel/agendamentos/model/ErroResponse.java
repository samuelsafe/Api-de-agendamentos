package com.apideagendamento.api_de_agendamento.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErroResponse {
    private int status;
    private String erro;
}