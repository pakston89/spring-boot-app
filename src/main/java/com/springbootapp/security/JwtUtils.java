package com.springbootapp.security;

import com.springbootapp.model.Role;
import com.springbootapp.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class JwtUtils {

    public static String generateJwtToken(User user) {

        String secretKey = "47757575.jdidkycoslwn/kdejdjnd.dedlkdeldkedk95487848kl37dhjbws9jnxbeyowl";

        List<Role> roles = user.getRoles();
        String roleNames = "";

        for (Role role : roles) {
            roleNames = roleNames + role.getName() + "," ;
        }

        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList(roleNames);

        String token = Jwts.builder().setId("JWT").setSubject(user.getUserName()).
                claim("authorities", grantedAuthorities.stream().map(GrantedAuthority::getAuthority)
                        .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return token;
    }

}
