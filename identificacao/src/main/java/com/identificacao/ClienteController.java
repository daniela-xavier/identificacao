package com.identificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Random;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRep;

    Cliente cli = new Cliente();
    ClienteRetorno cliRet;

    @RequestMapping(value = "/cliente/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getEntityById(@PathVariable("id") long id) {
        cli = clienteRep.findById(id).get();
        cliRet = new ClienteRetorno(cli.getPrimeironome(), String.valueOf(cli.getId()), cli.getSegmento());
        return cliRet.toString();
    }

    @RequestMapping(value = "/cliente", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ClienteRetorno getClienteByFilter(@RequestBody ClienteRequest clienteReq) {
        System.out.println(clienteReq.toString());

        if(!clienteReq.getCpfcnpj().isEmpty()) {
            cli = clienteRep.findByCpfcnpj(clienteReq.getCpfcnpj());
        }

        if(!clienteReq.getAgencia().isEmpty() && !clienteReq.getConta().isEmpty()) {
            cli = clienteRep.findByAgenciaAndConta(clienteReq.getAgencia(), clienteReq.getConta());
        }

        if (cli != null)
            cliRet = new ClienteRetorno(cli.getPrimeironome(), String.valueOf(cli.getId()), cli.getSegmento());
        else
            cliRet = new ClienteRetorno(" ", "0", "Não correntista/cartonista");

        return cliRet;
    }



}
