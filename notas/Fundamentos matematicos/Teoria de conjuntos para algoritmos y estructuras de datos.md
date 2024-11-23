# Teoría de Conjuntos para Algoritmos y Estructuras de Datos

## ¿Por que es importante estudiar teoría de conjuntos para algoritmos y estructuras de datos?
La teoría de conjuntos es como aprender las reglas básicas 🎒 antes de jugar un juego🧩. Nos ayuda a entender como agrupar y organizar datos, que es algo esencial cuando empezamos a trabajar con algoritmos y estructuras de datos. Por ejemplo, conceptos como unión e intersección nos permiten resolver problemas comunes como encontrar elementos semejantes en una lista o eliminar duplicados. Además, nos prepara para trabajar con estructuras mas avanzadas como arboles y grafos. Conocer sobre conjuntos no solo nos ayudara a razonar mejor, si no que también hará que diseñar y analizar algoritmos sea mas fácil y efectivo.
## Definición y conceptos básicos
### ¿Qué son los elementos y los conjuntos?
- Un **elemento** es algo individual puede ser una cosa, una persona, o incluso una idea. Por ejemplo, una manzana 🍎, un número como el 5️⃣, o el color azul 🔵.
- Un **conjunto** es un grupo de elementos que ponemos juntos porque tienen algo en común piensa en el conjunto como una "caja" donde guardas cosas relacionadas.
Imagina que tienes una caja con frutas. Las frutas (manzana 🍎, plátano 🍌, naranja 🍊) son los elementos, y la caja es el conjunto.
- Esto para la notación de conjunto se escribe de la siguiente manera:
```
F = {manzana, plátano, naranja}

La 'F' representa el nombre del conjunto, en este caso, frutas.
```
#### Cosas importantes sobre los conjuntos ❗❗❗
1. No se repiten las cosas: Si tenemos dos manzanas 🍎🍎en nuestra caja, solo escribimos "manzana" una vez.
2. El orden no importa: la caja con {manzana, plátano, naranja} es igual a {plátano, manzana, naranja}
#### ¿Qué es un subconjunto?
Un **subconjunto** es como un grupo mas pequeño dentro de un grupo mas grande. Es decir, tomamos algunos elementos del conjunto principal y formamos un grupo nuevo:
🎯 **Ejemplo sencillo:**
- Si tienes un conjunto de frutas:
```
F = {manzana 🍎, platano 🍌, naranja 🍊}
```

Un subconjunto puede ser solo aquellas frutas que nos gustan para un jugo o batido:
```
B = { platano 🍌, manzana 🍎}
```

#### Nota importante ❗❗❗
Para que sea un subconjunto, **todas las cosas en el subconjunto deben estar también en el conjunto original.**
Por ejemplo:
- {plátano 🍌} **sí es un subconjunto.**
- {uva 🍇} **no es un subconjunto**, porque la uva no está en nuestro conjunto o caja de "Frutas".
### Diferencia entre conjuntos y listas
1. **Conjuntos** 📦 recordemos que son grupo de cosas donde:
	1. **No hay duplicados** cada elemento aparece una sola vez.
	2. **El orden no importa** 
		- Ejemplo: {🍎,🍌,🍊}\{🍎, 🍌, 🍊\}{🍎,🍌,🍊} es igual a {🍌,🍊,🍎}\{🍌, 🍊, 🍎\}{🍌,🍊,🍎}.
📦 **Úsalo cuando quieres agrupar cosas sin importar cuántas veces aparecen o en qué orden están.**

2. Listas 📝es un grupo de cosas donde:
	1. **Puedes tener duplicados.** Si algo aparece más de una vez, la lista lo registra.
		- Ejemplo: La lista [🍎,🍌,🍎,🍊][🍎, 🍌, 🍎, 🍊][🍎,🍌,🍎,🍊] mantiene las dos manzanas.
	2. **El orden importa**
		- Ejemplo: [🍎,🍌,🍊][🍎, 🍌, 🍊][🍎,🍌,🍊] es diferente a [🍌,🍊,🍎][🍌, 🍊, 🍎][🍌,🍊,🍎].
📝 **Úsala cuando el orden es importante o cuando quieres contar cuántas veces aparece cada cosa.**

## Operaciones básicas 

Las operaciones en teoría de conjuntos nos permiten manipular y combinar conjuntos de formas útiles.
### Unión de conjuntos (∪)
La **unión** de dos conjuntos es el conjunto que contiene **todos** los elementos de ambos conjuntos, **sin repetir**. Si un elemento está en cualquiera de los conjuntos, estará en la unión.
**Ejemplo sencillo:**
Continuando con el mismo ejemplo de la caja de frutas, imaginemos que tenemos ahora dos cajas de frutas:
```
Conjunto A = {manzana🍎, platano🍌} (frutas que tenemos en casa)
Conjunto B = {naranja🍊, manzana🍎} (frutas que tienes en tu trabajo)
```
La unión de A y B es el conjunto de todas las frutas que tienes sin repetir ninguna.
```
A∪B = {manzana🍎,platano🍌,naranja🍊}
```
>Aquí, la manzana 🍎 solo aparece una vez, aunque esté en ambos conjuntos.

### Intersección de Conjuntos (∩)
La **intersección** de dos conjuntos es el conjunto que contiene solo los **elementos que están en ambos conjuntos**. Es como encontrar lo que tienen en común.
**Ejemplo sencillo:**  
Siguiendo con los conjuntos de frutas:
```
Conjunto A = {manzana🍎, platano🍌}
Conjunto B = {naranja🍊, manzana🍎}
```
La **intersección** de A y B es el conjunto con las frutas que están en ambos lugares:
```
A∩B={manzana🍎}
```
Solo la manzana 🍎 está en ambos conjuntos, por eso es el único elemento en la intersección.

### Diferencia de conjuntos(-)
La **diferencia** entre dos conjuntos es el conjunto de elementos que están en el primer conjunto, pero **no en el segundo**. Es como quitar de un conjunto todo lo que también está en el otro.
**Ejemplo sencillo:**  
Siguiendo con las frutas:
```
Conjunto A = {manzana🍎, platano🍌}
Conjunto B = {naranja🍊, manzana🍎}
```
La **diferencia** de A menos B (es decir, lo que está en A pero no en B) es:
```
A − B={platano🍌}
```
El plátano 🍌 está solo en A, por eso queda en la diferencia.

### Diferencia Simétrica (∆)
La **diferencia simétrica** de dos conjuntos es el conjunto de elementos que están **en uno de los dos conjuntos, pero no en ambos**. Es como juntar las diferencias de los dos conjuntos.
**Ejemplo sencillo:**  
Con los mismos conjuntos de frutas:
```
Conjunto A = {manzana🍎, platano🍌}
Conjunto B = {naranja🍊, manzana🍎}

```
La **diferencia simétrica** de A y B es:
```
AΔB={platano🍌,naranja🍊}
```
El plátano 🍌 está solo en A, y la naranja 🍊 está solo en B. Ambos elementos están en la diferencia simétrica.

### Ejercicio para practicar
> Escribir un programa para calcular la unión e intersección de dos listas 