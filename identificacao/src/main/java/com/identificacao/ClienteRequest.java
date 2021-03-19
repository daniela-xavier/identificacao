package com.identificacao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;

@Getter
@Setter
@ToString
public class ClienteRequest {

    private String cpfcnpj ;
    private String agencia;
    private String conta;
    private String numeroCartao;
    private String qrCode;
    private String beacon;

}
