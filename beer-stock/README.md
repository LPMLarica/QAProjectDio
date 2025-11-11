# Beer Stock - Spring Boot

Projeto de exemplo com API REST para gerenciamento de estoques de cerveja.

## Como rodar

1. `mvn clean install`
2. `mvn spring-boot:run`

Endpoints principais:
- POST /api/beers
- GET /api/beers
- GET /api/beers/name/{name}
- DELETE /api/beers/{id}
- PATCH /api/beers/{id}/increment?quantity=5
- PATCH /api/beers/{id}/decrement?quantity=3

## Testes

Rode `mvn test`.
