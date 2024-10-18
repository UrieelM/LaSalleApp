# La Salle App

La Salle App es una aplicación móvil diseñada para estudiantes de la Universidad La Salle Bajío. La aplicación permite a los usuarios acceder a su información académica y configuraciones personales de manera fácil y rápida. Está desarrollada utilizando Android Studio y sigue una arquitectura basada en navegación.

## Características

### 1. Bottom Navigation Bar
La aplicación cuenta con un menú de navegación inferior que proporciona acceso a las siguientes pantallas principales:

#### Pantalla de Configuración
- Muestra información relevante del alumno, incluyendo:
  - Nombre completo
  - Fecha de nacimiento
  - Correo electrónico institucional
  - Imagen circular del perfil del alumno

#### Pantalla de Calificaciones
- Muestra información académica del alumno, como:
  - Nombre
  - Carrera
  - Semestre actual
  - Promedio acumulado
- Lista todas las materias cursadas con el promedio acumulado por materia.
- Al seleccionar una materia, se navega a una pantalla con las calificaciones de los tres parciales correspondientes.

### 2. Pantalla de Pagos (Acceso desde Home)
- En la pantalla de inicio, se incluye un botón llamado "Pagos".
- Al hacer clic en el botón, se muestra una lista de los meses con pagos efectuados y pendientes.
- Cada mes incluye un ícono que indica su estado:
  - Check para pagos realizados.
  - Alerta o cruz para pagos pendientes.

## Instalación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/UrieelM/LaSalleApp.git
   ```
2. Abre el proyecto en Android Studio.
3. Conecta un dispositivo Android o inicia un emulador.
4. Ejecuta la aplicación.


## Tecnologías Utilizadas

- **Android Studio**: IDE principal para el desarrollo.
- **Kotlin**: Lenguaje de programación para Android.
- **XML**: Para la definición de las interfaces de usuario.
