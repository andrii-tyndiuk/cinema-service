package spring.service.impl;

import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
import spring.dao.RoleDao;
import spring.model.Role;
import spring.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleDao.getRoleByName(roleName).orElseThrow(()
                -> new NoSuchElementException("Can't get role by role name " + roleName));
    }
}
