# deliverIt-backend

Considerações 

Caso tenha dificuldade com configuração do banco de dados a URL do banco de dados fica no:

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
- Java 8
- Spring
- JPA
- Maven/ Gradle
- Liquibase / Flyway
- Junit
- Caso deseje a criação de um Front em AngularJs (O layout não será avaliado)
- Recurso de conteinerização.
Serviços

● Inclusão de conta a pagar
<p>○ Nome: Texto</p>
<p>○ Valor Original: Numeral</p>
<p>○ Data de Vencimento: Data</p>
<p>○ Data de Pagamento: Data</p>

formulário Angular:
```
http://localhost:4201/
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
