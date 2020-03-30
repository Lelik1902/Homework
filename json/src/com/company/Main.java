package com.company;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        FileReader fr = new FileReader("robocode.json");
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(fr);
        JSONArray teachers = (JSONArray) jsonObject.get("teachers");
        for (int i = 0; i < teachers.size(); i++) {
            JSONObject teacherItem = (JSONObject) teachers.get(i);
            System.out.print(teacherItem.get("name") + ": " + teacherItem.get("favorite language") + "\n");
        }
    }
}

    