package com.example.demo.dtos;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ConsultaDTO {

    private Long id;
    @NotNull(message = "Data e hora são obrigatórias")
    @FutureOrPresent(message = "A consulta não pode ser agendada no passado")
    private LocalDateTime dataHora;
    @NotBlank(message = "Local da consulta é obrigatório")
    private String local;
    @NotBlank(message = "Status da consulta é obrigatório")
    private String status;
    @NotNull(message = "ID do animal é obrigatório")
    private Long animalId;
    @NotNull(message = "ID do veterinário é obrigatório")
    private Long veterinarioId;
    @NotNull(message = "ID do prontuário é obrigatório")
    private Long prontuarioId;

    public ConsultaDTO() {}

    public ConsultaDTO(Long id, LocalDateTime dataHora, String local, String status,
                       Long animalId, Long veterinarioId, Long prontuarioId) {
        this.id = id;
        this.dataHora = dataHora;
        this.local = local;
        this.status = status;
        this.animalId = animalId;
        this.veterinarioId = veterinarioId;
        this.prontuarioId = prontuarioId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Long animalId) {
        this.animalId = animalId;
    }

    public Long getVeterinarioId() {
        return veterinarioId;
    }

    public void setVeterinarioId(Long veterinarioId) {
        this.veterinarioId = veterinarioId;
    }

    public Long getProntuarioId() {
        return prontuarioId;
    }

    public void setProntuarioId(Long prontuarioId) {
        this.prontuarioId = prontuarioId;
    }

    
}
