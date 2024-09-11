package ao.alintana.conhecendo_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ao.alintana.conhecendo_spring.repositories.DiaristaRepository;

@Controller
@RequestMapping("/diaristas")
public class DiaristaController {

    @Autowired
    private DiaristaRepository diaristaRepository;

    @GetMapping
    public ModelAndView buscarTodos() {
        var modelAndView = new ModelAndView("listar_listas");
        modelAndView.addObject("diaristas", diaristaRepository.findAll());

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView buscarPorId(@PathVariable Long id) {
        var modelAndView = new ModelAndView("detalhes");

        modelAndView.addObject("diarista", diaristaRepository.getReferenceById(id));

        return modelAndView;
    }

}
