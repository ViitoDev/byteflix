# ByteFlix

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-blue)

Projeto de estudo em Java que simula funcionalidades básicas de uma plataforma de streaming de filmes. O ByteFlix é construído aula a aula, e cada nova funcionalidade aplica um conceito de fundamentos da linguagem.

## Sumário

- [Funcionalidades](#funcionalidades)
- [Conceitos aplicados](#conceitos-aplicados)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Como executar](#como-executar)
- [Próximos passos](#próximos-passos)
- [Projeto relacionado](#projeto-relacionado)
- [Autor](#autor)

## Funcionalidades

| Classe | O que faz |
|--------|-----------|
| [`Main`](src/byteflix/Main.java) | Exibe a ficha de um filme (título, ano de lançamento e sinopse) e calcula a média das avaliações. |
| [`Conditional`](src/byteflix/Conditional.java) | Verifica se o usuário pode assistir ao filme de acordo com o plano contratado. |
| [`Reading`](src/byteflix/Reading.java) | Lê três avaliações digitadas pelo usuário e calcula a nota média do filme. |

## Conceitos aplicados

- Variáveis e tipos primitivos para representar os dados de um filme
- Text blocks (`"""`) para textos de várias linhas, como a sinopse
- Casting de `double` para `int` na exibição da média
- Operadores lógicos e condicionais para regras de acesso por plano
- Entrada de dados com `Scanner`
- Laço `for` para coletar várias avaliações

## Estrutura do projeto

```text
byteflix/
└── src/
    └── byteflix/
        ├── Main.java          # Ficha do filme e média das avaliações
        ├── Conditional.java   # Regra de acesso por plano
        └── Reading.java       # Leitura de avaliações do usuário
```

## Como executar

**Pré-requisito:** JDK 17 ou superior (o projeto usa text blocks).

### Pelo terminal

```bash
# Clonar o repositório
git clone https://github.com/ViitoDev/byteflix.git
cd byteflix

# Compilar
javac -d out src/byteflix/*.java

# Executar
java -cp out byteflix.Main
```

As outras funcionalidades rodam da mesma forma: `java -cp out byteflix.Conditional` ou `java -cp out byteflix.Reading`.

### Pela IDE

Abra a pasta do projeto no IntelliJ IDEA (ou em outra IDE Java), marque `src` como *Sources Root* e execute o método `main` da classe desejada.

## Próximos passos

- [ ] Modelar filmes com classes e objetos
- [ ] Permitir cadastrar e listar vários títulos
- [ ] Unificar as funcionalidades em um menu interativo

## Projeto relacionado

**[Java Challenges](https://github.com/ViitoDev/java-challenges)**: exercícios e desafios resolvidos nas aulas do mesmo curso.

## Autor

**João Barros**: [@ViitoDev](https://github.com/ViitoDev)
