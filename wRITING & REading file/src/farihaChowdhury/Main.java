package farihaChowdhury;

import java.io.BufferedReader;
import java.io.*;

import static java.io.BufferedWriter.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("input.text"));
            bw.write("Hello ");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedReader br = new BufferedReader(new FileReader("output.text"));
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}