package dev.supersoft.wms_app.repositories;

import dev.supersoft.wms_app.entities.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<UserRole, Integer> {

    UserRole findOneByAuthority(String authority);
}
