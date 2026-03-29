/**
 * ================================================================
 * DOCUMENTO ACADÉMICO - FORMATO APA
 * ================================================================
 *
 * Sistema de Gestión de Biblioteca: Implementación de Programación
 * Orientada a Objetos con Herencia y Polimorfismo
 *
 * ================================================================
 */

# PORTADA

**Sistema de Gestión de Biblioteca: Implementación de Programación Orientada a Objetos**

**Autor:** [Nombre del Estudiante/Equipo]  
**Institución:** [Nombre de la Institución Educativa]  
**Curso:** [Nombre del Curso]  
**Profesor:** [Nombre del Profesor]  
**Fecha:** [Fecha actual - 2026]  

---

# SISTEMA DE GESTIÓN DE BIBLIOTECA: IMPLEMENTACIÓN DE PROGRAMACIÓN ORIENTADA A OBJETOS

## Introducción

La Programación Orientada a Objetos (POO) representa uno de los paradigmas más importantes en el desarrollo de software moderno. Este enfoque permite modelar sistemas complejos de manera más natural y mantenible, utilizando conceptos como clases, objetos, herencia, polimorfismo, encapsulación y abstracción. En el contexto de este proyecto, se desarrolla un sistema de gestión de biblioteca que demuestra la aplicación práctica de estos principios fundamentales de POO.

El sistema implementado gestiona diferentes tipos de materiales bibliográficos (libros y CDs), controla préstamos con límites personalizados por usuario, y utiliza herencia y polimorfismo para crear una arquitectura flexible y extensible. Este proyecto no solo cumple con requisitos funcionales específicos, sino que también sirve como caso de estudio para validar la comprensión y aplicación correcta de los conceptos de POO.

## Objetivos

Los objetivos principales de este proyecto son:

1. **Desarrollar un sistema funcional de gestión de biblioteca** que permita registrar, gestionar y controlar préstamos de materiales bibliográficos.

2. **Implementar correctamente los principios de Programación Orientada a Objetos**, incluyendo herencia, polimorfismo, encapsulación y sobrecarga de métodos.

3. **Crear una jerarquía de clases** que represente de manera natural los diferentes tipos de materiales y usuarios del sistema.

4. **Demostrar el uso de polimorfismo** a través de una colección genérica que pueda manejar diferentes tipos de objetos de manera uniforme.

5. **Validar el cumplimiento de requisitos funcionales** como control de límites de préstamo, gestión de disponibilidad de materiales y presentación de información organizada.

6. **Documentar y presentar** el diseño y la implementación de manera clara y profesional, incluyendo justificación técnica de las decisiones tomadas.

## Planteamiento del Problema

### Contexto del Problema

Las bibliotecas tradicionales requieren sistemas eficientes para gestionar sus colecciones de materiales y controlar los préstamos a usuarios. En un entorno digital, estos sistemas deben ser capaces de:

- Gestionar diferentes tipos de materiales (libros, CDs, revistas, etc.)
- Mantener registros de usuarios con diferentes categorías y privilegios
- Controlar límites de préstamo para evitar abusos del sistema
- Proporcionar información actualizada sobre disponibilidad de materiales
- Generar reportes y estadísticas de uso

### Problema Específico

El desarrollo de un sistema de gestión de biblioteca presenta varios desafíos técnicos:

1. **Heterogeneidad de materiales**: Los diferentes tipos de materiales (libros, CDs, DVDs) tienen características específicas pero también comparten atributos comunes.

2. **Gestión de usuarios**: Los usuarios pueden tener diferentes categorías (estudiantes, profesores, usuarios regulares) con límites de préstamo variables.

3. **Control de préstamos**: Es necesario validar límites, verificar disponibilidad y mantener registros actualizados.

4. **Extensibilidad**: El sistema debe permitir agregar nuevos tipos de materiales o categorías de usuarios sin modificar el código existente.

5. **Mantenibilidad**: El código debe ser fácil de entender, modificar y extender por otros desarrolladores.

### Limitaciones del Enfoque Tradicional

Un enfoque procedural o funcional para este problema resultaría en:

- Código duplicado para manejar diferentes tipos de materiales
- Dificultad para agregar nuevos tipos sin modificar múltiples funciones
- Mayor complejidad en la gestión de préstamos
- Menor reutilización de código
- Mayor propensión a errores y inconsistencias

## Análisis del Problema

### Análisis de Requisitos Funcionales

El sistema debe cumplir con los siguientes requisitos funcionales:

1. **Gestión de Materiales**:
   - Registrar libros con información de autor, género, año de publicación
   - Registrar CDs con información de artista, número de canciones, duración
   - Mantener estado de disponibilidad de cada material
   - Mostrar información detallada de cada material

