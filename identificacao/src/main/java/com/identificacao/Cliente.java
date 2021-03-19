package com.identificacao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    //@Column(name = "id")
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "cpf_cnpj")
    private String cpfcnpj ;

    @Column(name = "agencia")
    private String agencia;

    @Column(name = "conta")
    private String conta;

    @Column(name = "primeiro_nome")
    private String primeironome ;

    @Column(name = "nome_completo")
    private String nome_completo;

    @Column(name = "dt_nasc")
    private String dtnasc;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "celular")
    private String celular;

    @Column(name = "segmento")
    private String segmento;
}
