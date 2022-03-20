package com.Harman.program2;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class read {
        public static void main(String[] args) {
            try {
                int countA=0,countE=0,countI=0,countO=0,countU=0,cConsonant=0;
                File fr = new File("Data.txt");
                Scanner input = new Scanner(fr);
                String data = null;
                while (input.hasNextLine()) {
                    data = input.nextLine();
                }
                for (int i=0;i<data.length();i++){
                    if(data.charAt(i) == 'A'){
                        countA++;
                    }
                    else  if(data.charAt(i) == 'E'){
                        countE++;
                    }
                    else  if(data.charAt(i) == 'I'){
                        countI++;
                    }
                    else if(data.charAt(i) == 'O'){
                        countO++;
                    }
                    else  if(data.charAt(i) == 'U'){
                        countU++;
                    }
                    else {
                        continue;
                    }
                }
                System.out.println("FileContents: "+data);
                System.out.println("A: \t\t\t\t"+countA);
                System.out.println("E: \t\t\t\t"+countE);
                System.out.println("I: \t\t\t\t"+countI);
                System.out.println("O: \t\t\t\t"+countO);
                System.out.println("U: \t\t\t\t"+countU);
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }



