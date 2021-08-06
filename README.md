# Servlet:

A tecnologia Servlet é uma classe Java, que consegue gerar páginas dinâmicas para a camada de apresentação de aplicações web. O principal objetivo é receber chamadas HTTP, sendo processada e devolvida uma resposta para o cliente. 

# JSP (Java Server Page)

Serve para permitir ao programador utilizar dados dinâmicos em páginas HTML.

- JSP significa Java Server Pages;
- JSP é uma página automaticamente processada pelo Tomcat;
- Para gerar HTML dinamicamente no JSP usamos Scriptlets;
- Um scriptlet <% %> é um código Java dentro do HTML;
- Um scriptlet só funciona em uma página JSP;
- Usamos o RequestDispatcher para chamar um JSP a partir da servlet;
- Obtemos o RequestDispatcher a partir do HttpServletRequest;
- Usamos a requisição para colocar ou pegar um atributo (setAttribute(.., ..) ou getAttribute(..)).
