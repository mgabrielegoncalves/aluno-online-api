# 🎓 API - Sistema Acadêmico (Aluno Online)
<p align="center">

<img src="https://img.shields.io/badge/Java-21-F89820?style=for-the-badge&logo=java&logoColor=white"/>

<img src="https://img.shields.io/badge/Spring_Boot-4.x-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>

<img src="https://img.shields.io/badge/PostgreSQL-Database-4169E1?style=for-the-badge&logo=postgresql&logoColor=white"/>

<img src="https://img.shields.io/badge/Status-Concluído-27ae60?style=for-the-badge&logo=check&logoColor=white"/>

</p>


## 📌 Sobre o Projeto

Esta API REST foi desenvolvida utilizando **Spring Boot** com o objetivo de gerenciar dados acadêmicos de alunos e professores.

A aplicação permite realizar operações completas de **CRUD (Create, Read, Update, Delete)**, seguindo boas práticas de desenvolvimento como arquitetura em camadas e separação de responsabilidades.

---

## 🧠 Arquitetura do Projeto

O projeto foi estruturado em camadas:

```
src/
├── model/
├── repository/
├── service/
├── controller/
```

* **Model** → Representa as entidades do sistema (Aluno e Professor)
* **Repository** → Responsável pelo acesso ao banco de dados (JPA)
* **Service** → Contém as regras de negócio
* **Controller** → Responsável pelos endpoints da API

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

---

## 🗄️ Banco de Dados

Foi utilizado o **PostgreSQL** como banco de dados, com gerenciamento pelo DBeaver.

### 🔹 Tabela Aluno
<img width="1918" height="1016" alt="image" src="https://github.com/user-attachments/assets/693da72b-8bd7-407b-9de5-35b17e2385a9" />

### 🔹 Tabela Professor
<img width="1918" height="1020" alt="image" src="https://github.com/user-attachments/assets/c28d21ae-2d23-4244-be05-ca31e314a1f7" />


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
* Os **Services** processam as regras de negócio;
* Os **Repositories** fazem a comunicação com o banco de dados usando JPA;
* As **Entities (Model)** representam as tabelas no banco.

---

## 👩‍💻 Autora

Maria Gabriele Araújo Gonçalves

---

## 📌 Status

✅ Projeto finalizado e funcional
