# 2018-RentYourGame
Assignment for the 2018 edition of the "Web Development and the Semantic Web" course, by Alan Vieira Lucena and Luiz Carlos Passamani Filho.

# Instalação e configuração

As instruções a seguir foram baseadas no tutorial do Jbutler. Para mais detalhes, acesse: [Jbutler Tutorial Wiki](https://github.com/dwws-ufes/jbutler/wiki)

1. Instale [Eclipse Photon (version 4.8.x)](https://www.eclipse.org/photon/);

2. Instale [WildFly 14.x](http://wildfly.org) e cria a configuração do servidor dentro do Eclipse (mais detalhes no tutorial do Jbutler);

3. Instale o [MySQL](http://www.mysql.com/products/community/) e crie um Schema chamado `oldenburg` e um usuário chamado `dwws` com senha `dwws`, com acesso total ao banco de dados;  

4. Configurar o [MySQL JDBC driver](https://dev.mysql.com/downloads/connector/j/) no WildFly, a versão usada aqui foi a 8.0.12

5. Adicione os seguintes trechos de código no arquivo `standalone.xml` do Wildfly:

Dentro da tag drivers:
  
```XML
<driver name="mysql" module="com.mysql">
      <driver-class>com.mysql.cj.jdbc.Driver</driver-class>
</driver>
```
  
Dentro da tag datasources:
  
```XML
<datasource jta="true" jndi-name="java:jboss/datasources/Oldenburg" pool-name="OldenburgPool" enabled="true" use-java-context="true">
                    <connection-url>jdbc:mysql://localhost:3306/oldenburg?useSSL=false&amp;allowPublicKeyRetrieval=true&amp;useTimezone=true&amp;serverTimezone=UTC</connection-url>
                    <driver>mysql</driver>
                    <security>
                        <user-name>dwws</user-name>
                        <password>dwws</password>
                    </security>
                </datasource>
```

Dentro da tag security-domains:
  
```XML
  <security-domain name="Oldenburg" cache-type="default">
  <authentication>
      <login-module code="Database" flag="required">
          <module-option name="dsJndiName" value="java:jboss/datasources/Oldenburg"/>
          <module-option name="rolesQuery" value="SELECT role, 'Roles' FROM usuario WHERE login=?"/>
          <module-option name="principalsQuery" value="SELECT senha from usuario WHERE login=?"/>
      </login-module>
  </authentication>
  <authorization>
      <policy-module code="Database" flag="required">
          <module-option name="dsJndiName" value="java:jboss/datasources/Oldenburg"/>
          <module-option name="rolesQuery" value="SELECT role, 'Roles' FROM usuario WHERE login=?"/>
          <module-option name="principalsQuery" value="SELECT senha from usuario WHERE login=?"/>
      </policy-module>
  </authorization>
</security-domain>
  ```
  
## Feito com
  
* [Java EE](http://www.oracle.com/technetwork/java/javaee/overview/index.html) - Java EE frameworks (JSF, CDI, JPA, EJB) 
* [Maven](https://maven.apache.org/) - Gerenciamento de dependências
* [JButler](https://github.com/dwws-ufes/jbutler) 

  
  
## Autores

* **Alan Vieira Lucena**
* **Luiz Carlos Passamani Filho**
