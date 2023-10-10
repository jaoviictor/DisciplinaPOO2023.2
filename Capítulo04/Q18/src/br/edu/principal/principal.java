package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor de X: ");
        double x = input.nextDouble();
        
        System.out.println("Digite o valor de Y: ");
        double y = input.nextDouble();
        
        System.out.println("Digite o valor de Z: ");
        double z = input.nextDouble();
        
        if (isTriangulo(x, y, z)) {
            if (x == y && y == z) {
                System.out.println("É um triângulo equilátero.");
            } else if (x == y || y == z || x == z) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }
        
        input.close();
    }
    
    public static boolean isTriangulo(double x, double y, double z) {
        return (x + y > z) && (x + z > y) && (y + z > x);
    }


	}


