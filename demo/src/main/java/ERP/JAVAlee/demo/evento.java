package ERP.JAVAlee.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class evento {
    
    @RequestMapping("/")
    public String teste(){
        return "teste";
    }
    
    @RequestMapping("/inicial")
    public String inicial(){
        return "inicial";
    }
}
