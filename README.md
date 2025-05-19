Levantamento de Requisitos – Sistema PetCare

Cliente: PetCare Digital Solutions LTDA

Integrantes:

    Carlos Eduardo – RA: 235018

    Eduardo Araujo Rey – RA: 235312

    Felipe Camargo – RA: 234890

    Leandro Wendisch Lanzoni – RA: 234840

Objetivo do Sistema

Desenvolver uma aplicação web para clínicas veterinárias de pequeno porte que permita:

    Cadastrar animais e seus tutores.

    Gerenciar agendamentos de consultas com verificação de disponibilidade do veterinário.

    Controlar prontuários e histórico de vacinação dos pets.

    Permitir acesso de tutores e veterinários a informações específicas dos animais.

Escopo Funcional
Módulo 1 – Cadastro de Animais

Cadastrar animais com os seguintes dados:

    Nome

    Espécie (ex: canino, felino)

    Raça

    Data de nascimento

    Associar o animal a um tutor responsável

Módulo 2 – Cadastro de Tutores

Cadastrar tutores com os seguintes dados:

    Nome completo

    CPF

    Telefone

    Endereço completo

    Um tutor pode ter vários animais

Módulo 3 – Gerenciamento de Consultas

Agendar consultas informando:

    Data e hora

    Local

    Veterinário

    Animal

Regras:

    Verificar automaticamente se o veterinário está disponível no horário.

    Verificar se o veterinário está habilitado para atender a espécie do animal.

Módulo 4 – Prontuário e Vacinação

Registrar atendimentos realizados, com:

    Observações do veterinário

    Diagnóstico e tratamento

Registrar vacinas aplicadas, com:

    Nome da vacina

    Data de aplicação

Módulo 5 – Acesso de Usuários

    Tutores poderão visualizar o histórico de vacinação dos seus animais.

    Veterinários poderão visualizar e imprimir o histórico completo de atendimentos e vacinas dos animais.

Requisitos Não Funcionais

    Autenticação de usuários com JWT Token.

    Interface RESTful para integração via frontend ou aplicativos.

    Banco de dados relacional (H2, PostgreSQL ou MySQL).

    Backend construído com Java + Spring Boot.

    Segurança: Apenas usuários autenticados terão acesso aos endpoints privados.

    Documentação dos endpoints (Swagger recomendado).

Regras de Negócio

    Não é permitido agendar dois atendimentos para o mesmo veterinário no mesmo horário.

    Veterinários só podem atender espécies para as quais possuem especialização.

    Tutores só podem visualizar informações de seus próprios animais.

    Registros de vacinas e atendimentos são de responsabilidade dos veterinários.

    O sistema deverá gerar relatórios em PDF com o histórico dos atendimentos dos animais.

Tipos de Usuários e Permissões
Tipo de Usuário	Ações Permitidas
Administrador	Cadastrar veterinários, tutores, animais
Veterinário	Ver e registrar consultas, vacinas, prontuários
Tutor	Visualizar histórico de vacinação dos seus pets
Diagrama do Sistema
![diagrama](https://github.com/user-attachments/assets/78b78f77-93db-48c8-abcb-c4cae8e651ab)
