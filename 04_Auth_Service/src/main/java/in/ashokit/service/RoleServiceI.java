package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Role;

public interface RoleServiceI {
	 public Role acreateRole(Role role);
	 public Role deleteRoleById(Integer roleId);
	 public List<Role> getAllRoles();
	 public Role getRoleById(Integer roleId);
	 
	 
}
