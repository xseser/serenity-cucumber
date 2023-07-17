package com.idemia.sepDef;

import com.idemia.Book;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class DataTableStepDef {
    @Given("User has data")
    public void userHasData(List<Book> books) {
        for(Book book: books){
            System.out.println(book.toString());
        }
    }
    @Then("data was parsed")
    public void dataWasParsed() {
        // Write code here that turns the phrase above into concrete actions
    }

}
