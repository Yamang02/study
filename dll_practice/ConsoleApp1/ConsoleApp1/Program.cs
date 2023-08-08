using System;

namespace MyApp
{
    public class Program
    {
        Program()
        {
            System.Console.WriteLine("Program instance created");
        }
        public static void Main(string[] args)
        {
            System.Console.WriteLine("Main Method started...");
            Program p1 = new Program();
        }
    }
}

