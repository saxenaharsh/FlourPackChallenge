
package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int sum = (bigCount * 5) + smallCount;
        if(sum >= goal){
            if(bigCount == goal){
                System.out.println("true");
                return true;
            }

        }else{
            if(goal % 5 <= smallCount){
                return true;
            }
        }
        return false;
    }
}
