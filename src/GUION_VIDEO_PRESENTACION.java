/**
 * ================================================================
 * GUION DEL VIDEO DE PRESENTACIÓN
 * ================================================================
 *
 * DURACIÓN ESTIMADA: 8-10 minutos
 * FORMATO: Presentación en PowerPoint o similar + explicación verbal
 *
 * ================================================================
 * ESTRUCTURA DEL VIDEO
 * ================================================================
 */

GUION DEL VIDEO DE PRESENTACIÓN - SISTEMA DE GESTIÓN DE BIBLIOTECA

[INTRODUCCIÓN - 30 segundos]
============================

"Buenas tardes. Hoy les presentamos nuestro proyecto final: un Sistema de Gestión de Biblioteca implementado en Java utilizando Programación Orientada a Objetos (POO).

Este sistema permite gestionar libros y CDs, controlar préstamos con límites personalizados para usuarios, y demuestra los principios fundamentales de POO como herencia, polimorfismo, encapsulación y sobrecarga.

A lo largo de esta presentación, explicaremos el diseño de nuestro código, cómo cumple con los requisitos del sistema y los principios de POO, y detallaremos la implementación de herencia y polimorfismo."

[DIAPOSITIVA 1: PRESENTACIÓN DEL EQUIPO]
=========================================

"Integrantes del equipo:
- [Nombre 1]
- [Nombre 2]
- [Nombre 3]

Proyecto: Sistema de Gestión de Biblioteca
Fecha: [Fecha actual]
Institución: [Nombre de la institución]"

[DIAPOSITIVA 2: OBJETIVOS DEL PROYECTO]
=======================================

"Objetivos principales:
1. Desarrollar un sistema de biblioteca funcional en Java
2. Implementar conceptos avanzados de POO
3. Gestionar diferentes tipos de materiales (libros, CDs)
4. Controlar préstamos con límites por usuario
5. Demostrar herencia y polimorfismo en práctica"

[DIAPOSITIVA 3: REQUISITOS DEL SISTEMA]
=======================================

"El sistema debe cumplir con los siguientes requisitos:

1. Gestionar materiales bibliográficos (libros y CDs)
2. Registrar usuarios con diferentes categorías
3. Controlar préstamos con límites (3 para usuarios regulares, 5 para premium)
4. Mostrar información de materiales y usuarios
5. Implementar búsqueda y filtrado por tipo
6. Utilizar principios de POO correctamente"

[DIAPOSITIVA 4: PRESENTACIÓN DEL DISEÑO - PARTE 1]
==================================================

"Ahora explicaremos el diseño de nuestro código y su justificación.

Nuestro diseño se basa en una arquitectura orientada a objetos con las siguientes clases principales:

1. MATERIAL (Superclase base)
   - Atributos comunes: id, titulo, anioPublicacion, disponible, usuarioPrestamo
   - Métodos: mostrarInformacion(), actualizarDisponibilidad()

2. LIBRO (Subclase de Material)
   - Hereda todos los atributos de Material
   - Agrega: autor, genero
   - Override: mostrarInformacion() para mostrar info específica de libros

3. CD (Subclase de Material)
   - Hereda todos los atributos de Material
   - Agrega: artista, numeroCanciones, duracionTotal
   - Override: mostrarInformacion() para mostrar info específica de CDs

4. USUARIO (Clase para gestión de usuarios)
   - Atributos: idUsuario, nombre, apellido, numeroIdentificacion, limitePrestamos
   - Métodos: prestarMaterial(), mostrarInformacion()

5. BIBLIOTECA (Clase gestora)
   - Contiene ArrayList<Material> y ArrayList<Usuario>
   - Métodos: agregarMaterial(), mostrarMateriales(), prestarMaterialAUsuario()"

[DIAPOSITIVA 5: JUSTIFICACIÓN DEL DISEÑO]
==========================================

"¿Por qué este diseño cumple con los requisitos y principios de POO?

1. CUMPLIMIENTO DE REQUISITOS:
   - Gestiona materiales: ✓ (Libro y CD heredan de Material)
   - Registra usuarios: ✓ (Clase Usuario con límites personalizados)
   - Controla préstamos: ✓ (Método prestarMaterial() con validación de límites)
   - Muestra información: ✓ (método mostrarInformacion() polimórfico)
   - Búsqueda y filtrado: ✓ (mostrarLibros(), mostrarCDs() con instanceof)

2. PRINCIPIOS DE POO IMPLEMENTADOS:
   - ENCAPSULACIÓN: ✓ Atributos privados, acceso via getters/setters
   - ABSTRACCIÓN: ✓ Clases representan conceptos reales (Material, Usuario)
   - HERENCIA: ✓ Libro y CD heredan de Material
   - POLIMORFISMO: ✓ ArrayList<Material> contiene diferentes tipos
   - SOBRECARGA: ✓ Constructores y métodos sobrecargados"

[DIAPOSITIVA 6: DESCRIPCIÓN DE HERENCIA - PARTE 1]
==================================================

"Ahora explicaremos cómo implementamos la HERENCIA en nuestro sistema.

La herencia nos permite crear una jerarquía de clases donde las subclases heredan características de la superclase.

En nuestro caso de estudio (biblioteca), tenemos diferentes tipos de materiales:
- Libros físicos
- CDs de música
- Potencialmente revistas, DVDs, etc.

Todos comparten características comunes:
- Tienen un ID único
- Tienen título
- Tienen año de publicación
- Pueden estar disponibles o prestados
- Necesitan mostrar su información

