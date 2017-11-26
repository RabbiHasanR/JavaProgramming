package me.practise.constructor;

public class Platypus {
	 String name;
     Platypus(String input) {
             name = input;
             System.out.println(input);
     }
     Platypus() {
             this("John/Mary Doe");
             //System.out.println("Rabbi");
     }

}
