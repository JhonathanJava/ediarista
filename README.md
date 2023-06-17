# Projeto E-Diaristas

Projeto desenvolvido para aprendizagem de Java e Spring Boot

## Dependendências do Projeto

- Spring Boot
- Spring Web MVC
- Thymeleaf
- Spring Data JPA
- Bean Validation

## Dependências de Desenvolvimento

- Spring Boot Devtools
- Lombok

## Requisitos

- Java 17
- Maven 3.8

## Como testar esse projeto na minha máquina?

Clone este repositório e entre na pasta do projeto.

```sh
git clone https://github.com/JhonathanJava/ediarista.git
cd ediaristas
```

Atualize as configurações de acesso ao banco de dados no arquivo [application.properties](src/main/resources/application.properties).

```properties
spring.datasource.url=jdbc:mysql://host:porta/banco_de_dados
spring.datasource.username=usuario
spring.datasource.password=senha
```

Execute o projeto através do Maven.

```sh
mvn spring-boot:run
```

Acesse a aplicação em [http://localhost/admin/servicos](http://localhost/admin/servicos).
