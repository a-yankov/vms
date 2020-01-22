package dev.supersoft.wms_app.services;

import dev.supersoft.wms_app.entities.UserRole;
import dev.supersoft.wms_app.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl {
    @Autowired
    RoleRepository roleRepository;

    public UserRole findRoleByName(String name){
        return this.roleRepository.findOneByAuthority(name);
    }
}
