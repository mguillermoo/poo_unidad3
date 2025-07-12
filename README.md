# Sorteo de Partidos Aleatorios

**Universidad Politécnica Salesiana**  
**Materia:** Programación Orientada a Objetos  
**Autor:** Mónica Guillermo

---

## Objetivo

Desarrollar una aplicación que realice el sorteo de los partidos de forma aleatoria en cada etapa, asegurando que:

- Ningún equipo repita un partido en la misma etapa.  
- Un equipo no puede ser tanto competidor como oponente en un mismo partido.

---

## Descripción del Proyecto

La aplicación permite ingresar los nombres de los equipos según la etapa (octavos, cuartos, semifinales), y realiza un sorteo aleatorio para asignar enfrentamientos entre equipos en cada etapa.  

El algoritmo utiliza **recursividad** para dividir el problema en subproblemas más pequeños y generar los emparejamientos sin repetición.

---

## Requisitos y funcionalidades

- Ingreso dinámico de nombres de equipos para cada etapa.  
- Sorteo aleatorio y sin repeticiones en los enfrentamientos.  
- Validación para que un equipo no juegue contra sí mismo.  
- Visualización clara de los partidos sorteados por etapa.

---

## Ejemplo de ejecución

A continuación, se muestran capturas de pantalla con la salida del programa:

![Salida del programa](src/Captura%20de%20pantalla%202025-07-12%20120148.png)  
![Salida del programa](src/Captura%20de%20pantalla%202025-07-12%20120306.png)  
![Salida del programa](src/Captura%20de%20pantalla%202025-07-12%20120415.png)

---

## Instrucciones para clonar y ejecutar el proyecto

### Clonar el repositorio

```bash
git clone https://github.com/mguillermoo/poo_unidad3.git
cd poo_unidad3
