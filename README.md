# Conversor de Temperatura em Java

Projeto simples desenvolvido em **Java** com o objetivo de praticar lógica de programação, tratamento de erros e interação com o usuário via terminal.

Este projeto faz parte da minha jornada de aprendizado em **Java Backend Development**.

## Funcionalidades

O programa permite converter temperaturas a partir do terminal:

- Celsius → Fahrenheit
- Celsius → Kelvin

O sistema também possui **tratamento de erros**, evitando que o programa quebre caso o usuário digite valores inválidos.

## Tecnologias utilizadas

- Java
- Programação orientada a objetos (OOP)
- Scanner para leitura de dados no terminal
- Tratamento de exceções (`try/catch`)
- Estruturas de repetição (`while`)
- Estruturas condicionais (`switch`)

## Estrutura do Projeto

```
src
 └── com
     └── igor
         └── conversor
             ├── Main.java
             └── service
                 └── TemperatureConverter.java
```

- **Main.java** → Interface do programa no terminal e controle do menu.
- **TemperatureConverter.java** → Classe responsável pelas conversões de temperatura.

## Como executar o projeto

1. Clone o repositório:

```
git clone https://github.com/igorfick/conversor-temperatura-java.git
```

2. Entre na pasta do projeto:

```
cd conversor-temperatura-java
```

3. Compile o projeto:

```
javac src/com/igor/conversor/Main.java
```

4. Execute o programa:

```
java com.igor.conversor.Main
```

## Exemplo de uso

```
=== Conversor de Temperatura ===
1 - Celsius para Fahrenheit
2 - Celsius para Kelvin
3 - Sair
Escolha uma opcao: 1

Digite a temperatura em Celsius: 25
Resultado: 77.0 Fahrenheit
```

## Objetivo do projeto

Este projeto foi criado com fins de estudo para praticar:

- Lógica de programação
- Estrutura de projetos em Java
- Tratamento de erros
- Boas práticas de código

## Próximas melhorias

- Adicionar conversão Fahrenheit → Celsius
- Adicionar conversão Kelvin → Celsius
- Criar interface gráfica futuramente
- Melhorar organização do código

## Autor

**Igor de Assis Coutinho**

Desenvolvedor em formação focado em **Java Backend**.
