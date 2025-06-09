# 🎓 Sistema de Gerenciamento de Alunos

Sistema completo de CRUD (Create, Read, Update, Delete) para gerenciamento de alunos, desenvolvido com **Spring Boot** no backend e **JavaScript** puro no frontend.

## 🚀 Tecnologias Utilizadas

### Backend
- **Java 21**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database** (banco em memória)
- **Maven** (gerenciador de dependências)

### Frontend
- **HTML5**
- **CSS3**
- **JavaScript (Vanilla)**
- **Fetch API** para requisições HTTP

## 🏗️ Arquitetura do Projeto

```
briches/
├── src/
│   ├── main/
│   │   └── java/com/senai/briches/
│   │       ├── BrichesApplication.java     # Classe principal
│   │       ├── Controller/
│   │       │   └── AlunoController.java    # Controlador REST
│   │       ├── Model/
│   │       │   └── Aluno.java              # Entidade JPA
│   │       ├── Service/
│   │       │   └── AlunoService.java       # Lógica de negócio
│   │       └── Interface/
│   │           └── AlunoRepository.java    # Repositório JPA
│   └── test/
│       └── java/com/senai/briches/
│           └── BrichesApplicationTests.java
├── frontend/
│   ├── index.html                          # Interface do usuário
│   ├── style.css                          # Estilos da aplicação
│   └── script.js                          # Lógica do frontend
└── pom.xml                                # Configurações Maven
```

## 📊 Funcionalidades

### API REST (Backend)
- **GET /alunos** - Lista todos os alunos
- **POST /alunos** - Cria um novo aluno
- **GET /alunos/{id}** - Busca aluno por ID
- **PUT /alunos/{id}** - Atualiza dados do aluno
- **DELETE /alunos/{id}** - Remove aluno

### Frontend
- Listagem de alunos em tabela responsiva
- Interface limpa e moderna
- Tratamento de erros nas requisições
- Design responsivo

## 🗃️ Modelo de Dados

```java
public class Aluno {
    private Long id;        // ID único (auto-incremento)
    private String nome;    // Nome do aluno
    private String email;   // Email do aluno
    private String telefone; // Telefone do aluno
}
```

## 🛠️ Como Executar

### Pré-requisitos
- Java 21 ou superior
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Executando o Backend
1. **Clone o repositório**
2. **Navegue até a pasta do projeto**
3. **Execute o comando Maven**:
   ```bash
   mvn spring-boot:run
   ```
4. **A API estará disponível em**: `http://localhost:8080`

### Executando o Frontend
1. **Abra o arquivo `index.html` no navegador**
2. **Ou use um servidor local** (Live Server, Python HTTP Server, etc.)

## 🎯 Conceitos Aprendidos

### Spring Boot
- **Injeção de Dependência** com `@Autowired` e construtor
- **Anotações Spring**:
  - `@SpringBootApplication` - Configuração principal
  - `@RestController` - Controlador REST
  - `@Service` - Camada de serviço
  - `@Entity` - Entidade JPA
  - `@Repository` - Repositório de dados

### Spring Data JPA
- **Mapeamento Objeto-Relacional (ORM)**
- **JpaRepository** com métodos CRUD automáticos
- **Anotações JPA**:
  - `@Entity` - Mapeia classe para tabela
  - `@Id` - Chave primária
  - `@GeneratedValue` - Auto-incremento

### Arquitetura MVC
- **Model**: Entidade `Aluno`
- **View**: Interface HTML/CSS/JS
- **Controller**: `AlunoController` gerencia requisições HTTP

### Frontend Moderno
- **Fetch API** para requisições assíncronas
- **DOM Manipulation** com JavaScript
- **Event Listeners** e ciclo de vida da página
- **Tratamento de Promises** com `.then()` e `.catch()`

## 🔧 Endpoints da API

### Listar Alunos
```http
GET http://localhost:8080/alunos
```

### Criar Aluno
```http
POST http://localhost:8080/alunos
Content-Type: application/json

{
  "nome": "João Silva",
  "email": "joao@email.com",
  "telefone": "(11) 99999-9999"
}
```

### Buscar Aluno por ID
```http
GET http://localhost:8080/alunos/1
```

### Atualizar Aluno
```http
PUT http://localhost:8080/alunos/1
Content-Type: application/json

{
  "nome": "João Santos",
  "email": "joao.santos@email.com",
  "telefone": "(11) 88888-8888"
}
```

### Deletar Aluno
```http
DELETE http://localhost:8080/alunos/1
```

## 🎨 Recursos Visuais

- **Design responsivo** com CSS Grid/Flexbox
- **Hover effects** nas linhas da tabela
- **Cores modernas** com paleta azul
- **Sombras** e **border-radius** para cards modernos
- **Tipografia** clara e legível


## 🤝 Contribuições

Este é um projeto educacional do curso Java Fundamentos. Sugestões e melhorias são bem-vindas!
