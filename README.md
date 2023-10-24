# Parcial AREP 2 

PROBLEMA:
La conjetura de Collatz dice que si usted crea una secuencia de números, a partir de cualquier entero positivo, siguiendo las reglas descritas abajo, siempre la secuencia terminará en le número 1. Esta conjetura aún no se ha demostrado.

Las reglas son:

 f(n)=n/2

 si n es par.

f(n)=3n+1

 si n es impar.

La secuencia se construye a partir de un número dado k
 así:

a0=k

ai=f(ai−1)

Por ejemplo, dato el número k=13
  
  la secuencia sería:

13→40→20→10→5→16→8→4→2→1


# Funcionamiento

Para descargar el proyecto se debe usar

```
git clone https://github.com/DanielBuilesG/ParcialAREP2
```

Para usarlo se debe hacer 


```
mvn clean install
```













![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/6013816b-3c42-4978-bd99-b2b3f5ae4bc9)



El proyecto ya subido a AWS corriendo con docker
![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/0ea3217c-de30-408a-9a02-31a91e201ddb)
