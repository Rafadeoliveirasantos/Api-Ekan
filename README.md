Api-Ekan
# Desenvolvimento e Execução
O projeto segue uma abordagem de desenvolvimento baseada em API REST, utilizando o padrão arquitetural MVC (Model-View-Controller) para separar as preocupações da aplicação.

Configuração do Ambiente: O ambiente de desenvolvimento foi configurado com o JavaSE-11 e as ferramentas necessárias, como Eclipse ou IntelliJ para o desenvolvimento, e Maven para gerenciamento de dependências.

Estrutura do Projeto: O projeto é organizado de acordo com as melhores práticas do Spring Boot, com pacotes separados para os controladores, serviços, modelos, e configurações.

Desenvolvimento da API: As funcionalidades da API foram implementadas utilizando controladores Spring RESTful, que definem os endpoints e manipulam as requisições HTTP.

Persistência de Dados: A persistência de dados é realizada utilizando o Hibernate com JPA. As entidades Java são mapeadas para tabelas do banco de dados relacional, facilitando a manipulação dos dados.

Testes e Depuração: Foram realizados testes unitários para garantir o correto funcionamento das funcionalidades da API. Ferramentas de depuração foram utilizadas para identificar e corrigir possíveis erros durante o desenvolvimento.

Execução e Implantação: O projeto pode ser executado localmente após a compilação, utilizando o Maven. O ambiente de desenvolvimento pode ser configurado para facilitar a execução e teste das funcionalidades da API.

# Sobre o projeto

Crie uma aplicação utilizando Java e Spring Boot que forneça uma API REST para manter o cadastro
de beneficiários de um plano de saúde.


# Acessar h2 Database

- http://localhost:8081/h2
- spring.datasource.url=jdbc:h2:mem:banco
- spring.datasource.username=admin
- spring.datasource.password=123
- (Por padrão,do projeto subir na porta 8081)



# Acessar o Swagger UI

- localhost:8081/swagger-ui/index.html
- (Por padrão,do projeto subir na porta 8081)




# Tecnologias utilizadas
- JavaSE-11 - Version 17.0.2
- Spring Boot - Version 3.0.12
- Maven
- JPA / Hibernate
- h2 Database

# Como executar o projeto
- git clone
- Importar o projeto no Eclipse ou IntelliJ
- Executar o projeto
- Credenciais do banco h2 no application.properties, que subirá no http://localhost:8081/h2


# Autor

Rafael Santos
https://www.linkedin.com/in/rafaelosantos/
