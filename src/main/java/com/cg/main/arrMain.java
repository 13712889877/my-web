package com.cg.main;

public class arrMain{
    public static void main(String[] args){
        int[] arr=new int[]{8,2,1,0,3};
        int[] index=new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel="";
        for(int i:index){
            tel+=arr[i];
        }
        System.out.print(tel);
    }
}