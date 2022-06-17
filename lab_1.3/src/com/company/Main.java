    package com.company;

    /*
    Раціональний (нескоротний) дріб представляється парою цілих чисел (a, b), де поля:
     a – чисельник,
     b – знаменник.
    Створити клас Rational для роботи з раціональними дробами. Обов’язково мають
    бути реалізовані наступні методи:
    Унарна операція (аргументом є даний об’єкт):
     обчислення значення value(), a / b;

    Бінарні операції (перший аргумент – даний об’єкт, другий аргумент – об’єктпараметр):
             додавання add(), (a1, b1) + (a2, b2) = (a1·b2 + a2·b1, b1·b2);
             віднімання sub(), (a1, b1) – (a2, b2) = (a1·b2 – a2·b1, b1·b2);
             множення mul(), (a1, b1)  (a2, b2) = (a1·a2, b1·b2).
            * має бути реалізована приватна функція скорочення дробу Reduce(), яка обов’язково
            викликається при виконанні арифметичних операцій.*/
    public class Main {

        public static void main(String[] args) {
        Rational rational1 = new Rational(0, 1);

            System.out.println("*Перший дріб.");
        rational1.inputA();
        rational1.inputB();
        rational1.value(rational1);

            System.out.println("------------------------------------------------------");

        Rational rational2 = new Rational(0, 1);

            System.out.println("*Другий дріб.");
        rational2.inputA();
        rational2.inputB();

        rational1.mul(rational1, rational2);

        }
    }


