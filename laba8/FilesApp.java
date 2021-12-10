package ru.mirea.laba8;

import java.io.*;
import  java.util.Scanner;
public class FilesApp {
    public static void main(String[] args) {
        try(FileWriter writer = new
                FileWriter("C:\\Users\\Silivanov\\IdeaProjects\\Java\\src\\ru\\mirea\\laba8\\javaTest.txt", false))
        {

            Scanner read = new Scanner(System.in);
            // запись всей строки
            String text = read.nextLine();
            writer.write(text);
            // запись по символам

            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

