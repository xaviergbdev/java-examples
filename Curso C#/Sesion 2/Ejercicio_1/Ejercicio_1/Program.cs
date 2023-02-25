using System;
using System.Globalization;

namespace Ejercicio_1
{
    class Program
    {
        static void Main(string[] args)
        {
            string name;
            string last_name;
            int age;
            bool programar;
            string validar;
            float salario;
            Console.WriteLine("Ingrese su nombre :");
            name = Console.ReadLine();
            Console.WriteLine("Ingrese su apellido :");
            last_name = Console.ReadLine();
            Console.WriteLine("Ingrese su edad :");
            age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Sabe programar  si/ no?");
            validar = Console.ReadLine();
            if (validar.Equals("si"))
            {
                programar = true;
            } else
            {
                programar = false;
            }
            Console.WriteLine("ingrese su salario mensual : ");
            salario = float.Parse(Console.ReadLine(), CultureInfo.InvariantCulture.NumberFormat);
            //salario = Convert.ToSingle(Console.ReadLine());
            Console.WriteLine("Su nombre es  -> "+ name);
            Console.WriteLine("Su apellido es  -> " + last_name);
            Console.WriteLine("Su edad es  -> " + age);
            Console.WriteLine("Sabe programar  -> " + programar);
            Console.WriteLine("Su salario es  -> " + salario);

        }
    }
}
