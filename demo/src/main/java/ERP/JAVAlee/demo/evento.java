package ERP.JAVAlee.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class evento {
    
    @RequestMapping("/")
    String teste(){
        return "teste";
    }
}
