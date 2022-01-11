package kgw753.Geonmazon.model;

import org.springframework.security.core.GrantedAuthority;

public enum MemberLevel implements GrantedAuthority {
    ADMIN("ADMIN"),
    CUSTOMER("CUSTOMER");

    private String authority;

    private MemberLevel(String authority){
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
