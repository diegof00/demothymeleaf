package net.javablackend.demothymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Inicio");
        return "index"; // Retorna la vista home.html que usa la plantilla base
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "InicioX");
        return "home"; // Retorna la vista home.html que usa la plantilla base
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Acerca de Nosotros");
        return "about"; // Retorna una nueva vista que crearemos para la página "Acerca"
    }
}
