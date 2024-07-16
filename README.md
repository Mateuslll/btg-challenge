# Desafio BTG-Pactual
Este projeto consiste em processar pedidos e gerar relatórios de produtos utilizando um microsserviço

## Tecnologias Utilizadas
- NoSQL
- MongoDB
- Lombok
- Log4j2
- Maven
- Java
- Rabbitmq
- Junit5
- Mockito
- Docker (Container Mongo)

## Design Patterns Utilizados
- DAO / Repository e Impl / Segregação de interfaces
- DTO
- Builder
- Factory
- Mappers
- Herança TPT no banco de dados

## Organização das classes
<img src='https://github.com/RayanArgolo03/crud-jdbc-mysql-1/assets/113947677/86a378c2-a4ae-4909-811a-c25e738eb690' width='300' height='600'></img>

# Como usar o aplicativo?
## Inicialização com Docker Compose

0. Faça um fork, baixe ou clone o programa

1. Certifique-se de ter o Docker instalado em sua máquina e inicie-o

2. Abra o terminal de sua IDE

3. Certifique-se de ter o mongo e o mongo compass utilize usuario e senha respectivamente login: admin e senha: 123

   ```
   Inicializa database direto no container
   docker-compose up -d
    ```
4. Utilize o app pela IDE e divirta-se :)

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar solicitações de pull (pull requests) com melhorias, correções de bugs ou novas funcionalidades.


