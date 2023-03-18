
# BMI calculator
A biomedical calculator for the body mass index (BMI) and other 

![Diagrama UML](https://github.com/mruizvillarrazo/bmicalc/blob/main/doc/DiagramaUML.png)
<br />
<br />

## User Stories:   
<br />

### Historia de Usuario 1
As a entrenador de fitness,
Quiero calcular el IMC de mis clientes para hacer un seguimiento de su progreso con el tiempo y ajustar su plan de fitness en consecuencia.

#### Criterios de Aceptación:

##### Scenario 1:
Given a cliente con una masa de 70 kg y una altura de 1.7 m
When calculo su IMC
Then debo obtener un resultado de 24.22

##### Scenario 2:
Given a cliente con una masa de 0 kg y una altura de 1.7 m
When intento calcular su IMC
Then debo obtener una excepción 


### Historia de Usuario 2
As a médico,
Quiero clasificar el IMC de un paciente en una categoría para determinar su riesgo de ciertas condiciones de salud.

<br />

#### Criterios de Aceptación:

##### Scenario 1:
Given un IMC de 18.4
When determino su categoría
Then debo obtener un resultado de "BAJO PESO"

##### Scenario 2:
Given un IMC de 24.9
When determino su categoría
Then debo obtener un resultado de "NORMAL"

##### Scenario 3:
Given un IMC de 30.0
When determino su categoría
Then debo obtener un resultado de "OBESO"

<br />

### Historia de Usuario 3
As a investigador de la salud,
Quiero verificar si una persona tiene obesidad abdominal basándome en su circunferencia de cintura y género.

#### Criterios de Aceptación:

##### Scenario 1:
Given un hombre con una circunferencia de cintura de 80 cm
When verifico si tiene obesidad abdominal
Then debo obtener un resultado de false

##### Scenario 2:
Given una mujer con una circunferencia de cintura de 90 cm
When verifico si tiene obesidad abdominal
Then debo obtener un resultado de true

##### Scenario 3:
Given un género que no es 'M' o 'F'
When intento verificar la obesidad abdominal
Then debo obtener una excepción IllegalArgumentException con el mensaje "Argumento incorrecto"


<br />
<br />
<br />

## Especicifación del caso de uso
Nombre: Checkear obesidad
Actor Principal: Sistema.

+ Ámbito: El usuario quiere saber si según ciertos parámetros padece de obesidad o no.

+ Nivel: Subfunción.

+ Stakeholders e Intereses: Usuario, ya sea profesor o alumno.

+ Precondition: El usuario debe introducir todos los parámetros necesarios.

+ Garantías mínimas: Se sabe que aún estando mal los parámetros introducidos, el programa imprimirá aunque sea un mensaje de error en vez que que no haya ningún feedback.

+ Garantías de éxito: 
  + Usuario: Hombre introduce los parámetros
  + Sistema: Recibe los parámetros y los introduce en el método.
  + Sistema: El método checkea que los parámetros están correctos.
  + Sistema: Mediante condicionales se estudia si los datos del usuario corresponden a los de una persona obesa o no.
  + Sistema: Imprime un booleano correspondiente a estar o no obeso.
  + Usuario: Visualiza la información resultante.

+ Escenario alternativo:
  + Usuario: Usuario mujer introduce los parámetros
  + Sistema: Recibe los parámetros y los introduce en el método.
  + Sistema: El método checkea que los parámetros están correctos.
  + Sistema: En este caso al no tratarse de un hombre el concional deberá mirár otras condiciones para determinar si hay obesidad o no
  + Sistema: Imprime un booleano correspondiente a estar o no obeso.
  + Usuario: Visualiza la información resultante.

+ Extensiones:
  + Puede pasar que haya un error interno porque el programa se haya bugueado.
  + Durante los milisegundos de ejecución del programa puede darse que la máquina se apague por un apagón y no se pueda realizar nada.
  + El usuario puede equivocarse introduciendo los datos y tiene que volver al inicio del proceso.

## Posibles tests
1. Comprobar que a la hora de calcular el BMI lo que pasaria si se divide entre 0
2. Comprobar que sale "UNDERWEIGHT" en los limites inferiores del intervalo
3. Comprobar que sale un peso normal en el intervalo [18.5,24.9]
4. Comprobar que al estar en el intervalo [25,29.9] sale que se tiene sobrepeso
5. Comprobar que al superar el limite superior se tiene obesidad
6. Comprobar qué pasa al introducir en genero un char que no sea 'M' o 'F'
7. Comprobar que devuelve False si eres hombre y estas por debajo de 90 cm
8. Comprobar que devuelve True si eres hombre y estas por encima de 90 cm
9. Comprobar que devuelve False si eres mujer y estas por debajo de 80 cm
10. Comprobar que devuelve True si eres mujer y estas por encima de 80 cmparameters.
11. Comprobar que pasa si en el método de categoria el valor de bmi es poco realista
12. Comprobar qué pasa en el metodo que calcula el bmi si el valor de los parámetros es negativo
13. Comprobar que el objeto creado para los tests no sea nulo
14. Comprobar que los métodos acaben sus tareas en un cierto tiempo.


