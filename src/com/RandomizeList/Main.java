package com.RandomizeList;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName;
        Vector<String> vec = new Vector<String>();
        Scanner in = new Scanner(System.in);
        fileName = in.nextLine();
        Scanner text = new Scanner(new FileReader(fileName));
        while (text.hasNextLine()) {
            vec.add(text.nextLine());
        }
        Random rand = new Random();
        Vector<String> randomizedText = new Vector<String>();
        while (vec.isEmpty()==false) {
            int randomNum = rand.nextInt(vec.size());
            Collections.sort(vec);
            randomizedText.add(vec.get(randomNum));
            vec.remove(randomNum);
        }
        for(int i=0; i<randomizedText.size();i++) {
            System.out.println(randomizedText.get(i));
        }
    }
}
