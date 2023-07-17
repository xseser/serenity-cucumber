package com.idemia.utilities;

import com.idemia.Book;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;

import java.util.Map;

public class ParameterTypes {

    @ParameterType("[Tt]ask|[pP]roject")
    public ItemType itemType(String type){
        return ItemType.valueOf(type.toUpperCase());
    }

    @DataTableType
    public Book bookEntry(Map<String, String> entry){
        return new Book(entry.get("title"), entry.get("author"));
    }
}
