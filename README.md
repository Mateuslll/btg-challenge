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
<img src='![image](https://github.com/user-attachments/assets/94e3b3b3-27d7-4f91-ac30-fc255a33692a)
' width='300' height='600'></img>

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


