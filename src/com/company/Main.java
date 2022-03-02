package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("text.txt")) {
            fileWriter.write("\nA a\nB b\nC c\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nM m\nN n\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z");
            fileWriter.write("\n");
            fileWriter.write("\n1 \n2 \n3 \n4 \n5 \n6 \n7 \n8 \n9 ");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileReader fileReader = new FileReader("text.txt")){
            Scanner sc = new Scanner(fileReader);

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        }
    }
