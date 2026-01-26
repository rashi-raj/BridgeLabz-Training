package com.annotation.rolebasedaccesscontrol;

import java.lang.reflect.Method;

public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted");
    }

    public static void main(String[] args) throws Exception {
        String currentRole = "USER"; // try ADMIN

        Method m = AdminService.class.getMethod("deleteUser");
        RoleAllowed role = m.getAnnotation(RoleAllowed.class);

        if (role.value().equals(currentRole)) {
            m.invoke(new AdminService());
        } else {
            System.out.println("Access Denied!");
        }
    }
}
