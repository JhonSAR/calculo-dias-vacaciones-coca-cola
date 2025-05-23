# 🥤 Sistema de Cálculo de Días de Vacaciones (Coca-Cola Company)

Este proyecto es una aplicación de escritorio desarrollada en **Java**, diseñada para calcular los días de vacaciones a los que un trabajador de The Coca-Cola Company tiene derecho, basándose en su puesto (Atención al Cliente, Logística o Gerencia) y su antigüedad en la empresa. **Fue el proyecto final de un curso autodidacta que realicé**, lo que demuestra mi capacidad de autoaprendizaje y aplicación de conocimientos de forma independiente.

La particularidad de este proyecto es que fue **desarrollado y compilado enteramente desde la terminal, sin el uso de un Entorno de Desarrollo Integrado (IDE)**, lo que demuestra un sólido entendimiento del JDK, la estructura de paquetes de Java y el proceso de compilación manual.

---

## ✨ Características Principales

* **Interfaz Gráfica de Usuario (GUI):** Diseñada con Java Swing y AWT para una experiencia de usuario interactiva.
* **Navegación entre Interfaces:** El programa cuenta con tres pantallas distintas:
    * **Bienvenida:** Solicita el nombre del usuario y valida la entrada.
    * **Términos y Condiciones:** Permite al usuario leer y aceptar los términos.
    * **Cálculo de Vacaciones:** Interfaz principal para ingresar datos del trabajador y obtener el cálculo.
* **Cálculo Dinámico de Días de Vacaciones:** Implementa la lógica de negocio proporcionada por Coca-Cola, que varía según el departamento y la antigüedad (1 año, 2-6 años, 7+ años).
    * **Atención al Cliente:** 6, 14 o 20 días.
    * **Logística:** 7, 15 o 22 días.
    * **Gerencia:** 10, 20 o 30 días.
* **Personalización y Limpieza:** Opciones para limpiar campos y personalizar la interfaz (si implementaste esta funcionalidad).
* **Visualización de Datos:** Muestra el nombre del usuario logueado en la interfaz principal.
* **Información del Desarrollador:** Opción para mostrar los datos del desarrollador.
* **Contexto Corporativo:** Incluye logotipos y la leyenda ©2017 The Coca-Cola Company.

---

## 🚀 Tecnologías Utilizadas

* **Lenguaje de Programación:** Java
* **Librerías GUI:** Java Swing / AWT 
* **Compilación y Ejecución:** JDK (Java Development Kit) vía terminal (línea de comandos).
* **Control de Versiones:** Git, GitHub.

---

## 🛠️ Cómo Ejecutar el Proyecto

Este proyecto está diseñado para ser compilado y ejecutado directamente desde la terminal de comandos, sin necesidad de un IDE.

1.  **Clonar el Repositorio:**
    Abre tu terminal (Git Bash, Símbolo del Sistema, o Terminal en Linux/macOS) y ejecuta:
    ```bash
    git clone [https://github.com/JhonSAR/calculo-dias-vacaciones-coca-cola.git](https://github.com/JhonSAR/calculo-dias-vacaciones-coca-cola.git)
    ```
    *(Nota: Asegúrate de que el nombre del repositorio en GitHub sea `calculo-dias-vacaciones-coca-cola` al crearlo.)*

2.  **Navegar a la Carpeta del Proyecto:**
    ```bash
    cd calculo-dias-vacaciones-coca-cola
    ```
    Si tu código fuente (`.java` files) está en una subcarpeta (ej. `src`), deberás navegar a esa carpeta:
    ```bash
    cd src
    ```
    *(Si el código está en un paquete, por ejemplo `com.cocacola.vacaciones`, la ruta sería `cd src/com/cocacola/vacaciones`)*

3.  **Compilar el Código:**
    Asegúrate de tener el JDK instalado y configurado en tu PATH. Luego, compila el archivo principal (el que contiene el método `main`) y cualquier otra clase Java.
    ```bash
    javac TuArchivoPrincipal.java OtrosArchivos.java
    # o para compilar todos los archivos .java en la carpeta actual:
    javac *.java
    # Si tienes paquetes, compila desde la raíz del proyecto (donde está src):
    # javac src/com/cocacola/vacaciones/*.java
    ```

4.  **Ejecutar la Aplicación:**
    Una vez compilado, puedes ejecutar la aplicación.
    ```bash
    java TuArchivoPrincipal
    # Si tienes paquetes:
    # java com.cocacola.vacaciones.TuArchivoPrincipal
    ```
    Esto debería iniciar la interfaz gráfica del programa.

---

## 📸 Capturas de Pantalla (Opcional pero muy recomendado)

* **Pantalla de Bienvenida**

![image](https://github.com/user-attachments/assets/bde7bf9f-4968-4259-a5ba-92d55b4f6f66)

* **Aceptación de términos y condiciones**

![image](https://github.com/user-attachments/assets/5c54f5d3-e83f-4376-b384-1c2d5678a4f4)

* **Interfaz de cálculo**

![image](https://github.com/user-attachments/assets/3f598674-6dd5-4f89-ac0d-892bce5e5c32)

---

## 📚 Aprendizajes y Conceptos Clave

Este proyecto me permitió consolidar conocimientos en:

* **Fundamentos de Java:** Comprensión profunda del lenguaje, estructura de clases y objetos.
* **Desarrollo de GUI con Java:** Creación de interfaces de usuario interactivas utilizando las librerías estándar de Java.
* **Compilación y Ejecución Manual:** Experiencia en el uso directo del JDK (`javac`, `java`) desde la línea de comandos, sin depender de un IDE.
* **Lógica de Negocio y Estructuras Condicionales:** Implementación de reglas complejas para el cálculo de vacaciones.
* **Manejo de Entrada/Salida:** Captura de datos del usuario y visualización de resultados.
* **Diseño de Aplicaciones por Componentes:** Creación de múltiples interfaces y gestión de la navegación entre ellas.

---

## 📬 Contacto

Si tienes alguna pregunta o sugerencia sobre este proyecto, no dudes en contactarme:

* **Email:** jhonsebastianardilareyes55@gmail.com
* **LinkedIn:** [https://www.linkedin.com/in/jhonsardila](https://www.linkedin.com/in/jhonsardila)
* **GitHub:** [https://github.com/JhonSAR](https://github.com/JhonSAR)
