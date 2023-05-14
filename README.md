# Projeto de Teste - Anotação @Async no Spring

Este é um projeto básico em Spring que testa a funcionalidade da anotação @Async. A anotação @Async é usada para indicar que um método deve ser executado de forma assíncrona, ou seja, em uma thread separada, permitindo que a aplicação continue a execução sem esperar pelo término desse método.

## Funcionalidades

O objetivo deste projeto é demonstrar como usar a anotação @Async para executar métodos assíncronos no Spring. Ele inclui os seguintes recursos:

- Configuração do Spring: O projeto possui uma configuração básica do Spring, incluindo a configuração do suporte a anotações, como a configuração @EnableAsync para habilitar o suporte a métodos assíncronos.

- Métodos Assíncronos: O projeto possui um serviço com um método marcado com a anotação @Async, indicando que ele deve ser executado de forma assíncrona. Esse método simula uma tarefa demorada, como uma chamada de API ou processamento intensivo, para fins de teste.

- Teste de Execução Assíncrona: O projeto inclui um teste unitário que demonstra a execução assíncrona do método marcado com @Async. O teste invoca o método várias vezes e verifica se a execução ocorre de forma assíncrona, ou seja, sem bloquear a thread principal.

## Pré-requisitos

Antes de executar o projeto, verifique se você possui os seguintes requisitos:

- Java JDK (versão 8 ou superior) instalado em sua máquina.

- Maven instalado em sua máquina.

## Executando o Projeto

Siga as etapas abaixo para executar o projeto:

1. Clone este repositório em sua máquina:

```
git clone https://github.com/enilsonfilho/test-async.git
```

2. Navegue até o diretório do projeto:

```
cd projeto-spring-async
```

3. Compile o projeto usando o Maven:

```
mvn clean install
```

4. Execute o projeto:

```
mvn spring-boot:run
```

5. Após a execução bem-sucedida, você poderá realizar uma requisão para a rota **http://localhost:8080/hello** e verá a saída do teste de execução assíncrona no console.

## Personalização

Você pode personalizar este projeto de acordo com suas necessidades específicas. Você pode adicionar mais métodos assíncronos, modificar a lógica do serviço ou adicionar outras funcionalidades relacionadas à execução assíncrona.

## Contribuição
Contribuições são bem-vindas! Se você tiver melhorias, correções de bugs ou novos recursos para adicionar ao projeto, fique à vontade para enviar um pull request.

## Recursos Adicionais
[Documentação do Spring Framework](https://spring.io/projects/spring-framework) - Documentação oficial do Spring com guias, tutoriais e exemplos.

[Referência da Anotação @Async](https://docs.spring.io/spring-framework/reference/integration/scheduling.html#scheduling-annotation-support-async) - Documentação oficial do Spring sobre a anotação @Async.
