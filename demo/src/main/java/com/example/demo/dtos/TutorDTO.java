package com.example.demo.dtos;

import java.util.List;

public class TutorDTO {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private String cpf;
    private List<Long> animaisIds;

    public TutorDTO() {
    }

    public TutorDTO(Long id, String nome, String telefone, String email, String endereco, String cpf, List<Long> animaisIds) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
        this.animaisIds = animaisIds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Long> getAnimaisIds() {
        return animaisIds;
    }

    public void setAnimaisIds(List<Long> animaisIds) {
        this.animaisIds = animaisIds;
    }
}
