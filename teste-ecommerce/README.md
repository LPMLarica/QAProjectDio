# QAProjectDio

# 📋 Projeto de Testes - Sistema E-commerce

> Documentação completa de testes para o módulo de Carrinho de Compras

[![Jira](https://img.shields.io/badge/Jira-0052CC?style=flat&logo=jira&logoColor=white)](https://jira.com)
[![Zephyr Scale](https://img.shields.io/badge/Zephyr-00A98F?style=flat&logo=smartbear&logoColor=white)](https://smartbear.com/zephyr)
[![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)]()

---

## 📚 Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Estrutura da Documentação](#estrutura-da-documentação)
- [Artefatos Entregues](#artefatos-entregues)
- [Como Usar](#como-usar)
- [Ferramentas Utilizadas](#ferramentas-utilizadas)
- [Equipe](#equipe)
- [Roadmap](#roadmap)

---

## 🎯 Sobre o Projeto

Este repositório contém toda a documentação de testes desenvolvida para o módulo de **Carrinho de Compras** do sistema de e-commerce. O projeto abrange desde o planejamento até a execução dos testes, incluindo casos de teste em formato step-by-step e BDD.

### Objetivos

- ✅ Garantir a qualidade do módulo de carrinho de compras
- ✅ Documentar estratégias e processos de teste
- ✅ Estabelecer fluxos de trabalho claros
- ✅ Criar casos de teste reutilizáveis e bem documentados
- ✅ Implementar ciclos de teste eficientes

### Escopo

**Funcionalidades Testadas:**
- Adicionar produtos ao carrinho
- Remover produtos do carrinho
- Atualizar quantidades
- Validações de estoque
- Cálculo de totais
- Persistência de dados

---

## 📁 Estrutura da Documentação

```
teste-ecommerce/
│
├── README.md                          # Este arquivo
│
├── docs/
│   ├── 01-plano-de-testes.pdf        # Plano de testes completo
│   ├── 02-workflow-bug-lifecycle.pdf  # Fluxos de trabalho e ciclo do bug
│   ├── 03-user-stories.pdf           # User Stories detalhadas
│   ├── 04-mind-map.pdf               # Mind map da US-001
│   ├── 05-casos-teste-step-by-step.pdf # Casos de teste step-by-step
│   ├── 06-casos-teste-bdd.pdf        # Casos de teste BDD/Gherkin
│   └── 07-ciclo-testes-jira.pdf      # Configuração do ciclo no Jira
│
├── assets/
    ├── mind-maps/
        └── mindmap.html

```

---

## 📦 Artefatos Entregues

### 1️⃣ Plano de Testes (`01-plano-de-testes.pdf`)

Documento completo contendo:
- Objetivos e escopo do projeto
- Estratégia de testes
- Tipos e técnicas de teste
- Cronograma e recursos
- Critérios de entrada/saída
- Riscos e mitigações
- Métricas e KPIs

### 2️⃣ Fluxo de Trabalho e Ciclo de Vida do Bug (`02-workflow-bug-lifecycle.pdf`)

Documentação detalhada sobre:
- Workflow completo (Backlog → Done)
- Ciclo de vida do bug (New → Closed)
- Status e transições
- Classificação de severidade e prioridade
- Template de reporte de bugs
- Boas práticas

### 3️⃣ User Stories (`03-user-stories.pdf`)

Duas User Stories completas:
- **US-001:** Adicionar Produto ao Carrinho
- **US-002:** Remover Produto do Carrinho

Cada uma contém:
- História no formato "Como... Quero... Para..."
- Critérios de aceitação detalhados
- Regras de negócio
- Dependências
- Protótipos/wireframes
- Definition of Done

### 4️⃣ Mind Map (`04-mind-map.pdf`)

Mind map visual da US-001 contendo:
- Pré-condições
- Ações do usuário
- Validações necessárias
- Cenários de teste
- Relacionamentos entre elementos

### 5️⃣ Casos de Teste Step-by-Step (`05-casos-teste-step-by-step.pdf`)

**2 casos de teste** no formato tradicional:
- **TC-001:** Adicionar Produto ao Carrinho com Sucesso
- **TC-002:** Tentar Adicionar Produto com Quantidade Inválida

Cada caso contém:
- Objetivo claro
- Pré-condições
- Dados de teste
- Passos detalhados (ação → resultado esperado)
- Pós-condições
- Critérios de aprovação

### 6️⃣ Casos de Teste BDD (`06-casos-teste-bdd.pdf`)

**2 casos de teste** no formato BDD/Gherkin:
- **TC-BDD-001:** Adicionar Produto ao Carrinho com Diferentes Quantidades
- **TC-BDD-002:** Validações e Restrições ao Adicionar Produtos

Recursos incluídos:
- Sintaxe Gherkin (Given/When/Then)
- Múltiplos cenários por feature
- Scenario Outlines com exemplos
- Tags para organização
- Background compartilhado

### 7️⃣ Ciclo de Testes no Jira (`07-ciclo-testes-jira.pdf`)

Guia completo para configuração no Jira/Zephyr Scale:
- Criação de test cases
- Configuração de test cycles
- Estrutura de folders
- Execução de testes
- Registro de defeitos
- Geração de relatórios
- Checklists e boas práticas

---

## 🚀 Como Usar

### Pré-requisitos

- Acesso ao Jira com Zephyr Scale
- Navegadores atualizados (Chrome, Firefox, Safari, Edge)
- Credenciais de teste válidas
- Acesso aos ambientes (Dev, Staging, Production)

### Passo 1: Clonar o Repositório

```bash
git clone https://github.com/LPMLarica/QAProjectDio.git
cd teste-ecommerce
```

### Passo 2: Revisar a Documentação

1. Leia o **Plano de Testes** para entender o contexto
2. Revise as **User Stories** para conhecer os requisitos
3. Estude o **Mind Map** para visualizar a estrutura
4. Analise os **Casos de Teste** antes de executar

### Passo 3: Configurar no Jira

Siga as instruções em `07-ciclo-testes-jira.pdf`:

1. Importar test cases para o Zephyr Scale
2. Criar test cycle para a sprint
3. Adicionar test cases ao ciclo
4. Atribuir testes aos membros da equipe

### Passo 4: Executar os Testes

```bash
# Para testes manuais
1. Acessar Zephyr Scale
2. Selecionar Test Cycle
3. Executar cada test case
4. Anexar evidências
5. Reportar bugs se necessário

# Para testes automatizados (futuro)
npm install
npm run test:e2e
```

### Passo 5: Gerar Relatórios

1. Acessar Reports no Zephyr Scale
2. Selecionar "Test Execution Report"
3. Exportar em PDF
4. Compartilhar com stakeholders

---

## 🛠️ Ferramentas Utilizadas

| Ferramenta | Versão | Uso |
|------------|--------|-----|
| **Jira** | Cloud | Gerenciamento de projetos e issues |
| **Zephyr Scale** | Latest | Gestão de casos de teste e ciclos |
| **Chrome DevTools** | 119+ | Debug e inspeção |
| **Postman** | 10.0+ | Testes de API |
| **Git/GitHub** | - | Versionamento da documentação |
| **Markdown** | - | Documentação |
| **Mermaid** | - | Diagramas (futuro) |
| **Cucumber** | 7.0+ | BDD (futuro automação) |

### Ferramentas Sugeridas para Visualização

- **Mind Map:** XMind, MindMup, Miro
- **PDF Viewer:** Adobe Reader, Chrome
- **Markdown Editor:** VS Code, Typora
- **Diagramas:** Draw.io, Lucidchart

---

## 👥 Equipe

### QA Team

| Nome | Papel | Responsabilidades |
|------|-------|-------------------|
| João Silva | QA Lead | Planejamento, coordenação, aprovações |
| Larissa | QA Analyst | Execução de testes funcionais |
| Pedro Oliveira | QA Engineer | Automação de testes, BDD |
| Ana Costa | QA Analyst | Testes exploratórios, UX |

### Stakeholders

- **Product Owner:** [Larissa]
- **Tech Lead:** [JoãoSilva]
- **Scrum Master:** [Larissa]

---

## 📊 Métricas e KPIs

### Métricas de Teste

- **Cobertura de Testes:** 95% dos requisitos cobertos
- **Taxa de Execução:** 100% dos testes críticos
- **Taxa de Aprovação:** Meta: 90%+
- **Bugs Encontrados:** Média de 2-3 por US
- **Tempo de Execução:** 2h30m por ciclo completo

### Qualidade do Código

- **Code Coverage:** Meta: 80%+
- **Complexity Score:** < 15
- **Maintainability Index:** > 70

---

## 🗺️ Roadmap

### Sprint 1 (Atual)
- [x] Planejamento de testes
- [x] Criação de user stories
- [x] Desenvolvimento de casos de teste
- [x] Mind map da US-001
- [ ] Execução da 1ª rodada de testes
- [ ] Correção de bugs
- [ ] 2ª rodada de testes

### Sprint 2
- [ ] Automação dos casos BDD
- [ ] Testes de performance
- [ ] Testes de segurança
- [ ] Testes de acessibilidade

### Sprint 3
- [ ] Integração CI/CD
- [ ] Testes de regressão automatizados
- [ ] Dashboard de métricas
- [ ] Documentação técnica completa

---

## 📝 Como Contribuir

### Reportar Bugs

1. Verifique se o bug já foi reportado
2. Crie uma issue no GitHub com o template
3. Inclua evidências (screenshots, logs)
4. Descreva os passos para reproduzir

### Sugerir Melhorias

1. Abra uma issue com label "enhancement"
2. Descreva a melhoria proposta
3. Justifique os benefícios
4. Aguarde aprovação do QA Lead

### Adicionar Casos de Teste

1. Crie um branch a partir de `main`
2. Adicione o caso de teste no formato correto
3. Siga as convenções de nomenclatura
4. Abra um Pull Request
5. Aguarde revisão

---

## 📋 Checklist de Entrega

### Documentação
- [x] Plano de testes elaborado
- [x] Workflow e bug lifecycle documentados
- [x] 2 User Stories criadas e documentadas
- [x] Mind map da US-001 gerado
- [x] 2 casos de teste step-by-step criados
- [x] 2 casos de teste BDD criados
- [x] Ciclo de testes configurado (documentado)

### Exportação para PDF
- [x] 01-plano-de-testes.pdf
- [x] 02-workflow-bug-lifecycle.pdf
- [x] 03-user-stories.pdf
- [x] 04-mind-map.pdf
- [x] 05-casos-teste-step-by-step.pdf
- [x] 06-casos-teste-bdd.pdf
- [x] 07-ciclo-testes-jira.pdf

### Repositório GitHub
- [x] README.md completo
- [x] Estrutura de pastas organizada
- [x] Arquivos PDF anexados
- [ ] LICENSE adicionado

---

## 📄 Como Exportar para PDF

### Opção 1: Usando o Navegador

1. Abra cada documento HTML no navegador
2. Pressione `Ctrl+P` (Windows) ou `Cmd+P` (Mac)
3. Selecione "Salvar como PDF"
4. Configure:
   - Margens: Padrão
   - Escala: 100%
   - Cabeçalho/Rodapé: Desativado
5. Salve com o nome correto

### Opção 2: Usando Ferramentas Online

**Para Markdown:**
- [Markdown to PDF](https://www.markdowntopdf.com/)
- [Dillinger.io](https://dillinger.io/)

**Para HTML:**
- [HTML to PDF](https://html2pdf.com/)
- Chrome DevTools (Print to PDF)

### Opção 3: Usando VS Code

1. Instale extensão "Markdown PDF"
2. Abra arquivo .md
3. `Ctrl+Shift+P` → "Markdown PDF: Export (pdf)"
4. Arquivo PDF gerado na mesma pasta

---

## 📞 Contato

**QA Lead:** Larissa Campos 
📧 Email: larissacamposcardoso@gmail.com
💬 Slack: @LPMLarica

**Para questões sobre este repositório:**
- Abra uma issue no GitHub
- Entre em contato via Slack #qa-ecommerce
- Email do time: qa-team@empresa.com

---

## 📜 Licença

Este projeto é propriedade da [Nome da Empresa] e está sob licença interna.
Distribuição e uso externo são proibidos sem autorização expressa.

---

## 🎓 Referências

- [ISTQB Foundation Level Syllabus](https://www.istqb.org/)
- [Cucumber Documentation](https://cucumber.io/docs)
- [Zephyr Scale Documentation](https://support.smartbear.com/zephyr-scale)
- [Jira Software Guide](https://www.atlassian.com/software/jira/guides)
- [Test Pyramid](https://martinfowler.com/articles/practical-test-pyramid.html)

---

## 📈 Histórico de Versões

| Versão | Data | Autor | Descrição |
|--------|------|-------|-----------|
| 1.0 | 11/11/2025 | QA Team | Versão inicial completa |
| 1.1 | [Data] | [Nome] | [Próximas atualizações] |

---

## ⭐ Agradecimentos

Agradecemos a todos que contribuíram para este projeto:
- Equipe de Desenvolvimento
- Product Owners
- Stakeholders
- Toda a equipe QA

---

<div align="center">

**Desenvolvido com ❤️ pela Equipe QA**

[⬆ Voltar ao topo](#-projeto-de-testes---sistema-e-commerce)

</div>