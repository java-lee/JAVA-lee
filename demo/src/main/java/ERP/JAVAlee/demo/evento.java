package ERP.JAVAlee.demo;


import java.security.Principal;
import java.sql.SQLException;

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
    
    @RequestMapping("/user/mandarDados")
    public boolean inserirBd() {
    	System.out.println("MandarDados recebido");
    	try {
    		String nome = "Jose";
        	String senha = "123";
        	BdControler bd = new BdControler();
			bd.inserirDados("INSERT INTO `login`(`log_user`, `log_senha`, `log_permissao`, `log_ativo`) VALUES ('" + nome + "', " + senha + ", " + Permissoes.cliente() + ", " + 1 + ");");
			System.out.println("Passou no inserirDados!!");
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
    }
    
}
