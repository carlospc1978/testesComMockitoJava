package main.service;

public class Service {

    String email;

    public Service(String email) {
        this.email = email;
    }

    ConsumoDaService consumoDaService;

    public void SalvarEnviarEmail(){
        consumoDaService.salvoNoBancoDeDados();
    }

}
