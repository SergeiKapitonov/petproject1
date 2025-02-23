package models;

import lombok.Data;

@Data
public class AddUserResponse {
    private int code;
    private String type;
    private String message;

    public int getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public CharSequence getMessage() {
        return message;
    }
}