# Projeto de Livraria (OAuth2 Client)

Projeto backend de uma API REST que representa uma Exposição de Livros. Este projeto é utilizado no módulo de segurança com Spring Security e OAuth2, servindo como **Client** para consumir a API REST da [aplicação de Livraria](https://github.com/zup-academy/oauth2-resourceserver-livraria/tree/with-spring-security-and-tests).

## Tecnologias utilizadas:

Algumas das principais tecnologias utilizadas neste projeto:

1. Java 11;
2. Spring Boot 2.6.8;
3. Bean Validation;
4. OpenFeign;
5. Spring Security OAuth2 Client;

## Ambiente de desenvolvimento

Para configurar e rodar a aplicação em ambiente local basta seguir os passos:

1. Clonar o repositório ou fazer seu download:

```shell
git clone git@github.com:zup-academy/oauth2-client-livraria.git
```
2. Importar o projeto na IDE IntelliJ;
3. Configurar e rodar a [aplicação de Livraria](https://github.com/zup-academy/oauth2-resourceserver-livraria/tree/with-spring-security-and-tests) (siga o README);
4. Acessar o Keycloack do projeto de Livraria (Docker-Compose);
5. No Realm `livraria`, siga os passos:
   - Crie um novo Client com nome `exposicao-livros-client`;
   - Habilite o fluxo Client Credentials Flow;
   - Associe os Scopes `livros:read` e `autores:read` ao client;
   - Copie o Client Secret na propriedade `client-secret` do arquivo `application.yml`;
6. Por fim, iniciar a aplicação via IDE ou linha de comando:

```shell
./mvnw spring-boot:run
``` 

## Consumindo a API REST da aplicação

Aqui demonstramos através de alguns exemplos como você pode consumir a API REST exposta pela aplicação. Estamos utilizando o comando `cURL` como cliente HTTP mas você pode usar qualquer outro de sua preferência, como POSTman ou Insomnia. 

Dado que a aplicação esteja rodando, basta executar os comandos abaixo para exercitar os endpoints públicos da aplicação.

### Criando novo autor

```shell
curl --request GET \
  --url http://localhost:8081/exposicao-livros/api/livros/2
```

## Duvidas e suporte

Basta entrar em contato com a equipe da Zup Edu responsável pelo Bootcamp no horário comercial.