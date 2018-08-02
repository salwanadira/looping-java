/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08;
import java.util.Scanner;
public class Contoh2 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Masukkan n");
        int x;
        int n;
        
        //PERULANGAN FOR
        for(x = 1; x <= n; x++)
        {
            System.out.print(x + " ");
        }
        
        //PERULANGAN WHILE
        x = 1;
        while(x <= n)
        {
            System.out.println(x + " ");
            x++;
        
        //PERULANGAN DO WHILE
        x = 1;
        do
        { 
            System.out.print(x + " ");
            x++;
        }
        while(x <= n);
        }
    }
}
