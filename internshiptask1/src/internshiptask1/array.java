package internshiptask1;

import java.util.ArrayList;


public class array {
	
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>(2);
		
       ArrayList<String> a1 = new ArrayList<String>();
       a1.add("1");
       a1.add("siri");
       a1.add("pune");
       list.add(a1);
       
       ArrayList<String> a2 = new ArrayList<String>();
       a2.add("2");
       a2.add("anu");
       a2.add("pune");
       list.add(a2);
       
       
       for (int i = 0; i < list.size(); i++) {
           for (int j = 0; j < list.get(i).size(); j++) {
        	   if (j==1) {
               char s=list.get(i).get(j).charAt(0);
               if(s=='a'){   System.out.println(list.get(i));     }}
        	   
       System.out.println();
		
       }}

       }}
