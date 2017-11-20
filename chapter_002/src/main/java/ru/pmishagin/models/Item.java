package ru.pmishagin.models;

/**
 * Created by Home on 06.11.2017.
 */
public class Item {

    private String id; //////////Это уникальный номер для заявки не имеет отношения к индексу массива!!!!/////////
    public String name;///Имя заявки///
    public String description;///Описание заявки////
    public long create;



    public Item(){


    }

    public Item(String name,String description, long create){

        this.name = name;
        this.create = create;
        this.description = description;

    }
    ////////////////Гетеры и Сетеры для id//////////////

    public String getId(){

        return this.id;
    }

    public String setId(String id){

        this.id = id;

        return id;
    }


    public String getName(){

        return name;

    }
    public String getDescription(){

        return  description;


    }
    public long getCreate(){

        return create;
    }

}
