# Laboratorio-05

### 1.¿Qué diferencia existe entre navegar dentro de la aplicación utilizando **Navigation Component** o hacer uso de intents?

Navigation Component es declarativo y maneja automáticamente el ciclo de vida y la navegación en el back stack, lo que reduce la cantidad de código necesario para implementar la navegación en aplicaciones grandes y complejas. Por otro lado, Intents es imperativo y requiere agregar código adicional para cada actividad o fragmento y para manejar el ciclo de vida y el back stack, pero puede ser mejor para una interacción más directa entre actividades.

### 2. Menciona los componentes fundamentales de Navigation Component

**NavController:** es el objeto principal que maneja la navegación en la aplicación, cargando y mostrando pantallas o destinos en la interfaz de usuario, y manteniendo un back stack para permitir la navegación hacia atrás.

**NavGraph:** es una representación visual del flujo de navegación de la aplicación. Define los destinos de navegación, como actividades, fragmentos o puntos de anclaje, y establece las conexiones entre ellos. Un NavGraph puede contener múltiples destinos y puede anidarse para representar flujos más complejos.

**NavHost:** es el contenedor visual donde se muestran los destinos de navegación de la aplicación. Carga y muestra los destinos definidos en el NavGraph y maneja las transiciones de animación entre ellos.

### 3. Mencione algunas de las ventajas del Navigation Graph

Navigation Graph proporciona una solución completa y organizada para la navegación en aplicaciones, lo que puede mejorar la calidad y eficiencia del código y la experiencia del usuario.
