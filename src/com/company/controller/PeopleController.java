package com.company.controller;

import com.company.commons.constants.FileConstants;
import com.company.model.People;
import com.company.service.JsonParser;
import com.company.service.impl.JsonParserGson;

import java.util.LinkedList;
import java.util.List;


public class PeopleController {

    List<People> peopleList = new LinkedList<>();

    public void generateData() {
        People people = new People(
                "Karen",
                "Darbinyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Alexandr",
                "Hamabrdzumyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Hasmik",
                "Gevorgyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Lusine",
                "Yeremyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Anahit",
                "Khechumyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);
    }
    public void writeInFileWithJson() {
        JsonParser jp = new JsonParserGson();
        jp.parseToJsonAndWriteInFile(peopleList.toArray(new People[0]));
        System.out.println("everything is OKAY, you are god Narek");
    }
    private void readFromFileAsJason() {
        // read json data from the file
        //json to people list, parse with our just writed service class, with some changes
    }

    private List<People> readFromFileAsObjectList() {
        // read json data from the file
        //json to people list, parse with our just writed service class, with some changes
        return null;
    }

}
