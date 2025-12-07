# Carrera de Relevos Multihilo — Java

Este proyecto simula una carrera de relevos usando concurrencia en Java. Se implementaron dos enfoques:

## 🔹 Commit 1: Threads + join()
- Cada corredor es un `Thread`.
- Los corredores del mismo equipo corren en orden usando `join()`.
- Los equipos compiten en paralelo.

## 🔹 Commit 2: ExecutorService
- Los corredores ahora son `Runnable`.
- Cada equipo usa un `SingleThreadExecutor` para ejecutar sus corredores en secuencia automáticamente.
- No se necesita sincronización manual.

## 🔹 Lo que se logró
- Uso de hilos y dependencias entre tareas.
- Paralelismo entre equipos y orden interno garantizado.
- Migración a un modelo más eficiente con `ExecutorService`.
- Código organizado en `Main`, `Equipo` y `Corredor`.

## 🔹 Resultado
Simulación clara donde los equipos corren al mismo tiempo, pero cada relevo respeta su orden según el enfoque utilizado.
