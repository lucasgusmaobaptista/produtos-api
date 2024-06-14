<h1 align="center">Produtos API</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Linkedin&message=devlucasgusmao&color=1921E1&labelColor=000000" alt="devlucasgusmao" />
</p>

## Descrição

Este projeto é uma API RESTful (CRUD) desenvolvida em Spring Boot para gerenciar um catálogo de produtos. A API permite criar, ler, atualizar e deletar produtos do catálogo.

## Tecnologias Utilizadas

- [Java](https://docs.oracle.com/en/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [MySQL](https://dev.mysql.com/downloads/)

## Requisitos

- JDK 11 ou superior
- Maven 3.6.3 ou superior
- Banco de dados MySQL
- Insomnia ou qualquer outra ferramenta de sua preferência para realização dos testes

## Instalação

### 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/produtos-api.git
cd produtos-api
```

### 2. Configurar o Banco de Dados
Certifique-se de ter um banco de dados MySQL em execução e crie um banco de dados chamado produtos_db.

```bash
CREATE DATABASE produtos_db;
```

### 3. Configurar o 'aplication.properties'
Abra o arquivo src/main/resources/application.properties e configure as propriedades do banco de dados:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/produtos_db
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
```
### 4. Construir o Projeto
Use Maven para construir o projeto:

```bash
mvn clean install
```

### 5. Executar a aplicação
Execute a aplicação usando o Maven:

```bash
mvn spring-boot:run
```
A aplicação estará disponível em http://localhost:8080

## Uso

### Endpoints

#### Criar Produto

- **URL**: `/produtos/criar`
- **Método**: POST
- **Body**: JSON

**Exemplo de requisição:**

```json
{
  "nome": "Água",
  "descricao": "Liquido de beber",
  "preco": 2
}
```

#### Ver Todos Os Produtos

- **URL**: `/produtos/ver/{id}`
- **Método**: GET

**Exemplo de resposta:**

```json
{
  "id": 1,
  "nome": "Água",
  "descricao": "Liquido de beber",
  "preco": 2
}
```

#### Atualizar Produto

- **URL**: `/produtos/atualizar/{id}`
- **Método**: PUT
- **Body**: JSON

**Exemplo de requisição:**

```json
{
  "nome": "Água",
  "descricao": "Liquido de beber",
  "preco": 3
}
```
**Exemplo de resposta:**

```
Atualização realizada com sucesso!
````

#### Deletar Produto

- **URL**: `/produtos/criar`
- **Método**: DELETE

**Exemplo de Resposta:**

```
Produto deletado com sucesso!
```
## Contribuição

Se você quiser contribuir com este projeto, siga estas etapas:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Comite suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Faça o push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

