package br.com.luaccminerva.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    Modificadores:
    * public
    * private
    * protected
*/
@RestController
@RequestMapping ("/users")
public class UserController {
    /*
        * String: texto
        * Integer: int, numeros inteiros
        * Double: numeros 0,000
        * Float: numeros 0,00
        * Char: caracteres 
        * Date: data
        * Void: não tem retorno
    */
    @PostMapping("/")
    public void create (@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}
