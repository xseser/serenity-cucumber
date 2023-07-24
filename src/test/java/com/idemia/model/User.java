package com.idemia.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import java.time.LocalDate;

@Data
public class User {
    String name;
    String mail;
    String password;
    LocalDate birthDate;

    public User(String name, String mail, String password) {
        this.name = name;
        this.mail = mail;
        this.password = password;
    }

    public User(String name, String mail, String password, LocalDate birthDate) {
        this.name = "defaultName";
        this.mail = "default.mail@adress.com";
        this.password = "DefaultPassword123!";
        this.birthDate = "";
    }

    public JSONObject returnJsonObj(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", name);
        jsonObject.put("password", password);
        jsonObject.put("mail", mail);
        jsonObject.put("birthDate", birthDate);
        return jsonObject;
    }
}
