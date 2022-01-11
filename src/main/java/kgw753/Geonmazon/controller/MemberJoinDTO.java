package kgw753.Geonmazon.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberJoinDTO {

    @NotEmpty private String name;
    @NotEmpty private String password;

    private String city;
    private String street;
    private String zipcode;
}
