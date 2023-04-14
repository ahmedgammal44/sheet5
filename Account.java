/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication81;

/**
 *
 * @author King
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private int datacreated;
    Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public void getId(int x){
        id=x;
    }
    public void getBalance(int y){
        balance=y;
    }
    public void getAnnualInterestRate(double z){
    annualInterestRate=z;
}
    public void datacreated(){
        System.out.println("id="+id);
        System.out.println("balance="+balance);
        System.out.println("annualInterestRate="+annualInterestRate);
    }
    public double withdraw(int a){
        int q=0;
        if(balance>a){
        double t=balance-a;
        return t;
        }
        else
            return q;
        
    }
    public double deposite(int b){
        double t=balance+b;
        return t;
    }
}
