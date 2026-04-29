# 📅 API de Agendamentos

API REST desenvolvida com Java e Spring Boot para gerenciamento de agendamentos.

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Banco de dados H2 (em memória)
- Lombok
- Maven

## 📋 Funcionalidades

- ✅ Criar agendamento
- ✅ Listar todos os agendamentos
- ✅ Buscar agendamento por ID
- ✅ Cancelar agendamento
- ✅ Tratamento global de erros

## 🔧 Como executar

**Pré-requisitos:** Java 17+ e Maven instalados.

```bash
# Clone o repositório
git clone https://github.com/samuelsafe/api-de-agendamentos.git

# Entre na pasta
cd api-de-agendamentos

# Rode o projeto
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080`

## 📡 Endpoints

### Criar agendamento
```
POST /agendamentos
```
```json
{
    "nomeCliente": "Samuel Ramos",
    "descricao": "Consulta médica",
    "dataHora": "2026-05-10T14:00:00"
}
```

### Listar todos
