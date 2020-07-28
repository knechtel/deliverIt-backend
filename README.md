# deliverIt-backend
Docker:

$ docker pull mariadb:latest

git clone https://github.com/knechtel/deliverIt-backend.git
  ```
Cloning into 'deliverIt-backend'...
remote: Enumerating objects: 166, done.
remote: Counting objects: 100% (166/166), done.
remote: Compressing objects: 100% (113/113), done.
remote: Total 166 (delta 58), reused 123 (delta 27), pack-reused 0
Receiving objects: 100% (166/166), 641.79 KiB | 1.14 MiB/s, done.
Resolving deltas: 100% (58/58), done.
  ```
cd deliverIt-backend/

Na raiz do projeto

deliverIt-backend$ mvn package -DskipTests

deliverIt-backend$ docker image build -t deliver .

deliverIt-backend$ docker-compose up mariadb

deliverIt-backend$ docker-compose up deliver

Considerações 

Caso tenha dificuldade com a configuração do banco de dados a URL do banco de dados fica no:

- application.properties

e na classe:
  ```
package com.it.deliver;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("org.mariadb.jdbc.Driver")
                .url("jdbc:mariadb://mariadb/deliver")
                .username("root")
                .password("123")
                .build();
    }
}
  ```



PREMISSA
Desenvolver um Serviço Rest para tratar as regras de negócio descritas abaixo.
- Linguagem: Java
- Injeção de dependência
- Informações devem ser persistidas em um banco de dados relacional.
- Submeter a resposta usando Github e enviar o link para podermos analisar o repositório.

Diferenciais

A utilização dessas tecnologias será considerado um diferencial.
- Java 8 (foi utilizado)
- Spring (foi utilizado)
- JPA (foi utilizado)
- Maven (foi utilizado)/ Gradle
- Liquibase(foi utilizado) / Flyway
- Junit (foi utilizado)
- Caso deseje a criação de um Front em AngularJs  (O layout não será avaliado) Ok.
- Recurso de conteinerização. Docker

Serviços

● Inclusão de conta a pagar
<p>○ Nome: Texto</p>
<p>○ Valor Original: Numeral</p>
<p>○ Data de Vencimento: Data</p>
<p>○ Data de Pagamento: Data</p>

formulário Angular( se utilizar npm start fica na porta 4200):
```
http://localhost:4201/  //Caso utilize docker-compose do front
```

● Listagem das contas cadastradas
  
```
http://localhost:8081/api/contas
```

<p>○ Nome: Texto</p>
<p>○ Valor Original: Numeral</p>
<p>○ Valor Corrigido: Numeral</p>
<p>○ Quantidade de dias de atraso: Numeral</p>
<p>○ Data de Pagamento: Data</p>

Regras de Negócio

<br>
<img src='https://1.bp.blogspot.com/-KH6xjgpOgvU/Xxu2iQ1QQjI/AAAAAAAAJKw/ZNACuRQVqEAaOnAF-d5WBAdV1BElv-uGQCLcBGAsYHQ/s1600/Screen%2BShot%2B2020-07-25%2Bat%2B01.34.38.png'/>
</br>
➔ A quantidade de dias em atraso e a regra para o cálculo, devem ser persistidos. 
