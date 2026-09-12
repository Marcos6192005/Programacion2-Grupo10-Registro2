# Asociación Comunal

Aplicación web de la Asociación Comunal, desarrollada con un backend en Spring Boot y un frontend en Next.js.

## Estructura del proyecto

- `backend-asociacion-comunal/`: API REST desarrollada con Spring Boot, Java 21 y Gradle.
- `frontend-asociacion-comunal/`: interfaz web desarrollada con Next.js, React y TypeScript.

## Requisitos previos

- Java Development Kit (JDK) 21.
- Node.js y uno de los siguientes gestores de paquetes: Bun, npm, Yarn o pnpm.
- Git.

El frontend declara Bun 1.4.0 como gestor recomendado. Si usás otro gestor, podés reemplazar `bun` por `npm`, `yarn` o `pnpm` en los comandos equivalentes.

Podés comprobar las instalaciones con:

```bash
java -version
git --version
bun --version
```

## Instalación

Cloná el repositorio y entrá en la carpeta del proyecto:

```bash
git clone <URL_DEL_REPOSITORIO>
cd Programacion2-Grupo10-Registro2
```

### Backend

El backend utiliza el Gradle Wrapper, por lo que no es necesario instalar Gradle de forma global.

En Windows:

```powershell
cd backend-asociacion-comunal
.\gradlew.bat build
```

En Linux o macOS:

```bash
cd backend-asociacion-comunal
./gradlew build
```

### Frontend

En otra terminal, instalá las dependencias del frontend:

```bash
cd frontend-asociacion-comunal
bun install
```

También podés usar npm:

```bash
npm install
```

## Ejecución en desarrollo

### Backend

Desde `backend-asociacion-comunal/`:

En Windows:

```powershell
.\gradlew.bat bootRun
```

En Linux o macOS:

```bash
./gradlew bootRun
```

El backend queda disponible en [http://localhost:8081](http://localhost:8081).

### Frontend

Desde `frontend-asociacion-comunal/`:

```bash
bun run dev
```

Con npm:

```bash
npm run dev
```

Abrí [http://localhost:3000](http://localhost:3000) en el navegador.

Para ejecutar ambos módulos al mismo tiempo, mantené el backend y el frontend abiertos en terminales separadas.

## Comandos útiles

### Backend

```bash
# Compilar y ejecutar las pruebas
./gradlew build

# Ejecutar únicamente las pruebas
./gradlew test
```

En Windows, reemplazá `./gradlew` por `./gradlew.bat`.

### Frontend

```bash
# Iniciar el servidor de desarrollo
bun run dev

# Ejecutar el linter
bun run lint

# Crear una compilación de producción
bun run build

# Iniciar la compilación de producción
bun run start
```

Con npm, reemplazá `bun run <comando>` por `npm run <comando>`.

## Configuración

La configuración actual del backend se encuentra en `backend-asociacion-comunal/src/main/resources/application.properties`:

- Nombre de la aplicación: `backend-asociacion-comunal`.
- Puerto del servidor: `8081`.

Si se agregan variables de entorno o configuración de base de datos, deben documentarse en esta sección.

## Documentación de referencia

- [Documentación oficial de Gradle](https://docs.gradle.org/)
- [Referencia del plugin de Spring Boot para Gradle](https://docs.spring.io/spring-boot/4.1.1/gradle-plugin)
- [Spring Web](https://docs.spring.io/spring-boot/4.1.1/reference/web/servlet.html)
- [Spring Security](https://docs.spring.io/spring-boot/4.1.1/reference/web/spring-security.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI](https://springdoc.org/)
- [Next.js](https://nextjs.org/docs)
- [React](https://react.dev/)
