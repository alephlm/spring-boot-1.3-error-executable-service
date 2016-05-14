# spring-boot-1.3-error-executable-service
Example of error when executing an Spring boot application as init.d service.

This is an exemple of a very simple Spring boot application that runs correctly following this steps:

<code>$ sudo mvn clear package </code>

<code>$ java -jar target/gsspring.jar </code>

then go to http://localhost:8082 you will se the message in hello.jsp page.

But will fail following this tutorial https://docs.spring.io/spring-boot/docs/current/reference/html/deployment-install.html
to start it as a init.d service. Basically you have to create a link in init.d folder linking to your .jar:

<code>$ sudo ln -s /full/path/to/project/folder/target/gsspring.jar /etc/init.d/gsspring</code>

<code>$ sudo service gsspring start</code>

then go to http://localhost:8082 you will see

>Whitelabel Error Page

>This application has no explicit mapping for /error, so you are seeing this as a fallback.

>Sat May 14 17:55:31 BRT 2016
>There was an unexpected error (type=Not Found, status=404).

>/WEB-INF/views/hello.jsp
