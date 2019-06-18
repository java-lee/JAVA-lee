package ERP.JAVAlee.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class evento {
    
    @RequestMapping("/")
    public String teste(){
    	System.out.println("Entrou no principal!!");
        return "paginaInicial.html";
    }
    
    @RequestMapping("/inicial")
    public String inicial(){
    	System.out.println("Entrou no inicial!!");
        return "dataagr.jsp";
    }
}
