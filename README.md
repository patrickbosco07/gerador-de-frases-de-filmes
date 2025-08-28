# 🎬 Gerador de Frases de Filmes

Um projeto **full stack** que gera e exibe frases clássicas de filmes e séries.  
O **backend** foi desenvolvido com **Java 17 e Spring Boot**, enquanto o **frontend** utiliza **HTML, CSS e JavaScript**.

---

## 🚀 Tecnologias Utilizadas

### Backend
- 🟢 **Java 17**
- 🟢 **Spring Boot 3.5.3**
  - Spring Web
  - Spring Data JPA
  - Spring Boot DevTools
- 🐘 **PostgreSQL**
- 📦 **Maven** (gerenciamento de dependências)

### Frontend
- 🌐 **HTML5**
- 🎨 **CSS3**
- ⚡ **JavaScript (ES6+)**

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos
- ✅ Java 17+
- ✅ Maven
- ✅ PostgreSQL rodando localmente

### Backend
1. Clone o repositório:
   ```bash
   git clone https://github.com/patrickbosco07/gerador-de-frases-de-filmes.git
   cd gerador-de-frases-de-filmes/backend

2. Configure o PostgreSQL no arquivo application.properties:

      spring.datasource.url=jdbc:postgresql://localhost:5432/nomedobanco
      
      spring.datasource.username=seu_usuario
      
      spring.datasource.password=sua_senha
      
      spring.jpa.hibernate.ddl-auto=update

3. Rode a aplicação:
mvn spring-boot:run


4. Acesse a API backend:
http://localhost:8080

### Frontend

1. Entre na pasta frontend/

1. Abra o arquivo index.html em um navegador ou use um servidor local, como o Live Server do VSCode.
