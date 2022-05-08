
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migi
 */
public class Ejercicio_3 {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
       String base; 
       base = scn.nextLine();
       double based = Double.parseDouble(base);
       double radio = Math.pow(based,2);
       double nashe = Math.PI *radio; 
       System.out.println(nashe);
    }
}
