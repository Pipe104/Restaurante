# 🍽️ Restaurante - Menús Automáticos

Proyecto en **Java** que implementa el patrón **Abstract Factory** para generar menús completos (Vegetariano, Italiano, Colombiano).  
Cada menú está compuesto por: **Bebida, Entrada, Plato principal y Postre**.  
El usuario decide qué elementos consumir de forma interactiva.

---

## ✨ Funcionalidad
- Generar menús coherentes (todos los elementos del mismo tipo).
- Permitir agregar nuevos menús sin modificar la lógica central.
- Evitar mezclas de componentes entre distintos menús.
- Interacción por consola: el usuario elige el menú y decide qué consumir.

---

## 🏗️ Estructura
- `AbsFabricaMenu`: clase abstracta con métodos `traerBebida()`, `traerEntrada()`, etc.
- `MenuVegetariano`, `MenuItaliano`, `MenuColombiano`: implementaciones concretas.
- Componentes: `Bebida`, `Entrada`, `PlatoPrincipal`, `Postre` y sus variantes.
- `Restaurante`: clase principal con el `main`.

---

## 🏗️ Diagrama de clases
<img width="1189" height="1263" alt="Restaurante" src="https://github.com/user-attachments/assets/5ffc8f77-d837-4d6c-bf4b-9e9926600885" />



## ▶️ Ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/Pipe104/Restaurante.git
