/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author abdir
 */
public class Assignment4Q9 {
    
    public static void main(String[]arg){
        int start= 20;
        int end =25;
        int sum =0;
        int currentNumber =start;
        
        do{
            sum+=currentNumber;
            currentNumber++;
            }while(currentNumber <= end);
        
            System.out.println("The sum of numbers between" +start +"and" +end+ "is:" +sum);
            
        }
    }