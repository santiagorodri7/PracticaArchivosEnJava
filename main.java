import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;   
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
       
        File archivo = new File("data/agenda.txt");
        System.out.println("El archivo existe? " + archivo.exists());
        System.out.println("Que nombre  tiene el archivo " + archivo.getName());
        System.out.println("Es archivo? " + archivo.isFile());
        System.out.println("En que ruta esta? " + archivo.getPath());
        System.out.println("Tamaño: " + archivo.length());
        String linea = String.join(";", "samuel", "123123");
        System.out.println(0 % 2 ==0);
       System.out.println(linea);
       
        /*   FileWriter escritor = new FileWriter(archivo, false);
        escritor.write("julian;3231232" + "\n");
        escritor.write("maria;2302932" + "\n");
        escritor.write("samuelito;231254132"+ "\n");
        escritor.write("samuelito;231254132;"+ "\n");
        escritor.close();
        System.out.println("El archivo existe? " + archivo.exists());
        System.out.println("Tamaño: " + archivo.length()); */
 /*        FileReader lector = new FileReader(archivo); 
        int c = lector.read();
        while (c != -1) { 
            System.out.print((char) c); 
            c = lector.read(); 
        }
        lector.close(); */
/*          try(BufferedWriter escritor2 = new BufferedWriter(new FileWriter(archivo))){
            escritor2.write("julian;3232323");
            escritor2.newLine();
            escritor2.write("ana;3232323");
             escritor2.newLine();
            escritor2.write("samuel;31231233");
              escritor2.newLine();
        } */
       guardar(archivo);
       cargar(archivo);
/*         try(BufferedReader lector2 = new BufferedReader(new FileReader(archivo))){
            String linea = lector2.readLine();
            while(linea != null){
                String[] campos = linea.split(";", -1);
                if(campos.length != 2){
                    throw new IllegalArgumentException("Datos incorrectos, porfavor revisen que esten bien, el registro numero "+ contador + " fallo al intentarse leer, este fue el registro que tiene errores: " + linea);    
                }
                System.out.println("Mi nombre es: " + campos[0]);
                System.out.println("Mi telefono es: " + campos[1]);
            
            linea = lector2.readLine();
            contador++;
            
        }
    } */
    System.out.println("Tamaño del archivo: " + archivo.length());
    //46
    //43
       
        
   

        

    }
    public static void guardar(File archivo) throws IOException{
        try(BufferedWriter escritor2 = new BufferedWriter(new FileWriter(archivo))){
            escritor2.write("julian;3232323");
            escritor2.newLine();
            escritor2.write("ana;3232323");
             escritor2.newLine();
            escritor2.write("samuel;31231233");
              escritor2.newLine();
        }
    }
    public static void cargar(File archivo) throws IOException{
            int contador=1;
                try(BufferedReader lector2 = new BufferedReader(new FileReader(archivo))){
            String linea = lector2.readLine();
            while(linea != null){
                String[] campos = linea.split(";", -1);
                if(campos.length != 2){
                    throw new IllegalArgumentException("Datos incorrectos, porfavor revisen que esten bien, el registro numero "+ contador + " fallo al intentarse leer, este fue el registro que tiene errores: " + linea);    
                }
                System.out.println("Mi nombre es: " + campos[0]);
                System.out.println("Mi telefono es: " + campos[1]);
            
            linea = lector2.readLine();
            contador++;
            
        }
    }

    }

}