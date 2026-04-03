# EAD APP SEC Turma 2026 1

Projeto para  reconhecimento de sistemas inseguros para fins academicos

## Desing
Este projeto segui principios do mvc a fim de organizar o codigo e facilitar a manutencao do projeto

```
├── README.md
├── src
....
│   ├── <domain_name> -- pasta para o dominio do projeto
│   │   ├── <domain_name>.model.java -- classe de modelo para o dominio
│   │   ├── <domain_name>.controller.java -- classe de controle para o dominio
│   │   ├── <domain_name>.repository.java -- classe de repositorio para o dominio
│   │   └── <domain_name>.service.java -- classe de servico para o dominio
│   └── Application.java
```

## Dominios
Sistema de cadastro de usuarios e produtos, onde o usuario pode cadastrar, editar e excluir produtos, e o administrador pode gerenciar os usuarios e os produtos cadastrados

- Usuario: id, nome, email, senha, tipo (admin ou usuario)
- Produto: id, nome, descricao, preco, quantidade
- Pedido: id, usuario, produto, quantidade, status (pendente, aprovado, rejeitado)
- Categoria: id, nome, descricao

- authentication: sistema de autenticacao para os usuarios, onde o usuario pode se cadastrar e fazer login para acessar as funcionalidades do sistema

## Tecnologias utilizadas
- Java 17
- Spring Boot 4.0.5
- Spring Data JPA
- H2 Database
- Spring Web
- Spring Boot DevTools
- Maven
- Lombok
- swagger-ui

## Comandos para rodar o projeto
- `./mvnw spring-boot:run ` para rodar o projeto
- `./mvnw clean install` para limpar e construir o projeto