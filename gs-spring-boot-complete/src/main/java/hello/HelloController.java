package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @RequestMapping("/index")
    public String index(String name) {
    	System.out.println("jjjjjjjjj"+name);
        return "/index";
    }
    
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestBody Hello hello) {
    	System.out.println("jjjjjjjjj"+hello.getName());
        return "index";
    }
    
}
