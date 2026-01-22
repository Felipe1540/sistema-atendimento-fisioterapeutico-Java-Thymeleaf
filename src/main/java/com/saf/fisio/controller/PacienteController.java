package com.saf.fisio.controller;

import com.saf.fisio.model.Anamnese;
import com.saf.fisio.model.Paciente;
import com.saf.fisio.repository.AnamneseRepository;
import com.saf.fisio.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private AnamneseRepository anamneseRepository;

    // Listagem de Pacientes
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pacientes", pacienteRepository.findAll());
        return "pacientes/lista";
    }

    // Salvar o Paciente
    @PostMapping("/salvar")
    public String salvar(Paciente paciente) {
        pacienteRepository.save(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/novo")
    public String novoForm(Model model) {
        model.addAttribute("paciente", new Paciente()); // para o th:object
        return "pacientes/formulario";
    }


    @GetMapping("/{id}/anamnese")
    public String novaAnamnese(@PathVariable Long id, Model model) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Paciente inválido"));

        Anamnese anamnese = new Anamnese();
        anamnese.setPaciente(paciente);

        model.addAttribute("anamnese", anamnese);
        model.addAttribute("paciente", paciente);
        return "pacientes/anamnese";
    }

    @PostMapping("/anamnese/salvar")
    public String salvarAnamnese(Anamnese anamnese) {
        anamneseRepository.save(anamnese);
        return "redirect:/pacientes";
    }

    @GetMapping("/{id}")
    public String verPerfil(@PathVariable Long id, Model model) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Paciente inválido"));

        model.addAttribute("paciente", paciente);
        // As anamneses já virão dentro do objeto paciente se o mapeamento @OneToMany estiver correto
        return "pacientes/perfil";
    }
}