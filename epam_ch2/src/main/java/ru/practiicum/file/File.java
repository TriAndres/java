package ru.practiicum.file;

import ru.practiicum.number.model.Number;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File {

    public void setFile(String file, List<Number> list) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Number number : list) {
                bw.write(String.valueOf(number.getId()) + "/" + String.valueOf(number.getNum()) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Number> getFile(String file) {
        List<Number> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String s;
            while ((s = br.readLine()) != null) {
                String[] ss = s.split("/");
                list.add(new Number(Integer.parseInt(ss[0]),Integer.parseInt(ss[1])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
