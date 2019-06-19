package ERP.JAVAlee.demo;


import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class evento {
    
    @RequestMapping("/")
    public String teste(){
    	System.out.println("Entrou no principal!!");
        return "paginaInicial.html";
    }
	
	@RequestMapping("/user/cadastrar")
    public String cadastrar(){
		System.out.println("Entrou no cadastrar!!");
		return "cadastrar.html";
    }
	
	@RequestMapping("/user/logar")
    public String logar(){
		System.out.println("Entrou no cadastrar!!");
		return "logar.html";
    }
    
    @RequestMapping("/inicial")
    public String inicial(){
    	System.out.println("Entrou no inicial!!");
        return "dataagr.jsp";
    }
    
    
}
