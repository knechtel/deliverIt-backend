# deliverIt-backend
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

● Listagem das contas cadastradas

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
