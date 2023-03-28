# SoLiD Calculator
Ejemplo de aplicacion de los principios SOLID en una calculadora. Ejemplo en java de como aplicar SOLID en una aplicación más real. El código esta hecho con Java 17.

## SOLID Principles

Los principios SOLID son un conjunto de reglas y prácticas que se utilizan para desarrollar software de alta calidad, mantenible y escalable. 
Los principios SOLID fueron introducidos por Robert C. Martin en su artículo de 2000 "Design Principles and Design Patterns" (Principios de Diseño y Patrones de Diseño). Estos conceptos fueron posteriormente desarrollados por Michael Feathers, quien nos presentó el acrónimo SOLID. En los últimos 20 años, estos cinco principios han revolucionado el mundo de la programación orientada a objetos, cambiando la forma en que escribimos software.

### SRP Single Responsability Principle
Este principio establece que una clase o módulo debe tener una única razón para cambiar, es decir, que debe tener una única responsabilidad. Esto se relaciona con el concepto de cohesión.

Consideraciones
1. “Una clase debe tener una sola razón para cambiar”
2. Lo importante es no colocar funciones que pueden cambiar por diferentes razones en la misma clase
3. Una responsabilidad se entiende como una razón para cambiar
4. Testing – A class with one responsibility will have far fewer test cases.
5. Lower coupling – Less functionality in a single class will have fewer dependencies.
6. Organization – Smaller, well-organized classes are easier to search than monolithic ones.

#### Código


