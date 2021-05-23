package com.xdclass.springboot.xdclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {
    private String name;
    private String age;
    private String sex;
    private String nickname;

    public static void main(String[] args) {
        String data = "{\"name\": \"zhang\",\"sex\": \"gender\",\"age\": 12,\"nickname\": \"tu\"}";
        //language=MySQL
//        String msf = "select * from dtmapp t where 1=1";
    }
}
