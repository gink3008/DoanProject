package com.hiep.doan.services.jwtServices;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

import com.hiep.doan.services.Entities.Roles;
import com.hiep.doan.services.Entities.UserRole;
import com.hiep.doan.services.Entities.Users;
import com.hiep.doan.services.Services.UsersServices;

public class JwtAuthenticationTokenFilter extends UsernamePasswordAuthenticationFilter {
    private final static String TOKEN_HEADER = "authorization";
    @Autowired
    private jwtService jwtService;
    @Autowired
    private UsersServices userService;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String authToken = httpRequest.getHeader(TOKEN_HEADER);
//        if (jwtService.validateTokenLogin(authToken)) {
//            String username = jwtService.getUsernameFromToken(authToken);
//            Users user = userService.findByUsername(username);
//            if (user != null) {
//                boolean enabled = true;
//                boolean accountNonExpired = true;
//                boolean credentialsNonExpired = true;
//                boolean accountNonLocked = true;
//                Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//                Set<UserRole> userRole = user.getListUserRoleEnitiys();
//                Set<Roles> roles = new HashSet<>();
//
//                for(UserRole userRoleEnitiy : userRole)
//                {
//                    roles.add(userRoleEnitiy.getRoleEntity());
//                }
//                for (Roles role : roles) {
//                    grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
//                    logger.info("grantauthor : " +  grantedAuthorities);
//                }
//                UserDetails userDetail = new User(username, user.getPassword(), enabled, accountNonExpired,
//                        credentialsNonExpired, accountNonLocked, grantedAuthorities);
//                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail,
//                        null, userDetail.getAuthorities());
//                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpRequest));
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//            }
//        }
//        chain.doFilter(request, response);
    }
}