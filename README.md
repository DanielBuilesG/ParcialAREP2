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
Para generar la carpeta del target 


Una vez hecho eso, gracias a los archivos de docer que vienen con el proyecto se puede simplemente correr el siguiente comando para que se creen las imagenes y los contenedores necesarios para que corra en docker

```
docker-compose up -d
```


Cuando las imagenes y los contenedores del docker ya estén funcionando se deberia poder ver el funcionamiento de el Collatz llendo a 

```
localhost:45000/index.html
```






# Prueba del proyecto funcionando 



El proyecto ya subido a AWS y CORRIENDO CON DOCKER, se puede ver la imagen corriendo en la ultima linea

![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/6013816b-3c42-4978-bd99-b2b3f5ae4bc9)



El proyecto ya subido a AWS corriendo con docker
![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/0ea3217c-de30-408a-9a02-31a91e201ddb)


# Video

https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/e6e83111-2b12-4a06-bc27-60cc471d3dd1




