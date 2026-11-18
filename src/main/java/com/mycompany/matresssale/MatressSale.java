/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matresssale;
import java.util .Scanner;

/**
 *
 * @author Student
 */
public class MatressSale {
            

    public static void main(String[] args) {
                    
Scanner input =new Scanner (System.in);

        
      String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
int[][] sales = new int[3][3];

int totalSales = 0;
int highestSale = 0;
String popularProduct = "";

for(int row = 0; row < products.length; row++){
for(int col = 0; col < sales[row].length; col++){
System.out.print("Enter number of sales for month " + (col + 1) + " for "+ products[row]+ ": ");

sales[row][col] = input.nextInt();
totalSales += sales[row][col];
if(sales[row][col] > highestSale)
 {
highestSale = sales[row][col];
 popularProduct = products[row];
 }
}
System.out.println();
}
int averageSales = totalSales / 9;
 System.out.println();
 System.out.println("PRODUCT SALES REPORT - 2026");
 System.out.println();
System.out.println("****************************************");
 System.out.println("TOTAL PRODUCT SALES: " + totalSales);
 System.out.println("AVERAGE PRODUCT SALES: " + averageSales);
System.out.println("MOST POPULAR PRODUCT: " + popularProduct + "(" + highestSale + ")");
}
}
    

