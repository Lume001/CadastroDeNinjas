package dev.java10x.CadastroDeNinja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //é um controlador para API rest
@RequestMapping //faz um mapa de todas as rotas
public class NinjaController {


    @GetMapping("/boasvindas")//pega informações
    public String boasVindas() {
        return"Essa é minha primeira mensagem nessa rota";
    }



}
