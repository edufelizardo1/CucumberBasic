# Cucumber Básico
![Profile views](https://visitor-badge.glitch.me/badge?page_id=edufelizardo1.visitor-badge)
![image](https://img.shields.io/github/followers/edufelizardo1?style=social)
<!-- ![Profile views](https://gpvc.arturio.dev/edufelizardo1) -->
[![made-with-java](https://img.shields.io/badge/Languager-Java-1f425f.svg)](https://www.javascript.com)
[![Framework-Cucumber](https://img.shields.io/badge/Framework-Cucumber-1f425f.svg)](https://www.javascript.com)
[![made-with-java](https://img.shields.io/badge/Framework-JUnit-1f425f.svg)](https://www.javascript.com)
<!-- ![Profile views](https://gpvc.arturio.dev/edufelizardo1) -->
[![made-with-java](https://img.shields.io/badge/ide-Intellij-1f425f.svg)](https://www.javascript.com)
[![PyPi license](https://badgen.net/pypi/license/pip/)](https://pypi.com/project/pip/)
[![GoReportCard example](https://goreportcard.com/badge/github.com/nanomsg/mangos)](https://goreportcard.com/report/github.com/nanomsg/mangos)
[![Generic badge](https://img.shields.io/badge/Build-Final-<COLOR>.svg)](https://shields.io/)



* Teste de unidade automatizados
* Utilizando o BDD e TDD para construir os testes

### Configuração básica
1. Pom.xml
~~~
<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-java -->
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>1.2.5</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/info.cukes/cucumber-picocontainer -->
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-picocontainer</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
~~~
2. Configurando a classe Hook ou Runner
* Não pode ser esquecido de fazer configuração
* Em ***figure = "Aqui coloca o endereço da fiature ou mais"*** 
#### Exemplo:
~~~
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/Login.feature",
        glue = {"steps"},
        plugin = "pretty",
        monochrome = true
        )
public class Hook (){}
~~~~
## Cenários:
~~~
Scenario: Login as correct username and password
    Given Inavigate to the login page
    And I enter the users email address as Email:admin
    And I verify the count of my address digits for R$ 1000
    And I enter the following for Login
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    Then I should see the userform paga

  Scenario Outline: Login whith correct username and password
    Given Inavigate to the login page
    And I enter <username> and <password>
    And I click login button
    Then I should see the userform paga
    Examples:
      | username | password      |
      | execute  | automation    |
      | admin    | admin         |
      | admin    | adminpassword |
      | tester   | qa            |
~~~

*** São testes Simples que procuram entender a funcionalidade da ferramenta ***Cucumber***. Também tem como ituíto otimizar 
os tempos de testes, principalmente os unitários, e de que forma pensei nisto. A minha necessidade de contribuir para 
com meu time de desnvolvimento, fez com que eu me enteressasse em estudar esta ferramenta, para pode unir as técncicas 
de desevolvimento ágil, ***Behaviour Driven Development (ou BDD)*** e o ***Test Driven Development (TDD)***

[<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" />](https://www.linkedin.com/in/eduardo-felizardo-c%C3%A2ndido-28b16122)
[<img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" />](edufelizardo1@gmail.com)