# Digital Menu Server

CRUD digital de cardápios para restaurantes, desenvolvido em Java com Spring Boot e PostgreSQL. Permite gerenciar itens de menu, categorias e operações administrativas via API RESTful.

## Funcionalidades Principais

- Cadastro, consulta, atualização e remoção de itens do cardápio.
- Organização dos itens por categorias.
- Integração com banco de dados PostgreSQL via JPA/Hibernate.
- API RESTful para operações CRUD.
- Suporte a testes automatizados com Spring Boot.

## Stack e Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
  - Spring Web
  - Spring Data JPA
- **PostgreSQL**
- **Maven**
- **Lombok**
- **Spring Boot DevTools** (hot reload)
- **JUnit** (testes)

## Estrutura de Pastas

```
digital-menu-server/
├── src/
│   ├── main/
│   │   ├── java/br/com/cardosofiles/digital_menu_server/
│   │   │   └── DigitalMenuServerApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/...
├── pom.xml
└── README.md
```

- `src/main/java/br/com/cardosofiles/digital_menu_server/`: Código-fonte principal da aplicação.
- `src/main/resources/`: Arquivos de configuração, como `application.properties`.
- `src/test/java/`: Testes automatizados.
- `pom.xml`: Gerenciamento de dependências Maven.

## Instalação e Execução Local

### Pré-requisitos

- Java 17+
- Maven 3.8+
- PostgreSQL

### Passos

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/digital-menu-server.git
   cd digital-menu-server
   ```

2. **Configure o banco de dados:**

   - Crie um banco PostgreSQL e um usuário.
   - Configure as variáveis no `src/main/resources/application.properties`:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/digital_menu
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Instale as dependências:**

   ```bash
   mvn clean install
   ```

4. **Execute as migrações (opcional):**

   - Caso utilize Flyway/Liquibase, configure e execute as migrações.

5. **Inicie o servidor:**
   ```bash
   mvn spring-boot:run
   ```
   Ou:
   ```bash
   java -jar target/digital-menu-server-0.0.1-SNAPSHOT.jar
   ```

## Executando Testes

```bash
mvn test
```

## Exemplos de Uso dos Endpoints

### Listar itens do cardápio

```http
GET /api/menu-items
```

### Criar novo item

```http
POST /api/menu-items
Content-Type: application/json

{
  "name": "Pizza Margherita",
  "description": "Clássica pizza italiana",
  "price": 39.90,
  "category": "Pizzas"
}
```

### Atualizar item

```http
PUT /api/menu-items/{id}
Content-Type: application/json

{
  "name": "Pizza Margherita",
  "description": "Pizza com tomate, mussarela e manjericão",
  "price": 42.00,
  "category": "Pizzas"
}
```

### Remover item

```http
DELETE /api/menu-items/{id}
```

## Boas Práticas e Recomendações

- Utilize branches para novas features e correções.
- Escreva testes para novas funcionalidades.
- Mantenha o padrão de código e utilize Lombok para reduzir boilerplate.
- Documente endpoints e regras de negócio relevantes.
- Atualize o README e comentários do código ao realizar mudanças significativas.
- Utilize variáveis de ambiente para dados sensíveis.

---

Para dúvidas ou contribuições, abra uma issue ou pull request no repositório.

## 📫 Contato

<div align="center">

<a href="mailto:cardosofiles@outlook.com">
  <img src="https://img.shields.io/badge/Email-0078D4?style=for-the-badge&logo=microsoftoutlook&logoColor=white" alt="Email"/>
</a>
<a href="https://www.linkedin.com/in/joaobatista-dev/" target="_blank">
  <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"/>
</a>
<a href="https://github.com/Cardosofiles" target="_blank">
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
</a>
<a href="https://cardosofiles.dev/" target="_blank">
  <img src="https://img.shields.io/badge/Portfólio-222222?style=for-the-badge&logo=about.me&logoColor=white" alt="Portfólio"/>
</a>

</div>
