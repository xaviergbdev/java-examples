using System;

namespace Ejercicio_3
{
    class Program
    {
        static void Main(string[] args)
        {
            int num;
            Console.WriteLine("Ingrese un numero :");
            num = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("El numero es mayor o igual a 18 ->" + (num>=18));
            Console.WriteLine("-----------------");
            Console.WriteLine("Ingrese el char :");
            char c = Convert.ToChar(Console.ReadLine());
            Console.WriteLine("El char es a ? "+ (c.Equals('a')));
            Console.WriteLine("-----------------");
            int num2 = 10;
            int num3 = 20;
            Console.WriteLine(" 10 es mayor 3  y 20  es menor que  30  ->"+ ((num2>3)&&(num3<30)));
            Console.WriteLine(" 10 es mayor 20  y 20  es menor que  30  ->" + ((num2 > 20) && (num3 < 30)));

        }
    }
}
