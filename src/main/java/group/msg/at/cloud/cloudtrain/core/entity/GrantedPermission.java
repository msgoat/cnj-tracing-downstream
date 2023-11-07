package group.msg.at.cloud.cloudtrain.core.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

public class GrantedPermission {

    private final String permission;

    public GrantedPermission(Permission permission) {
        this.permission = permission.getPermissionName();
    }

    /**
     * Special constructor for JSON binding only.
     *
     * @param permission permission name
     */
    @JsonCreator
    GrantedPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
