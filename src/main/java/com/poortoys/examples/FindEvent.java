/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poortoys.examples;

/**
 *
 * @author dim
 * Класс для поиска и регистрации событий
 */
public class FindEvent {

    float[][] koeff= new float[2][3];
    float proffit=0;
    
    public FindEvent(float k11, float k11xk12, float k12, float k21, float k21xk22, float k22) {
        
        koeff[0][0] = k11;
        koeff[0][1] = k11xk12;
        koeff[0][2] = k12;
        
        koeff[1][0] = k21;
        koeff[1][1] = k21xk22;
        koeff[1][2] = k22;
    }
    
    
    
    
    private String bookm1stName;
    private String bookm2stName;
    
    private float k11;
    private float k12;
    private float k11xk12;
    
    private float k21;
    private float k22;
    private float k21xk22;
    
    //P = 1 / K1 + 1 / K2 + … + 1 / Kn, 
    //где Sp — вероятность в десятичной дроби, 
    //K1, K2, Kn — коэффициенты на выборы одного рынка, 
    //n – количество выборов на этом рынке.
    
    public float getProfit2x(){
        
        float win1b1 = 1/koeff[0][0];
        float win1b2 = 1/koeff[1][2];
        
        float win2b1 = 1/koeff[0][2];
        float win2b2 = 1/koeff[1][0];
        
        float doxod = (1/this.k11) + (1/this.k21);
        return 1-doxod;
    }
}
