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
