import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //Funcion para devolver el caracter al revés
        System.out.println(reverse("xavier"));
        System.out.println("--------------------------------");
        //Ejercicio 1
        String nombres [] = {"Xavier", "Manuel","Estaban"};
        for(String item:nombres){
            System.out.println("Los valores son -> " + item);
        }
        System.out.println("------------------------------");

        //Ejercicio 2

        int numeros[][] = {
                { 1,2,3},
                {11,12,13}};
        for(int i=0 ; i<numeros.length;i++){
            for (int j=0;j<numeros[0].length;j++){
                System.out.println("Posicion "+ "["+i+"]"+"["+j+"]" + " valor -> "+numeros[i][j]);
            }
        }
        System.out.println("-----------------------------------");
        //Ejercicio 3

        Vector<String> nombre = new Vector<>();
        nombre.add("Ernesto");
        nombre.add("Pedro");
        nombre.add("Margaret");
        nombre.add("Adolfo");
        nombre.add("Martin");

        System.out.println(nombre);
        System.out.println("Eliminando el 2do y 3er elemento");
        nombre.remove(1);
        nombre.remove(1);
        System.out.println(nombre);

        //Ejercicio 4

        //Los vectores con la capacidad por defecto duplican su capacidad cada
        //vez que aumentamos los valores y no have un uso optimo de la memoria

        System.out.println("------------------------------------");
        //Ejericio 5

        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("Mesa");
        elementos.add("Silla");
        elementos.add("Cocina");
        elementos.add("Sofa");

        LinkedList<String> elementosLista= new LinkedList<>(elementos);

        System.out.println("ArrayList "+elementos);
        System.out.println("LinkedList "+ elementosLista);

        System.out.println("------------------------------------");

        //Ejercicio 6

        ArrayList<Integer> nums = new ArrayList<>();
        int cont =0;

        while( cont<10){
            nums.add(cont+1);
            cont++;
        }
        System.out.println(nums);
        int cont2=0;
        while(cont2<nums.size()){

            if (nums.get(cont2)%2==0){
                nums.remove(cont2);
            }
            cont2++;
        }
        System.out.println(nums);

        System.out.println("-----------------------");

        //Ejercicio 7

        try{
            DividePorCero(4,0);
        }catch (Exception e){
            System.out.println("Esto no se puede hacer");
        }finally {
            System.out.println("Demo de Codigo");
        }

        System.out.println("-------------------------------");

        //Ejercicio 8

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir fichero origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Introducir fichero destino: ");
        String fileOut = scanner.nextLine();
        hacerCopia(fileIn, fileOut);

        System.out.println(" -----------------------");

        //Ejercicio 9
        // Agregar datos a un fichero, pidiendo datos desde un arraylist
        //El ficher existente es data_anterior.txt

        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("Manuel");
        estudiantes.add("Esteban");
        estudiantes.add("Martin");

        try {
            InputStream in = new FileInputStream("data_anterior.txt");
            byte [] data = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("copia.txt");
            out.println(estudiantes);
            out.write(data);
            out.close();

        } catch(Exception e){
            System.out.println(" Exception -> "+ e.getMessage() );
        }


    }

    public static  void hacerCopia(String fileIn,String fileOut)
    {
        try{
            InputStream entrada = new FileInputStream(fileIn);
            byte[] data = entrada.readAllBytes();
            entrada.close();

            PrintStream salida  =new PrintStream(fileOut);
            salida.write(data);
            salida.close();

        }catch (Exception e){
            System.out.println(" Excepcion -> " + e.getMessage());
        }
    }
    public static String reverse(String cadena){

        String creves = "";

        for (int i =cadena.length()-1;i >= 0;i--){
            creves+=cadena.charAt(i);
        }

        return creves;
    }

    public static int DividePorCero(int a,int b) throws ArithmeticException{
        int resultado = 0;
        try {
            resultado =a/b;
        }catch(ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }
}
