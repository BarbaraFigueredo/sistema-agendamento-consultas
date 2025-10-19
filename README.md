# # Sistema de Agendamento de Consultas

## 📌 Visão Geral
Este é um **sistema de agendamento de consultas médicas**, desenvolvido em **Java** com **Spring Boot**, destinado a gerenciar consultas, médicos, pacientes e especialidades de forma simples e eficiente.

O sistema permite:
- Agendar e cancelar consultas
- Listar consultas agendadas
- Evitar conflitos de horários
- Validar horários comerciais
- Gerenciar médicos e especialidades
- Validar dados de entrada do usuário

---

## 🏗️ Estrutura do Projeto
O projeto foi planejado com as seguintes entidades principais:

| Entidade     | Descrição                                             |
|-------------|-------------------------------------------------------|
| Paciente    | Contém informações dos pacientes                     |
| Médico      | Contém informações dos médicos, incluindo CRM       |
| Especialidade | Define as especialidades médicas                   |
| Consulta    | Registra os agendamentos de consultas               |

---

## ⚙️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database** (in-memory, para testes iniciais)
- **Lombok** (para reduzir código boilerplate)
- **Validation** (Bean Validation para garantir dados corretos)
- **Spring Boot DevTools** (opcional, para reload automático em desenvolvimento)

---

## 🚀 Configuração Inicial
Para iniciar o projeto localmente, siga os passos abaixo:

### 1. Clonar o repositório
```bash
git clone https://github.com/BarbaraFigueredo/sistema-agendamento-consultas.git
cd sistema-agendamento-consultas
