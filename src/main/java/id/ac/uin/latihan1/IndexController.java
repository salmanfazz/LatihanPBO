package id.ac.uin.latihan1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping ("API")
public class IndexController {
    @GetMapping("hello")
    public String index(@RequestParam String nama) {
        return "Selamat Belajar Springboot, " + nama + " Diakses pada : " + LocalDate.now();
    }
}