Por eso creamos la superclase MATERIAL que contiene estos atributos y métodos comunes."

[DIAPOSITIVA 7: DESCRIPCIÓN DE HERENCIA - PARTE 2]
==================================================

"Implementación de herencia en código:

```java
// Superclase Material
public class Material {
    private int id;
    private String titulo;
    private int anioPublicacion;
    private boolean disponible;

    // Constructor
    public Material(int id, String titulo, int anioPublicacion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    // Métodos comunes
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        // ... más info común
    }
}

// Subclase Libro
public class Libro extends Material {
    private String autor;
    private String genero;

    // Constructor que llama a super()
    public Libro(int id, String titulo, String autor, int anio, String genero, boolean disp) {
        super(id, titulo, anio, disp);  // Inicializa atributos heredados
        this.autor = autor;
        this.genero = genero;
    }

    // Hereda mostrarInformacion() pero puede override si necesita
}
```

La herencia nos permite reutilizar código y mantener consistencia."

[DIAPOSITIVA 8: DESCRIPCIÓN DE POLIMORFISMO - PARTE 1]
======================================================

"El POLIMORFISMO nos permite tratar objetos de diferentes clases de manera uniforme.

En nuestro caso de estudio, la biblioteca necesita manejar diferentes tipos de materiales (libros, CDs) de la misma manera para:
- Almacenarlos en una lista
- Mostrar su información
- Gestionar préstamos

Sin polimorfismo, tendríamos que crear listas separadas:
```java
ArrayList<Libro> libros = new ArrayList<>();
ArrayList<CD> cds = new ArrayList<>();
```

Con polimorfismo, podemos usar una sola lista:
```java
ArrayList<Material> materiales = new ArrayList<>();
materiales.add(new Libro(...));
materiales.add(new CD(...));
```

Y cuando iteramos, cada objeto sabe cómo mostrar su información específica."

[DIAPOSITIVA 9: DESCRIPCIÓN DE POLIMORFISMO - PARTE 2]
======================================================

"Implementación de polimorfismo con override:

```java
// En la superclase Material
public void mostrarInformacion() {
    System.out.println("=== MATERIAL ===");
    System.out.println("ID: " + id);
    System.out.println("Título: " + titulo);
    System.out.println("Año: " + anioPublicacion);
}

// Override en Libro
@Override
public void mostrarInformacion() {
    System.out.println("=== LIBRO ===");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Autor: " + autor);        // Específico de Libro
    System.out.println("Género: " + genero);      // Específico de Libro
    System.out.println("Año: " + getAnioPublicacion());
    // ... estado de disponibilidad
}

// Override en CD
@Override
public void mostrarInformacion() {
    System.out.println("=== CD DE MÚSICA ===");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Artista: " + artista);    // Específico de CD
    System.out.println("Canciones: " + numeroCanciones); // Específico de CD
    System.out.println("Duración: " + duracionTotal);    // Específico de CD
    // ... estado de disponibilidad
}
```

En Biblioteca.java:
```java
public void mostrarMateriales() {
    for (Material material : materiales) {
        material.mostrarInformacion();  // ← POLIMORFISMO: ejecuta la versión correcta
        System.out.println("----------------------");
    }
}
```"

[DIAPOSITIVA 10: DEMOSTRACIÓN DEL SISTEMA]
===========================================

"Ahora mostraremos una demostración del sistema funcionando.

[Mostrar ejecución del Main.java]

Como pueden ver:
1. Se crean libros y CDs
2. Se agregan a la biblioteca
3. Se crean usuarios con diferentes límites
4. Se realizan préstamos respetando límites
5. Se muestra información polimórfica

El sistema funciona correctamente y demuestra todos los conceptos implementados."

[DIAPOSITIVA 11: VENTAJAS DEL DISEÑO]
=====================================

"Ventajas de nuestro diseño:

1. EXTENSIBILIDAD: Fácil agregar nuevos tipos de material (Revista, DVD)
2. MANTENIMIENTO: Cambios en Material afectan automáticamente a todos
3. REUTILIZACIÓN: Código común no se duplica
4. FLEXIBILIDAD: Polimorfismo permite manejar tipos diferentes uniformemente
5. ORGANIZACIÓN: Estructura clara y lógica

Este diseño cumple perfectamente con los principios SOLID de diseño orientado a objetos."

[DIAPOSITIVA 12: CONCLUSIONES]
==============================

"En conclusión, nuestro sistema de gestión de biblioteca:

✅ Cumple con todos los requisitos funcionales
✅ Implementa correctamente los principios de POO
✅ Demuestra herencia y polimorfismo efectivamente
✅ Es extensible y mantenible
✅ Resuelve el problema planteado de manera eficiente

El proyecto valida nuestros conocimientos en Programación Orientada a Objetos y nos prepara para desarrollar sistemas más complejos."

[DIAPOSITIVA 13: PREGUNTAS Y AGRADECIMIENTOS]
==============================================

"¿Tienen alguna pregunta?

Agradecemos a nuestros profesores por la oportunidad de aprender estos conceptos fundamentales de la programación.

¡Gracias por su atención!"

[FIN DEL VIDEO]

================================================================
INSTRUCCIONES PARA GRABAR EL VIDEO:
================================================================

1. Preparar PowerPoint con las diapositivas descritas
2. Grabar con buena iluminación y audio claro
3. Hablar de manera pausada y clara
4. Mostrar código relevante en pantalla
5. Ejecutar el programa para demostrar funcionamiento
6. Duración: 8-10 minutos máximo
7. Subir a YouTube o plataforma similar y obtener el link

================================================================
