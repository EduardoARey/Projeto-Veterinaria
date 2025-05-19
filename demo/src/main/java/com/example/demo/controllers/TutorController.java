package com.example.demo.controllers;

import com.example.demo.models.Tutor;
import com.example.demo.services.TutorService;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    
    @PostMapping
    public ResponseEntity<Tutor> criarTutor(@RequestBody @Valid Tutor tutor) {
        Tutor salvo = tutorService.salvar(tutor);
        return ResponseEntity.ok(salvo);
    }

    
    @GetMapping
    public ResponseEntity<List<Tutor>> listarTutores() {
        List<Tutor> tutores = tutorService.listarTodos();
        return ResponseEntity.ok(tutores);
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Tutor> buscarPorId(@PathVariable Long id) {
        return tutorService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<Tutor> atualizarTutor(@PathVariable Long id, @RequestBody @Valid Tutor tutorAtualizado) {
        try {
            Tutor atualizado = tutorService.atualizar(id, tutorAtualizado);
            return ResponseEntity.ok(atualizado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTutor(@PathVariable Long id) {
        if (tutorService.deletar(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
