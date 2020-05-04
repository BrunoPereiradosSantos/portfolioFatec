/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
public class ExemploMatrix{
    public static void main(String[] args) {
        int mat [][] = new int [3][2];
        int x, y,s=0;
        for (x = 0; x < 3; x++){
            for (y = 0; y < 2; y++){
                mat[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Valor: "));
                s = s + mat[x][y];
            }
        }
        System.out.println("O resultado é: " +s);
    }
}

