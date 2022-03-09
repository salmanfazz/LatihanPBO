package id.ac.uin.latihan1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("API")
public class IndexController {
    @GetMapping("hello")
    public String hello() {
        return "Selamat Belajar Springboot";
    }
}
