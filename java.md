---
title: markmap
markmap:
  colorFreezeLevel: 2
  color: "#2980b9"
  initialExpandLevel: 1
---

## INTRODUÇÃO

- Instalador
    - JDK - https://download.oracle.com/java/24/latest/jdk-24_windows-x64_bin.exe
    - Netbeans - https://netbeans.apache.org/front/main/download/nb25/
- Java
    - Multiplataforma
- JVM
    - Maquina virtual
    - Alto nivel 
- Bytecode
    - Gerado pelo compilador, compilado, baixo nivel (assembly)
- JRE
    - Ambiente de tempo em execução, sem ferramenta de desenvolvimento, runtime
- JAR
    - Bibliotecas
- Javac
    - Compilador do java, transforma o fonte em bytecode (arquivos .class) e executa na JVM

## FERRAMENTA

- Netbeans
    - Source Packages
        - Arquivos java
        - Triangulo> classe main > responsavel por executar o codigo > sempre que for executar uma classe, tem que ter o "main"
        - Nomear a package > ex.: com.mycompany.a01
        - Classe publica A01.java
    - Java Dependencies
        - Dependencias java
    - Atalhos
        - digite > sout + tab > System.out.println("");

## VARIAVEIS

- Tipos de Variaveis
    - String - "Hello";
    - int - 123 or -123;
    - float - 19.99 or -19.99;
    - char - 'a' or 'B';
    - boolean - true or false;

- camelCase (convensão)
    - studentID = 15;
    - int studentAge = 23;

- Tipos Primitivos
    - byte	Stores whole numbers from -128 to 127
    - short	Stores whole numbers from -32,768 to 32,767
    - int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    - long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    - float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    - double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
    - boolean	Stores true or false values
    - char	Stores a single character/letter or ASCII values

## ESTRUTURAS CONDICIONAIS

- 'E' && - valor bolleano | comparativo (ambas expressões forem verdadeiras)
- 'OU' || - valor bolleano ou logico | comparativo (se pelo menos uma das condições forem verdadeiras)
- ! não - 