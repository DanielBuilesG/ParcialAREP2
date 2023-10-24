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


# Como correrlo

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




# Como correrlo en EC2


para correrlo en EC2 se debe descargar docker 

```
sudo yum update -y
sudo yum install docker

sudo service docker start

sudo usermod -a -G docker ec2-user
```

Estos comandos se deben poner en el orden mostrado, una ves puesto el ultimo se cierra y se vuelve a abrir la instancia para que los permisos tengan efecto

Luego se debe correr el siguiente comando 


```
docker run -d -p 45000:6000 --name parcial2 danielbuiles/parcialarep2
```

Con esto la instancia va a descargar el repositorio de docker y deberia estar corriendo inmediatamente como se muestra a continuacion

![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/47f6a572-8dc4-46d1-b8c9-191467616466)


Una vez hecho esto se editan los grupos de seguridad de la instancia para que acepte conecciones de la direccion 45000

![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/fe8736f4-19b0-411c-913f-a72ee90c2fc2)


![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/c5bb8cc3-3b62-4ff6-b527-9272876a4273)

y ya con esto deberia funcionar directamente desde ec2, solamente se debe copiar la direccion **DNS publica** de la maquina 

(debe ser diferente la suya que la mia)


![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/656cd90f-5e08-4cd9-b6b7-6a788c80c803)


Al final solo abra un navegador y agregue al final de la direccion **:45000/index.html** como se muestra a continuacion

![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/ef620084-82f7-4d91-8c7d-b2a13f3c4751)



# Prueba del proyecto funcionando 



El proyecto ya subido a AWS y CORRIENDO CON DOCKER, se puede ver la imagen corriendo en la ultima linea

![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/6013816b-3c42-4978-bd99-b2b3f5ae4bc9)



El proyecto ya subido a AWS corriendo con docker
![image](https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/0ea3217c-de30-408a-9a02-31a91e201ddb)


# Video

https://github.com/DanielBuilesG/ParcialAREP2/assets/73034258/e6e83111-2b12-4a06-bc27-60cc471d3dd1




