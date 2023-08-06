package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("0123")) {
            authorities.add(Authorities.DELETE);
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.READ);
        } else if (user.equals("user") && password.equals("3210")) {
            authorities.add(Authorities.READ);
        }
        return authorities;
    }
}
