# Sistema de Inventario para Cocina

## 1. Resumen Ejecutivo
* **Descripción:** Sistema automatizado para el control, registro y gestión de insumos, recetas y pedidos en un entorno de cocina y repostería.
* **Problema Identificado:** Descontrol en el stock de ingredientes, mermas por falta de cálculo exacto en pedidos y errores manuales al descontar insumos.
* **Solución:** Una plataforma centralizada que administra recetas, calcula automáticamente los insumos necesarios al registrar un pedido y valida la calidad mediante pruebas continuas.
* **Arquitectura:** Basada en un repositorio de control de versiones centralizado en GitHub, integración continua mediante Drone CI y validación de lógica de negocio en Java/JUnit.

## Tabla de Contenidos (ToC)
- [Requerimientos](#2-requerimientos)
- [Instalación](#3-instalación)
- [Configuración](#4-configuración)
- [Uso](#5-uso)
- [Contribución](#6-contribución)
- [Roadmap](#7-roadmap)

---

## 2. Requerimientos
* **Servidores y Entorno:** Entorno de ejecución local Java Runtime / Servidor web ligero para desarrollo y pruebas.
* **Paquetes Adicionales:** JUnit 5 para pruebas unitarias y gestión de dependencias.
* **Versión:** Java 17 o superior.

---

## 3. Instalación
* **¿Cómo instalar el ambiente de desarrollo?** 
  1. Clonar el repositorio desde GitHub.
  2. Abrir el proyecto en un entorno compatible con Java (como IntelliJ o Eclipse).
* **¿Cómo ejecutar pruebas manualmente?** 
  - Ejecutar la clase de prueba ubicada en `src/test/java/InventarioTest.java` utilizando JUnit.
* **¿Cómo implementar la solución?** 
  - Compilación local y empaquetado del sistema listo para ejecución o pruebas de integración.

---

## 4. Configuración
* **Configuración del producto:** Uso del archivo de pipeline `.drone.yml` para la integración continua y la estructura de directorios estándar de Java.
* **Configuración de requerimientos:** Definición de variables de stock iniciales y parámetros de cálculo en las clases de prueba.

---

## 5. Uso
* **Usuario Final:** Acceso a la interfaz para consultar recetas, registrar pedidos y verificar existencias de insumos en tiempo real.
* **Usuario Administrador:** Control total sobre el inventario, actualización de stock base, revisión de reportes y gestión de seguridad del sistema.

---

## 6. Contribución
* **Guía para usuarios:** 
  1. Hacer un *Fork* y clonar el repositorio: `git clone https://github.com/Yuridia0301/sistema-inventario-cocina.git`
  2. Crear un nuevo branch para tu aportación: `git checkout -b feature/nuevo-modulo`
  3. Enviar tus cambios mediante un *Pull Request* hacia la rama `develop`.
  4. Esperar la revisión y aprobación para hacer el *merge*.

---

## 7. Roadmap
* **Futuras implementaciones:** 
  - Conexión con una base de datos relacional en la nube (MySQL/PostgreSQL).
  - Módulo de notificaciones automáticas cuando un ingrediente esté por agotarse.
  - Interfaz gráfica web completa.
