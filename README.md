# Reporte del Código: Perceptrón

## Descripción General

Este programa implementa un perceptrón en Java para aprender a clasificar las funciones lógicas **AND** y **OR** con dos entradas binarias. El perceptrón es un modelo de inteligencia artificial basado en una neurona artificial que ajusta sus pesos para predecir salidas binarias a partir de entradas binarias.

---

## Estructura del Programa

1. **Clase Perceptron**  
   Define el modelo del perceptrón, con:  
   - Un vector de pesos para cada entrada.  
   - Un término de sesgo (bias).  
   - El método `entrenar` que ajusta pesos y bias usando la regla del perceptrón durante varias iteraciones.  
   - El método `predecir` que calcula la salida para una entrada dada, aplicando una función escalón (0 o 1).

2. **Clase Dataset**  
   Contiene los datos de entrenamiento:  
   - Las entradas (vectores binarios).  
   - Las salidas esperadas.

3. **Clase trainingdata**  
   Métodos para imprimir:  
   - Datos de entrada.  
   - Pesos aprendidos y bias.  
   - Ecuación final del modelo.  
   - Predicciones y precisión.

4. **Clase trainer**  
   Orquesta el proceso de entrenamiento y muestra resultados para un conjunto dado:  
   - Entrena el perceptrón.  
   - Imprime los resultados (datos, pesos, ecuación, predicciones, precisión).

5. **Método main**  
   Ejecuta pruebas para las funciones AND y OR con dos entradas.

---

## Funcionamiento

- Se inicializan pesos y bias aleatoriamente.  
- El perceptrón se entrena con las entradas y salidas esperadas.  
- Los pesos y bias se ajustan para minimizar el error de clasificación.  
- Se imprimen:  
  - Entradas usadas.  
  - Pesos y bias aprendidos.  
  - Ecuación que representa el modelo final.  
  - Predicciones para cada entrada.  
  - Precisión del modelo.

---

## Resultados Esperados

- El perceptrón aprende correctamente las funciones AND y OR con dos entradas.  
- Precisión cercana al 100% después de 100 iteraciones.  
- La ecuación final describe la frontera de decisión que separa las clases.

---

## Conclusión

El código muestra la capacidad básica del perceptrón para aprender funciones lógicas linealmente separables. Es una implementación  didáctica para entender fundamentos de aprendizaje supervisado y redes neuronales.