2. **Gestión de Usuarios**:
   - Registrar usuarios con información personal
   - Establecer límites de préstamo (ej. 3 para regulares, 5 para premium)
   - Mantener registro de materiales prestados

3. **Control de Préstamos**:
   - Validar disponibilidad del material
   - Verificar límites del usuario
   - Actualizar estado del material y usuario
   - Prevenir préstamos que excedan límites

4. **Interfaz de Usuario**:
   - Mostrar todos los materiales
   - Filtrar por tipo (solo libros, solo CDs)
   - Mostrar información de usuarios
   - Reportar estado de préstamos

### Análisis de Requisitos Técnicos

Desde la perspectiva de POO, el sistema debe implementar:

1. **Herencia**: Crear una jerarquía de clases que permita compartir comportamiento común.

2. **Polimorfismo**: Permitir que diferentes tipos de objetos sean tratados de manera uniforme.

3. **Encapsulación**: Proteger los datos internos y proporcionar interfaces controladas.

4. **Abstracción**: Representar conceptos del dominio de manera clara y natural.

5. **Sobrecarga**: Proporcionar múltiples formas de realizar operaciones similares.

### Análisis de la Solución POO

La solución basada en POO aborda los problemas identificados mediante:

1. **Jerarquía de Herencia**:
   - `Material` como superclase base
   - `Libro` y `CD` como subclases especializadas
   - `Usuario` como clase independiente con límites configurables

2. **Polimorfismo en Colecciones**:
   - `ArrayList<Material>` para almacenar diferentes tipos
   - Métodos polimórficos que se comportan diferente según el tipo real

3. **Encapsulación de Datos**:
   - Atributos privados con acceso controlado
   - Métodos públicos para operaciones seguras

4. **Validación de Reglas de Negocio**:
   - Control de límites en métodos de préstamo
   - Verificación de disponibilidad antes de préstamo

## Propuesta de la Solución

### Diseño de la Arquitectura

La solución propuesta se basa en una arquitectura orientada a objetos con las siguientes clases principales:

#### 1. Clase Material (Superclase Base)
```java
public class Material {
    private int id;
    private String titulo;
    private int anioPublicacion;
    private boolean disponible;
    protected String usuarioPrestamo;

    // Constructor y métodos comunes
    public void mostrarInformacion(); // Método polimórfico
    public void actualizarDisponibilidad(boolean disponible);
    public void asignarUsuarioPrestamo(String usuario);
}
```

#### 2. Clase Libro (Subclase de Material)
```java
public class Libro extends Material {
    private String autor;
    private String genero;

    // Constructor que llama a super()
    public Libro(int id, String titulo, String autor, int anio, String genero, boolean disponible) {
        super(id, titulo, anio, disponible);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void mostrarInformacion() {
        // Implementación específica para libros
    }
}
```

#### 3. Clase CD (Subclase de Material)
```java
public class CD extends Material {
    private String artista;
    private int numeroCanciones;
    private String duracionTotal;

    // Constructor y métodos similares a Libro
    @Override
    public void mostrarInformacion() {
        // Implementación específica para CDs
    }
}
```

#### 4. Clase Usuario
```java
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private int numeroIdentificacion;
    private int limitePrestamos;
    private ArrayList<Material> materialesPrestados;

    // Constructores sobrecargados
    public Usuario(int id, String nombre, String apellido, int numeroId, int limite);
    public Usuario(int id, String nombre, String apellido, int numeroId); // límite default 3

    // Métodos para gestión de préstamos
    public void prestarMaterial(Material material);
    public int cantidadLibrosPrestados();
    public int getLimitePrestamos();
}
```

#### 5. Clase Biblioteca (Gestora del Sistema)
```java
public class Biblioteca {
    private ArrayList<Material> materiales;
    private ArrayList<Usuario> usuarios;

    // Métodos para gestión
    public void agregarMaterial(Material material);
    public void agregarUsuario(Usuario usuario);
    public void mostrarMateriales(); // Polimorfismo en acción
    public void mostrarLibros();     // Filtrado con instanceof
    public void mostrarCDs();        // Filtrado con instanceof
    public void prestarMaterialAUsuario(Material material, Usuario usuario);
}
```

### Implementación de Herencia

La herencia se implementa siguiendo estos principios:

1. **Superclase Material**: Contiene atributos y métodos comunes a todos los materiales bibliográficos.

2. **Subclases Libro y CD**: Heredan todos los atributos y métodos de Material, agregando atributos específicos y sobrescribiendo el método `mostrarInformacion()`.

3. **Llamada a constructores**: Los constructores de subclases llaman a `super()` para inicializar atributos heredados.

4. **Acceso protegido**: El atributo `usuarioPrestamo` es `protected` para permitir acceso desde subclases.

### Implementación de Polimorfismo

El polimorfismo se demuestra en varios aspectos:

