package br.com.async.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Enilson Filho
 */
@RestController(value = "hello")
public class HelloAsyncController {

    @Autowired
    private AsyncService helloService;

    @GetMapping
    public String hello() {
        String mensagemRetorno = "Sucesso!";
        try {
            helloService.hello();
        } catch (InterruptedException e) {
            mensagemRetorno = "Erro.";
        }
        return mensagemRetorno;
    }

}
