# employeeApiRest
Api rest de Empleados

Este es un proyecto de una api rest usando el framework de Spring, la cual sirve para gestionar operaciones CRUD de empleados, para el funcionamiento de este proyecto
es nesesario una base de datos con tablas como las que se encuentran en el packages de models,yo utilice MySQL y todas sus configuraciones para este, es un proyecto 
Spring de Eclipse y lo ejecuto como una Spring boot app, para probar los metodos HTTP del servicio utilice Postman. Esta compuesta Por la parte de Base de Datos usando
JPA de Spring para persistencia, la parte de Seguridad usando Spring Security y JWT para la generacion de Tokens(Esta parte de seguridad solo funciona para el metodo
DELETE) y por ultimo la parte Web REST utlizando Spring Web.

-Para la parte del Metodo HTTP Delete primero debe hacerse una peticion post al endpoint (/user) pasando como parametros user y password y si existe en base de datos 
y es correcta la contraseña respondera un token, ese token se pasa al metodo Delete con la cabecera de Authorization y debe ejecutrase satisfactoriamente.
