# 🎓 API - Sistema Acadêmico (Aluno Online)
<p align="center">

<img src="https://img.shields.io/badge/Java-21-F89820?style=for-the-badge&logo=java&logoColor=white"/>

<img src="https://img.shields.io/badge/Spring_Boot-4.x-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>

<img src="https://img.shields.io/badge/PostgreSQL-Database-4169E1?style=for-the-badge&logo=postgresql&logoColor=white"/>

<img src="https://img.shields.io/badge/Status-Concluído-27ae60?style=for-the-badge&logo=check&logoColor=white"/>

</p>


## 📌 Sobre o Projeto
Esta API REST foi desenvolvida utilizando **Spring Boot**, com o objetivo de gerenciar um sistema acadêmico completo, permitindo o gerenciamento de alunos, professores, disciplinas e matrículas.

A aplicação permite operações completas de CRUD (Create, Read, Update e Delete), além de regras de negócio relacionadas ao controle de matrículas acadêmicas, seguindo boas práticas de desenvolvimento como arquitetura em camadas e separação de responsabilidades.


---

## 🧠 Arquitetura do Projeto

O projeto foi estruturado em camadas:

```
src/
├── model/
├── repository/
├── service/
├── controller/
├── dtos/
```

* **Model** → Representa as entidades do sistema (Aluno, Professor, Disciplina e Matrícula)
* **Repository** → Responsável pelo acesso ao banco de dados (JPA)
* **Service** → Contém as regras de negócio
* **Controller** → Responsável pelos endpoints da API
*  **DTOs** → Objetos utilizados para transferência de dados entre cliente e API

---

## ⚙️ Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* PostgreSQL
* DBeaver
* Insomnia
* Lombok

---

## 🔄 CRUD Implementado

### 👨‍🎓 Aluno

| Método | Endpoint     | Descrição     |
| ------ | ------------ | ------------- |
| POST   | /alunos      | Criar aluno   |
| GET    | /alunos      | Listar alunos |
| GET    | /alunos/{id} | Buscar por ID |
| PUT    | /alunos/{id} | Atualizar     |
| DELETE | /alunos/{id} | Deletar       |

---

### 👨‍🏫 Professor

| Método | Endpoint          | Descrição          |
| ------ | ----------------- | ------------------ |
| POST   | /professores      | Criar professor    |
| GET    | /professores      | Listar professores |
| GET    | /professores/{id} | Buscar por ID      |
| PUT    | /professores/{id} | Atualizar          |
| DELETE | /professores/{id} | Deletar            |

---

### 📚 Disciplina

| Método | Endpoint          | Descrição          |
| ------ | ----------------- | ------------------ |
| POST   | /disciplinas      | Criar disciplina   |
| GET    | /disciplinas      | Listar disciplinas |
| GET    | /disciplinas/{id} | Buscar por ID      |
| PUT    | /disciplinas/{id} | Atualizar          |
| DELETE | /disciplinas/{id} | Deletar            |

---

## 📝 Funcionalidades de Matrícula

| Método | Endpoint                         | Descrição |
| ------ | -------------------------------- | ---------- |
| POST   | /matriculas                      | Criar matrícula |
| PATCH  | /matriculas/trancar/{id}         | Trancar matrícula |
| PATCH  | /matriculas/atualizar-notas/{id} | Atualizar notas |

---

## 🧪 Testes com Insomnia

A API foi testada utilizando o Insomnia para simular requisições HTTP.


### 🔹 Criar aluno (POST)
<img width="1918" height="1021" alt="image" src="https://github.com/user-attachments/assets/f673eb7f-555d-4d9b-8bf0-97f7b566ad43" />



### 🔹 Listar alunos (GET)
<img width="1918" height="1013" alt="image" src="https://github.com/user-attachments/assets/69579070-f01d-4ee5-a53f-93e7523576d6" />


### 🔹 Buscar aluno por ID (GET)
<img width="1917" height="997" alt="image" src="https://github.com/user-attachments/assets/1ad4bbe5-2bcd-4eda-9849-86f837e50057" />


### 🔹 Atualizar aluno por ID (PUT)
<img width="1918" height="1021" alt="image" src="https://github.com/user-attachments/assets/1d0eacd9-ae22-481c-90c1-79dfd7d63a69" />

### 🔹 Deletar aluno por ID (DELETE)
<img width="1918" height="1022" alt="image" src="https://github.com/user-attachments/assets/84fc442c-f24c-4a33-8b07-f047d094a0d4" />

### 🔹 Criar professor (POST)
<img width="1918" height="1017" alt="image" src="https://github.com/user-attachments/assets/b7407fc8-2433-40c2-81c3-cfd00341dd0f" />

