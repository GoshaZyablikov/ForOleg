package com.rw.orderbuilder.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rw.orderbuilder.Model.postgres.PersonnelModel;
import lombok.Data;

@Data
public class PersonnelDataDTO {
    @JsonProperty("personnelId")
    private Integer personnelId;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("post")
    private String post;

    @JsonProperty("TypeRoom")
    private String typeRoom;

    @JsonProperty("Type")
    private String type;

    public PersonnelDataDTO(PersonnelModel p) {
        this.personnelId = p.getPersonnelId();
        this.firstName = p.getFirstName();
        this.lastName = p.getLastName();
        this.sex = p.getSex();
        this.phone = p.getPhone();
        this.post = p.getPost();
        this.typeRoom = p.getTypeRoom();
        this.type = p.getType();
    }
}