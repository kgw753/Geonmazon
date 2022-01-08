package kgw753.Geonmazon.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String password;
    @Embedded
    private Address address;

    private MemberLevel memberLevel; // [ADMIN, CUSTOMER]

}
