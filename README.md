# Drone Project - Producer

Este é o trabalho final para a matéria Integrations & Development Tools do curso FIAP-FullStack em colaboração entre Patricia T S Chung e Gustavo Ceccon.

## Introdução

Desenvolvemos uma solução para o agronegócio que a coleta de dados via sensores de temperatura e umidade. Esses sensores ficarão instalados em um drone com uma altíssima economia pois conta com pequenos, porém muito eficientes painéis fotovoltaicos. 
A cada 10 segundos são enviados para message broker os dados de temperatura e umidade capturado naquele instante.

Este é o componente Producer, você pode conferir o componente Consumer neste link => [Link](https://github.com/tamisakita/drone-consumer)

## Tecnologias
* Java 18;
* SpringBoot;
* RabbitMQ;
* IntelliJ

## Configurações

* Criar uma conta no [CloudAMQP](https://customer.cloudamqp.com/instancehttps://customer.cloudamqp.com/instance) para acessar o [RabbitMQ](https://jackal.rmq.cloudamqp.com/#/https://jackal.rmq.cloudamqp.com/#/)

* Na pasta Resources criar o application.properties e adicionar o código para configurar o RabbitMQ
```java
spring.rabbitmq.addresses=amqps://*****

queue.name=fiap.scj.mensagens

server.port=8090
```

* No Postman importar a coleção Drone Tracker.postman_collection.json e rodar a coleção o csv drones.csv com 10 segundos de delay.

## Funcionalidade

### Setando os dados no Postman
![alt text](https://github.com/tamisakita/drone-producer/blob/main/postman-setup-10s.png "Postman Setando dados")

### Enviando os dados no Postman
![alt text](https://github.com/tamisakita/drone-producer/blob/main/postman-enviando-dados.png "Postman Dados")

### Enviando os dados no Producer
![alt text](https://github.com/tamisakita/drone-producer/blob/main/drone-producer-teste-postman.png "Producer enviando dados")

## Author & Version Control
[Patricia Tami Sakita](https://github.com/tamisakita) and [Gustavo Ceccon](https://github.com/gfcecconhttps://github.com/gfceccon) - Drone Project v.01
