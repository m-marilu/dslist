# 🎮 DSList - Catálogo de Jogos

Projeto desenvolvido durante o **Intensivão Java Spring** da [DevSuperior](https://devsuperior.com.br), com foco em construção de APIs REST usando Spring Boot. 
O DSList é uma aplicação backend que permite listar, reordenar e consultar jogos em diferentes listas.

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL / H2
- Docker
- Maven
- GitHub + Git

## 📦 Funcionalidades

- Listagem dos jogos - GET /games
- Busca de jogo por id - GET /games/{:id}
- Listagem das categorias de jogos (listas) - GET /lists
- Busca dos jogos em suas respectivas listas - GET /lists/{:id}/games
- Reordenação de jogos nas listas - POST /lists/{:id}/reorder
- Integração com banco de dados relacional
- API RESTful com endpoints bem definidos

## 💭 PLANNING TO DO

- [ ] Implementar um endpoint para adicionar novas listas
- [ ] Implementar um endpoint para adicionar novos jogos
- [ ] Implementar um endpoint para deletar listas
- [ ] Implementar um endpoint para deletar jogos
- [ ] Adicionar tratamento nos enpoints
