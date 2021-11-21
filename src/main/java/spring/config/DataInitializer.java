package spring.config;

import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import spring.model.Role;
import spring.model.Role.RoleName;
import spring.model.User;
import spring.service.AuthenticationService;
import spring.service.RoleService;
import spring.service.UserService;

@Component
public class DataInitializer {
    private RoleService roleService;
    private UserService userService;
    private AuthenticationService authenticationService;

    public DataInitializer(RoleService roleService,
                           UserService userService,
                           AuthenticationService authenticationService) {
        this.roleService = roleService;
        this.userService = userService;
        this.authenticationService = authenticationService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setName(RoleName.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin123");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
        authenticationService.register("user@gmail.com", "user123");
    }
}
