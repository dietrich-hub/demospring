package com.fly.demo.controllers;

import com.fly.demo.dao.PatientRepository;
import com.fly.demo.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;
    @GetMapping(path = "/index")
    public String index(){
        return "pages/index";
    }
    @GetMapping(path = "/patients")
    public String list(Model model,@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue = "5") int size,@RequestParam(name="keyword",defaultValue = "") String mc){
        Page<Patient> pagePatients = patientRepository.findByNameContains(mc,PageRequest.of(page,size));
        model.addAttribute("patients",pagePatients.getContent());
        model.addAttribute("pages", new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",mc);
        return  "pages/patients";
    }

    @GetMapping(path = "/formPatient")
    public String formPatient(Model model){
        model.addAttribute("patient",new Patient());
        return "pages/formPatient";
    }

    @PostMapping("/savePatient")
    public String savePatient(@Valid Patient patient, BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "pages/formPatient";
        patientRepository.save(patient);
        return "pages/formPatient";
    }

    @GetMapping(path = "/editPatient")
    public String editPatient(Model model,Long id){
        Patient p = patientRepository.findById(id).get();
        model.addAttribute("patient",p);
        return "pages/formPatient";
    }
    @GetMapping("/patients/{id}")
    @ResponseBody
    public Patient getOne(@PathVariable Long id){
        return patientRepository.findById(id).get();
    }
}
