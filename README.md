<h1 align="center">
  TODO List
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Linkedin&message=Pedro%20Leite&color=white&labelColor=blue"  alt="Linkedin Pedro Leite"/>
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=blue&labelColor=white" alt="Desafio" />
</p>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Tarefa
```
$ http POST :8080/tasks name="Task 1" description="Desc Task 1" priority=1

[
  {
    "name": "Task 1",
    "description": "Desc Task 1",
    "priority": 1,
    "done": false
  }
]
```

- Listar Tarefas
```
$ http GET :8080/tasks

[
  {
    "id": 1,
    "name": "Task 1",
    "description": "Desc Task 1",
    "priority": 1,
    "done": false
  }
]
```

- Atualizar Tarefa
```
$ http PUT :8080/tasks/1 nome="nova task 1" description="Desc Rask 1" priority=2

[
  {
    "id": 1,
    "name": "nova task 1",
    "description": "Desc Task 1",
    "priority": 1,
    "done": false
  }
]
```

- Remover Tarefa
```
http DELETE :8080/tasks/1

[ ]
```