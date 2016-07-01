package net.chandol.study.e2e;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}