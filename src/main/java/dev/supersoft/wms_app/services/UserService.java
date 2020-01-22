package dev.supersoft.wms_app.services;

import dev.supersoft.wms_app.models.RegistrationModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void register(RegistrationModel registrationModel);
}
