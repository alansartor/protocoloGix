![Alt text](/WebContent/static/logo.png?raw=true "Optional Title")

#Instructivo para descargar, compilar y ejecutar el proyecto
##Java
Instalar Java SE Development Kit 8
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
##Tomcat
Descargar Tomcat 8 (versión zip) y descomprimir en alguna carpeta (ejemplo: C:\Program Files\apache-tomcat\) 
[Download Page](https://tomcat.apache.org/download-80.cgi)
#IDE
Descargar e instalar “Eclipse IDE for Java EE Developers” [Download Page](http://www.eclipse.org/downloads/eclipse-packages/)
Intslar Plug-ins adicionales:
- Git integration for Eclipse
- Maven Integration for Eclipse
Configurar Eclipse para que utilice JDK 8 y Tomcat 8
Descargar Proyecto
Dentro de Eclipse importaremos un nuevo proyecto:
File -> Import -> Git -> Projects from Git
Seleccionamos “Clone URI”
En el campo URI pegamos el uri del repositorio: https://github.com/alansartor/protocoloGix.git 
Seguimos los pasos para clonar el repositorio en la maquina, podemos crear un repositorio dentro o fuera del workspace de Eclipse
En la ultima pestaña seleccionamos “Import existing Eclipse Projects” para crear el proyecto dentro de Eclipse
##Compilar el Proyecto
Ir a Run Configuration -> Maven Buil -> New
Seleccionamos el Proyecto que queremos compilar
Seleecionamos los Goals: clean install
Una vez que esta todo configurado le damos a Run
##Ejecutar Proyecto
Maven genera un archivo war dentro de la carpeta /target, ese archivo se podría usar para hacer un deploy en cualquier tomcat; pero para hacer pruebas locales podemos correr el proyecto directamente desde eclipse, para ello hay que configurar el Server, dentro de Eclipse ir a:
Windows -> Preferences -> Server -> Runtime Environments
Ahí deberemos crear un nuevo Server Runtime Environments, seleccionamos Apache Tomcat v8.5 y luego seleccionamos la carpeta donde descomprimimos el Tomcat que habiamos descargado anteriormente.
Dentro de la vista Servers hacemos sobre el server que acabamos de crear, y en la pestaña Modules agregamos nuestro projecto web.
Finalmente debemos arrancar el Server, para ello vamos a Run -> tomcatLocal (si no aparece, ir a Run Configuration y buscar dentro de las opciones de Apache Tomcat)
