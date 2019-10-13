package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       // save_text(square(1000), "1000squares.txt");
        read_write();
    }

    public static void save_text(String text, String filename)
    {
        try(FileWriter writer = new FileWriter(filename, false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static String square(int n)
    {
        String result = "";
        for(int i = 0; i <= n; i++)
        {
            result = result + "Square of " + i + " is " + i*i + "\n";
        }
        return result;
    }

    public static void read_write()
    {
        String text = "";
        String file = "";
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER TEXT:");
        text = input.nextLine();
        input = new Scanner(System.in);
        System.out.println("\nENTER FILE NAME:");
        file = input.next();
        save_text(text, file);

    }
}
