package com.vincent_kelleher.party_manager.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "room")
public class Room
{
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String name;

    public Room()
    {
    }

    public Room(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
