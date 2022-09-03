
package tallerrepasofull;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class TallerRepasoFull {

    public static void main(String[] args) {
        menu();
    }
    
    //Menu
    public static void menu() {
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione ejercicio: "
                    + "\n 1 =  Ejercicio 1 \n 2 =  Ejercicio 2 \n 3 =  Ejercicio 3 \n 4 =  Ejercicio 4 "
                    + "\n 5 =  Ejercicio 5 \n 6 =  Ejercicio 6 \n 7 =  Ejercicio 7 \n 8 =  Ejercicio 8 "
                    + "\n 9 =  Ejercicio 9 \n 10 =  Ejercicio 10 "));
            switch(opcion){
                case 1: ejercicio1();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                case 2: ejercicio2();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                case 3: ejercicio3();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                case 4: ejercicio4();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                case 5: ejercicio5();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                case 6: ejercicio6();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                case 7: ejercicio7();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                case 8: ejercicio8();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                case 9: ejercicio9();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                case 10: ejercicio10();
                        System.out.println("Fin del ejercicio seleccione uno nuevo");
                    break;
                default: System.out.println("No habian mas ejercicios :) ");
            }  
        }while(opcion!=0);
    }
    
    //Ejercicio 1
    public static void ejercicio1() {
        float resul;
        float a = (float)5/2;
        resul = 2*(3+a)/(3+5-6*2);
        
        System.out.println("El resultado es : "+ resul);
    }
    
    //Ejercicio 2
    public static void ejercicio2() {
        Scanner music = new Scanner(System.in);
        System.out.println("Elija la nota musical");
        int numNota = music.nextInt();
        switch(numNota){
            case 1: System.out.println("Do");
                break;
            case 2: System.out.println("Re");
                break;
            case 3 : System.out.println("Mi");
                break;
            case 4 : System.out.println("Fa");
                break;
            case 5 : System.out.println("Sol");
                break;
            case 6 : System.out.println("La");
                break;
            case 7 : System.out.println("Si");
                break;
            default: System.out.println("El numero seleccionado no es una nota");
        }
    }
    
    //Ejercicio 3
    public static void ejercicio3() {
        Scanner numero = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = numero.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(""+i);
        }
    }
    
    //Ejercicio 4
    public static void ejercicio4() {
        int cantPosi = 0, sumaPosi = 0;
        int cantNega = 0, sumaNega = 0;
        int cantCero = 0;
        
        for (int i = 0; i < 20; i++) {
            Scanner call = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int num = call.nextInt();
            if(num > 0){
                cantPosi = cantPosi + 1;
                sumaPosi = sumaPosi + num;
            }else{
                if(num <0){
                    cantNega = cantNega + 1;
                    sumaNega = sumaNega + num;
                }else
                    cantCero = cantCero + 1;
            }
        }
        float mediPosi = (float)sumaPosi/cantPosi;
        float mediNega = (float)sumaNega/cantNega;
        
        System.out.println("cantidad total positivos = "+cantPosi);
        System.out.println("Media positivos = "+mediPosi);
        System.out.println("Cantidad total negativos = "+cantNega);
        System.out.println("Media negativos = "+mediNega);
        System.out.println("Cantidad ceros = "+cantCero);
    }
    
    //Ejercicio 5
    public static void ejercicio5() {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
        for (int i = 0; i <= x; i += 3) {
            System.out.println(""+i);
        }
    }
    
    //Ejercicio 6
    public static void ejercicio6() {
        int numPaOrImp = Integer.parseInt(JOptionPane.showInputDialog("Insertar numero"));
        int calMod;
        calMod = numPaOrImp % 2;
        if(calMod == 0)
            System.out.println("El numero es = par");
        else
            System.out.println("El nuemro es = impar");
    }
    
    //Ejercicio 7
    public static void ejercicio7() {
        int fibo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        int a = 0;
        int b = 1;
        int sumFi = 1;
        System.out.println(""+a);
        
        while(sumFi <= fibo){
            System.out.println(""+sumFi);
            sumFi = a + b;
            a = b;
            b = sumFi;
        }
    }
    
    //Ejercicio 8
    public static void ejercicio8() {
        int clave = 24;
        //int intento = Integer.parseInt(JOptionPane.showInputDialog("Digite la contraseña"));
        for (int i = 0; i < 3; i++) {
            int intento = Integer.parseInt(JOptionPane.showInputDialog("Digite la contraseña"));
            if(intento == clave)
                System.out.println("Acceso Permitido");
            else{
                if(i < 2)
                    System.out.println("Acceso Denegado");
                else{
                    System.out.println("Acceso Denegado");
                    System.out.println("Clave Bloqueada");
                }
            }
        }
    }
   
    //Ejercicio 9
    public static void ejercicio9() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero"));
        int valorMod = num % 2;
        if(valorMod == 0){
            for (int i = 0; i <= num; i += 2) {
                System.out.println(""+i);
            }
        }else{
            for (int j = 1; j <= num; j += 2) {
                System.out.println(""+j);
            }
        }
    }
    
    //Ejercicio 10
    public static void ejercicio10() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        float e=1, div, facto=1;
        for (int n = 1; n <= a; n++) {
            facto = facto * n;
            div = 1 / facto;
            e = e + div;
        }
        System.out.println("La aproximacion del numero euler es = "+e); 
    }
    
}