### 🔹 Listar professores (GET)
<img width="1918" height="1013" alt="image" src="https://github.com/user-attachments/assets/567b25f6-30bb-4987-9999-d538ebc4e7f3" />

### 🔹 Buscar professor por ID (GET)
<img width="1918" height="1016" alt="image" src="https://github.com/user-attachments/assets/b6bd2c75-d10a-44c4-8545-c39990763a76" />

### 🔹 Atualizar professor por ID (PUT)
<img width="1918" height="1018" alt="image" src="https://github.com/user-attachments/assets/1249ab94-3cc6-4e31-ab5d-9cbcc33091ae" />

### 🔹 Deletar professor por ID (DELETE)
<img width="1918" height="1018" alt="image" src="https://github.com/user-attachments/assets/aa750c44-0be6-461a-a574-5abbb509587c" />

### 🔹 Criar Disciplina (POST)
<img width="1600" height="798" alt="image" src="https://github.com/user-attachments/assets/cd4bdf13-f9d7-441e-80cc-5fffdd903449" />

### 🔹 Listar todas as Disciplinas (GET)
<img width="1600" height="797" alt="image" src="https://github.com/user-attachments/assets/dbcab198-4135-46eb-bf9e-d96661bebc64" />

### 🔹 Buscar Disciplina por ID (GET)
<img width="1600" height="790" alt="image" src="https://github.com/user-attachments/assets/d957d178-631f-4128-a00e-a19c8a2266d8" />

### 🔹 Atualizar Disciplina por ID (PUT)
<img width="1600" height="792" alt="image" src="https://github.com/user-attachments/assets/32ae286c-6031-4edc-a129-aefa0fc1d2ab" />

### 🔹 Deletar Disciplina por ID (DELETE)
<img width="1600" height="794" alt="image" src="https://github.com/user-attachments/assets/07505dd0-3430-4a3f-acfa-da517e616e68" />

### 🔹 Criar Matrícula (POST)
<img width="1600" height="792" alt="image" src="https://github.com/user-attachments/assets/cc604e3a-63d8-4744-aaa7-db94def133ae" />

### 🔹 Trancar Matrícula (PATCH)
<img width="1600" height="789" alt="image" src="https://github.com/user-attachments/assets/e4fce5b6-b404-4e41-966c-64c7c64c6e17" />

### 🔹 Atualizar notas (PATCH)
<img width="1600" height="789" alt="image" src="https://github.com/user-attachments/assets/343e83c9-e29f-47fd-8d28-cf907845c09e" />

---

## 🗄️ Banco de Dados

Foi utilizado o **PostgreSQL** como banco de dados, com gerenciamento pelo DBeaver.

### 🔹 Tabela Aluno
<img width="1600" height="849" alt="image" src="https://github.com/user-attachments/assets/627279e6-2754-4dcf-a1a4-99a7b158cd84" />


### 🔹 Tabela Professor
<img width="1600" height="848" alt="image" src="https://github.com/user-attachments/assets/220cfda4-29a9-4ce0-ae5c-90e617074b5e" />


### 🔹 Tabela Disciplina
<img width="1600" height="845" alt="image" src="https://github.com/user-attachments/assets/b8256587-73ec-46c8-aaed-2bf4b9d832b2" />

### 🔹 Tabela matricula_aluno
<img width="1600" height="846" alt="image" src="https://github.com/user-attachments/assets/cae66cd8-8709-477d-b51b-fcec90de044f" />


---

## ⚙️ Como Executar o Projeto

1. Clonar o repositório:

```
git clone https://github.com/mgabrielegoncalves/aluno-online-api.git
```
 2. Abrir o projeto em uma IDE (IntelliJ, Eclipse)
 
 3. Configurar o banco de dados PostgreSQL no arquivo `application.properties`

 4. Executar a classe `ApiApplication`

 5. A API estará disponível em:

```
http://localhost:8080
```

---

## 📊 Detalhamento do Código

* Os **Controllers** recebem as requisições HTTP e direcionam para os serviços;
* Os **Services** processam as regras de negócio da aplicação;
* Os **Repositories** fazem a comunicação com o banco de dados utilizando Spring Data JPA;
* As **Entities (Model)** representam as tabelas do banco de dados;
* Os **DTOs** são utilizados para transferência de dados específicos entre cliente e API;
* O projeto utiliza **Derived Query** para criação de consultas personalizadas através da nomenclatura dos métodos no Repository;
* As regras de matrícula utilizam **Enum** para controle de status acadêmico.
---

## 👩‍💻 Autora

Maria Gabriele Araújo Gonçalves

---

## 📌 Status

✅ Projeto finalizado e funcional
