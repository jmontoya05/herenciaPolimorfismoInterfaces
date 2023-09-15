# EJERCICIOS HERENCIA, POLIMORFISMO E INTERFACES

1. En este ejercicio representaremos diferentes profesiones con su
respectivo sueldo.
Crear clase Profesión con los siguientes atributos:
● Sueldo, de tipo Long.
● Bono, de tipo Long.
● El sueldo base será de $2’000.000.
Crea los getter y setter para el atributo bono.
Crear constructor vacío y otro con todos los argumentos.
Crear el método calcularSueldo() -> se calculará total: sueldo + bono.
Debe retornar un Long.
Crear las clases Ingeniero, Arquitecto y Médico.
● Extender de la clase Profesión.
● Asignar los siguientes valores a la variable Bono:
○ Ingeniero: $5’000.000
○ Arquitecto: $2’000.000
○ Médico: $3’000.000
● Calcule el sueldo para cada uno de los casos.


![Descripción de la imagen](https://i.ibb.co/KwvLYYf/Profesiones.png)

2. En este ejercicio modelaremos los tipos de tarjeta de crédito que
posee un banco.
Crear la clase TarjetaCredito con los siguientes atributos:
● Emisor, de tipo String -> Visa, MasterCard, American Express.
● Cupo, de tipo Long.
● numeroTarjeta, de tipo String.
● cvv, de tipo Integer.
● fechaVencimiento, de tipo LocalDate.
Crear constructor vacío y otro con todos los argumentos.
Crear los métodos getter y setter para todos los atributos.
Crear método imprimir() -> debe mostrar en consola el emisor, cupo,
número de tarjeta, cvv y fecha de vencimiento.
Crear la clase correspondiente a cada tipo de tarjeta de crédito:
● Clásica.
● Dorada.
● Platinum.
● Black.
Extender de la clase TarjetaCredito.
Asignar cupo, número de tarjeta, cvv y fecha de vencimiento para cada
tipo de tarjeta de crédito.
Ejecutar el método imprimir para cada caso.


![Descripción de la imagen](https://i.ibb.co/gZtdnQf/Tarjetas-de-credito.png)

3. En este ejercicio calcularemos el área de diferentes figuras geometricas.
Crear una interfaz FiguraGeometrica con los siguientes
métodos:calcularArea()
calcularPerimetro()
Crear las clases cuadrado, triangulo y circulo con los siguientes
atributos:
Alto, de tipo Integer.
Ancho, de tipo Integer.
Implementar la interfaz polígono.
Calcular área, perímetro y número de lados para cada uno de los
casos.


![Descripción de la imagen](https://i.ibb.co/BZFYjTd/Figuras-geometricas.png)

4. En una aplicación de música, se requiere implementar diferentes tipos de
   reproductores de música utilizando programación orientada a objetos
   (POO) en Java.
   • Cada reproductor de música debe tener la capacidad de reproducir música,
   pausarla y detenerla. Además, se debe poder obtener el nombre del
   reproductor utilizado.
   • Tu tarea es implementar una interfaz llamada "ReproductorMusica" que
   defina los métodos necesarios para cumplir con los requisitos mencionados
   anteriormente.
   • Además, debes crear al menos dos clases que implementen la interfaz
   "ReproductorMusica" y representen diferentes tipos de reproductores de
   música. Cada clase debe tener un atributo para almacenar el nombre del
   reproductor y debe implementar los métodos definidos en la interfaz.
   • Finalmente, en el método principal de tu programa, crea instancias de las
   clases que has creado y muestra por pantalla el funcionamiento de los
   métodos, así como el nombre del reproductor utilizado.
   Recuerda utilizar el enfoque de programación orientada a objetos y aprovechar al
   máximo los conceptos de interfaces, clases y métodos.


   ![Reproductor de musica](https://i.ibb.co/JtjQX4k/Musica.png)

5. En una tienda de libros, se necesita desarrollar un sistema para administrar
   el inventario. Cada libro tiene un título, un autor y un precio.
   • Tu tarea es utilizar interfaces para implementar un sistema de clasificación
   de libros. Implementa las siguientes interfaces:
   • Mostrable: Define un método mostrarInformacion() que imprima por
   pantalla la información del libro en el siguiente formato: "Título: [título del
   libro] - Autor: [autor del libro] - Precio: [precio del libro]".
   • Vendible: Define un método obtenerPrecio() que retorne el precio del
   libro.
   • Luego, crea una clase llamada Libro que represente un libro y implemente
   ambas interfaces. La clase debe tener atributos para almacenar el título,
   autor y precio del libro, y debe implementar los métodos definidos en las
   interfaces.
   • Finalmente, en el método principal de tu programa, crea al menos dos
   instancias de la clase Libro con diferentes títulos, autores y precios. Utiliza
   los métodos de las interfaces para mostrar la información y obtener el
   precio de cada libro.


   ![Inventario libros](https://i.ibb.co/26zxPT4/Inventario-libros.png)


6. Imagina que estás desarrollando un sistema de ges1ón de vehículos que debe manejar
diferentes 1pos de vehículos, como automóviles y motocicletas. Los vehículos 1enen
caracterís1cas comunes como número de ruedas, marca y modelo, pero también 1enen
propiedades específicas.
Define una clase base llamada Vehiculo que tenga los siguientes atributos y métodos:
Atributos: ruedas, marca, modelo
Método: obtener_informacion() que imprime la información básica del vehículo.
Crea dos clases derivadas de Vehiculo:
a. Automovil:
Atributos adicionales: numero_puertas, 1po_combus1ble
Método: obtener_informacion() que llama al método base y luego muestra la información
específica del automóvil.
b. Motocicleta:
Atributos adicionales: cilindrada, 1po_manejo
Método: obtener_informacion() que llama al método base y luego muestra la información
específica de la motocicleta.
Define una interfaz llamada Conducible con el método conducir().
Implementa la interfaz Conducible en las clases Automovil y Motocicleta. En el método
conducir(), simplemente imprime un mensaje genérico indicando que el vehículo se encuentra
en movimiento.
Crea una clase llamada Propietario con los siguientes atributos y métodos:
Atributos: nombre, apellido, vehiculo (de 1po Vehiculo)
Método: mostrar_informacion() que imprime los detalles del propietario y su vehículo.
Crea instancias de diferentes 1pos de vehículos (automóviles y motocicletas) y asigna
propietarios a cada uno. Luego, muestra la información de los propietarios y sus vehículos.


   ![Gestion vehiculos](https://i.ibb.co/09tYzBW/Gestion-vehiculos.png)
