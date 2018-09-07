package me.manage.pro.managepro.project.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private int Id;
    private String UserName;
    private String PassWord;
    private String PhoneNum;


}
