package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.control.PermissionRepository;
import group.msg.at.cloud.cloudtrain.core.entity.GrantedPermission;
import group.msg.at.cloud.cloudtrain.core.entity.Permission;
import jakarta.validation.constraints.NotNull;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple {@code Boundary} that manages {@code GrantedPermission} entities.
 */
@Service
@Secured("CLOUDTRAIN_USER")
public class GrantedPermissionManager {

    private final PermissionRepository repository;

    public GrantedPermissionManager(@NotNull PermissionRepository repository) {
        this.repository = repository;
    }

    public List<GrantedPermission> getGrantedPermissionsByCurrentUser() {
        List<GrantedPermission> result = new ArrayList<>();
        List<Permission> permissions = repository.getPermissionsByUser(SecurityContextHolder.getContext().getAuthentication().getName());
        permissions.forEach(p -> result.add(new GrantedPermission(p)));
        return result;
    }
}
