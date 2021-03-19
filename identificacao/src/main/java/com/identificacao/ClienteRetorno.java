package com.identificacao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;


@Getter
@Setter
@ToString
public class ClienteRetorno {
    private String nome;
    private String id_cliente;
    private String perfil;

    public ClienteRetorno(String nome, String id_cliente, String segmento) {
        this.nome = nome;
        this.id_cliente = id_cliente;
        this.perfil = MascararPerfil(segmento);
    }

    public String MascararPerfil(String segmento){
        switch(segmento){
            case "Varejo":
                return "Perfil (1)";
            case "PF e PJ (exemplo: uniclass e empresas encarteirado)":
                return "Perfil (3)";
            case "Uniclass":
                return "Perfil (4)";
            case "Personnalité na AGL":
                return "Perfil (5)";
            case "Personnalité na A. Personnalité":
                return "Perfil (6)";
            case "Conta salário":
                return "Perfil (7)";
            case "EMP4 desencarteirado":
                return "Perfil (8)";
            case "Empresas":
                return "Perfil (9)";
            case " Itaú BBA":
                return "Perfil (10)";
            case "EMP UM/DOIS/TRÊS":
                return "Perfil (11)";
            case "Não correntista/cartonista":
                return "Perfil (0)";
            default:
                return ("Perfil (0)");
        }

    };
}
