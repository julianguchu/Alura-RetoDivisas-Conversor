Conversor de divisas , desarrollado en java con arquitectura MVC, haciendo uso de la librería Swing para GUI.
El programa utiliza un api público para consultar al momento el valor de las divisas a convertir. Este tiene un limitante de consulta de 250 peticiones mensuales
--------------------------------------   NOTA IMPORTANTE-------------------------------------------------------------------

Para poder ejecutar el proyecto, es necesario añadir los siguientes  jars como "References libraries " dentro de nuestro workspace:  jackson-core-2.11.1.jar , jackson-databind-2.11.1.jar  y  jackson-annotations-2.11.1.jar.

PDT: los jar ya estan cargados en este repositorio y para añadirlos  como References libraries se  hace  lo siguiente:

Ya habiendo importado el proyecto de este repositorio a in IDE como eclipse o spring tool suite:


1.click derecho sobre la carpeta de nuestro proyecto 

2. click en  propiedades.
3. buscammos en el menu de la izquierda "Java Build Path "  y seleccionamos esa opción
4. al lado derecho encontraremos  un boton llamada "Add external JARS" y damos click alli.
5. inmediatamente se abrira una ventana para escoger para que nos ubiquemos donde tengamos guardados en nuestra maquina estos tres archivos jas:  jackson-core-2.11.1.jar , jackson-databind-2.11.1.jar  y  jackson-annotations-2.11.1.jar.
6. los seleccionamos  y damos en el boton de abrir.
7. por ultimo  damos en el boton de Appy y es todo.

--------------------------------------------------------------------------------------------------------------------------
