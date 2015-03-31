package max;

import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.util.Scanner; 
public class Max { 
public static void readWords() { 
try { 
Scanner inFile = new Scanner(new FileReader("kp.txt")); 
int min=Integer.MAX_VALUE; 
int max = 0; 
int mean = 0; 
while (inFile.hasNextLine()) { 
Scanner inLine = new 
Scanner(inFile.nextLine()); 
while (inLine.hasNext()) { 
int num = Integer.parseInt(inLine.next().trim()); 
if(num > max) { 
max = num; 
} 
if(num < min){ 
min=num; 
} 
} 
} 
mean = (max+min)/2; 
System.out.println("max.............." + max); 
System.out.println("min.............." + min); 
System.out.println("mean.............." + mean); 
System.out.println(); 
} catch (FileNotFoundException ex) { 
ex.printStackTrace(); 
} 
} 
public static void main(String[] args) { 
readWords(); 
} 
} 
