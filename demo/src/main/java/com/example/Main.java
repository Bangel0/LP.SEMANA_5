package com.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);
        

//         int[] number = {1, 2, 3, 4, 5};
//         int[] number2 = {1, 6, 3, 4, 5};

//         int x = number[0];
//         number[0] = number[4];             
//         number[4] = x;

//         boolean z = Arrays.equals(number, number2);            

//         Arrays.sort(number);
//         int n = number[number.length - 1];                            
//         System.out.println("Elemento máximo " + number[number.length - 1]);

//         int m = number[0];                                          
//         int q = number[0];
//         int w = number[1];                               
//         int e = number[2];
//         int r = number[3];
//         int t = number[4];
//         int sum = q + w + e + r + t;

//         int sum2 = sum / number.length;                     

//         int contador1 = 0;

//         if (q % 2 == 0) {
//             contador1 += 1;
//         }
//         if (w % 2 == 0) {
//             contador1++;
//         }          
//         if (e % 2 == 0) {
//             contador1++;
//         }
//         if (r % 2 == 0) {
//             contador1++;
//         }
//         if (t % 2 == 0) {
//             contador1++;
//         }

//         int contador2 = 0;
//         if (q % 2 != 0) {
//             contador2++;
//         }
//         if (w % 2 != 0) {
//             contador2++;
//         }                     
//         if (e % 2 != 0) {
//             contador2++;
//         }
//         if (r % 2 != 0) {
//             contador2++;
//         }
//         if (t % 2 != 0) {
//             contador2++;
//         }

//         System.out.println("ingrese elemnto a buscar en el array -->");
//         int l = input.nextInt();
//         Arrays.binarySearch(number, l);     

//         int[] arrayInvertido = new int[5];    
//         arrayInvertido[0] = number[4];
//         arrayInvertido[1] = number[3];                    
//         arrayInvertido[2] = number[2];
//         arrayInvertido[3] = number[1];
//         arrayInvertido[4] = number[0];

//         System.out.println(Arrays.toString(arrayInvertido));
//     }
// }



        //arraylist...!
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
            list.add("Primero");                        
            list.add("Hola");                        
        list.add("Libro");                    
        list.add("Libro");                    
        list.add("Libro");                    
        list.add("Libro");
        list.add("Libro");    
        int h = list.size();
        list.remove(h-1);                              
        list.remove(0);                      
        int x = list.size();
        list.get(x-1);                            
        list.get(0);                         
        boolean r = list.isEmpty();                        
        int a =list.size();                
        System.out.println("ingrese el valor a verificar");
        String c= input.nextLine();                  
        boolean m = list.contains(c);                                             
        System.out.println("Ingrese el valor del que quiere obtener el indice");
        String v = input.nextLine();
        list.indexOf(v);                   
        input.close();
    }
}