1. **Colección polimórfica**: `ArrayList<Material>` puede contener objetos de tipo `Libro` y `CD`.

2. **Método polimórfico**: `mostrarInformacion()` se comporta diferente según el tipo real del objeto.

3. **Parámetros polimórficos**: Los métodos `prestarMaterial()` y `agregarMaterial()` aceptan el tipo base `Material`.

4. **Override en subclases**: Cada subclase implementa `mostrarInformacion()` de manera específica.

### Validación de Requisitos

La implementación cumple con todos los requisitos identificados:

- ✅ Gestión de diferentes tipos de materiales
- ✅ Control de límites de préstamo por usuario
- ✅ Verificación de disponibilidad
- ✅ Herencia para compartir comportamiento común
- ✅ Polimorfismo para manejo uniforme de tipos diferentes
- ✅ Encapsulación para protección de datos
- ✅ Sobrecarga para flexibilidad en constructores y métodos

### Pruebas y Validación

El sistema incluye una clase `Main` que demuestra:

1. Creación de libros y CDs
2. Registro de usuarios con diferentes límites
3. Préstamos respetando límites
4. Filtrado por tipo de material
5. Visualización polimórfica de información

## Link del Video

[Nota: Como este es un documento simulado, el link del video sería proporcionado por el equipo una vez grabado y subido a una plataforma como YouTube]

**Link del video de presentación:** https://www.youtube.com/watch?v=VIDEO_ID_AQUI

El video tiene una duración aproximada de 8-10 minutos e incluye:
- Presentación del equipo y objetivos del proyecto
- Explicación detallada del diseño del código
- Justificación de cómo cumple con requisitos y principios POO
- Descripción técnica de herencia y polimorfismo
- Demostración práctica del sistema funcionando
- Conclusiones y lecciones aprendidas

## Conclusiones

### Logros Alcanzados

Este proyecto ha demostrado exitosamente la aplicación práctica de los principios de Programación Orientada a Objetos en el desarrollo de un sistema real de gestión de biblioteca. Los principales logros incluyen:

1. **Implementación correcta de herencia**: La jerarquía `Material → Libro/CD` permite compartir comportamiento común mientras mantiene especialización específica.

2. **Demostración efectiva de polimorfismo**: El uso de `ArrayList<Material>` y métodos polimórficos muestra cómo diferentes tipos de objetos pueden ser tratados uniformemente.

3. **Cumplimiento de requisitos funcionales**: El sistema gestiona materiales, usuarios y préstamos de manera eficiente y segura.

4. **Arquitectura extensible**: El diseño permite agregar nuevos tipos de materiales o categorías de usuarios sin modificar el código existente.

5. **Código mantenible**: La separación de responsabilidades y el uso de principios POO facilitan la comprensión y modificación del sistema.

### Lecciones Aprendidas

Durante el desarrollo de este proyecto, se adquirieron conocimientos valiosos sobre:

1. **Importancia del diseño orientado a objetos**: Un buen diseño inicial facilita el desarrollo y mantenimiento del software.

2. **Poder de la herencia**: Permite reutilizar código y crear jerarquías lógicas que reflejan el mundo real.

3. **Flexibilidad del polimorfismo**: Facilita el manejo de colecciones heterogéneas y la extensión del sistema.

4. **Valor de la encapsulación**: Protege la integridad de los datos y proporciona interfaces controladas.

5. **Beneficios de la sobrecarga**: Permite crear interfaces más intuitivas y flexibles.

### Impacto Educativo

Este proyecto valida la comprensión de conceptos fundamentales de POO y prepara para el desarrollo de sistemas más complejos. La experiencia adquirida en el diseño, implementación y documentación de software orientado a objetos es invaluable para la formación profesional en ingeniería de software.

### Recomendaciones para Futuras Implementaciones

Para extensiones futuras del sistema, se recomienda:

1. **Agregar persistencia**: Implementar almacenamiento en base de datos para mantener la información entre ejecuciones.

2. **Interfaz gráfica**: Desarrollar una interfaz de usuario más amigable que la consola.

3. **Más tipos de materiales**: Incluir revistas, DVDs, libros electrónicos, etc.

4. **Sistema de reservas**: Permitir a usuarios reservar materiales no disponibles.

5. **Reportes avanzados**: Generar estadísticas de uso, materiales más prestados, etc.

En conclusión, este proyecto representa una implementación sólida y educativa de Programación Orientada a Objetos, demostrando cómo los principios teóricos se aplican en la práctica para resolver problemas reales de manera eficiente y mantenible.

---

**Referencias**

[Si se utilizan fuentes externas, listar aquí en formato APA]

---

**Apéndices**

[Incluir código fuente completo si es necesario]

================================================================
FIN DEL DOCUMENTO ACADÉMICO
================================================================
