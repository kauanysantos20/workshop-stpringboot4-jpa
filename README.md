# API REST em Java com Spring Boot, JPA/Hibernate e H2
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/kauanysantos20/workshop-stpringboot4-jpa/blob/main/LICENSE)

# Sobre o projeto

Este projeto consiste no desenvolvimento de uma API REST em Java, utilizando Spring Boot, com persistência de dados por meio do JPA/Hibernate e banco de dados H2 para ambiente de testes. O objetivo do projeto é aplicar, de forma prática, os principais conceitos do desenvolvimento backend, seguindo boas práticas de arquitetura e organização de código.

A aplicação foi estruturada em camadas lógicas (controller/resource, service e repository), promovendo separação de responsabilidades, manutenibilidade e clareza no código. O projeto implementa operações CRUD (Create, Read, Update e Delete), mapeamento de entidades, relacionamentos entre tabelas e tratamento de exceções.

O banco de dados H2 é utilizado para facilitar testes e desenvolvimento, permitindo a visualização e manipulação dos dados em memória durante a execução da aplicação. Além disso, o projeto reforça conceitos como injeção de dependência, uso de anotações do Spring, modelagem de domínio e integração com banco de dados relacional.

Este projeto possui caráter educacional, sendo desenvolvido com o propósito de consolidar conhecimentos em Spring Boot, JPA/Hibernate e construção de APIs REST, servindo também como parte do portfólio acadêmico e profissional.

## Modelo de Domínio
![Modelo de Dominio](https://github.com/kauanysantos20/workshop-stpringboot4-jpa/blob/main/Modelo_dominio.png)

## Instância de Domíni
![Modelo de Dominio](https://github.com/kauanysantos20/workshop-stpringboot4-jpa/blob/main/Inst%C3%A2ncia%20de%20Dom%C3%ADnio.png)

# Ferramentas utilizadas
- Java  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- H2 Database  
- Maven  
- Postman / Insomnia  
- Git e GitHub

  
# Como executar o projeto

## Back end
Pré-requisitos: Java 21

```bash
# clonar repositório
git clone https://github.com/kauanysantos20/workshop-stpringboot4-jpa

# entrar na pasta do projeto back end
cd workshop-springboot4-jpa

# executar o projeto
./mvnw spring-boot:run
```

## Banco de dados H2

```bash
# Console h2
http://localhost:8080/h2-console
```
## JDBC url
```makefile
jdbc:h2:mem:testdb
```
Usuário: sa

Senha: (em branco)


# Autor

Kauany das Graças dos Santos

www.linkedin.com/in/kauany-santos-a60007333
