# spring-boot-1.3-error-executable-service
Example of error when executing an Spring boot application as init.d service.

This is an exemple of a very simple Spring boot application that runs correctly following this steps:

<code>$ sudo mvn clear package </code>

<code>$ java -jar target/gsspring.jar </code>

But will fail following this tutorial https://docs.spring.io/spring-boot/docs/current/reference/html/deployment-install.html
to start it as a init.d service. Basically you have to create a link in init.d folder linking to your .jar:

<code>$ sudo ln -s /full/path/to/project/folder/target/gsspring.jar /etc/init.d/gsspring</code>

<code>$ sudo service gsspring start</code>
