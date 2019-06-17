package ERP.JAVAlee.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class evento {
    
    /*@RequestMapping("/")
    public String teste(){
    	System.out.println("Entrou no principal!!");
        return "teste";
    }*/
    
    @RequestMapping("/inicial")
    public String inicial(){
    	System.out.println("Entrou no inicial!!");
        return "PORQUE ESSA MERDA NAO FUNCIONA CARALHO!";
    }
}
