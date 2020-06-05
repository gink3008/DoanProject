package com.hiep.doan.services.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiep.doan.services.Entities.Roles;
import com.hiep.doan.services.Entities.UserRole;
import com.hiep.doan.services.Entities.Users;
import com.hiep.doan.services.EntitiesRequest.UsersReq;
import com.hiep.doan.services.Respon.UserRoleRes;
import com.hiep.doan.services.Respon.UsersRes;
import com.hiep.doan.services.Services.UnitData.UttData;

@Service
public class UsersServices implements BaseServicesInterface<Users, UsersReq, Integer> {
	@Autowired
	private UsersRes UsersRes;
	@Autowired
	private UttData uttData;
	@Autowired
	private UserRoleRes userRoleRes;
	@Override
	public Users findById(Integer id) {
		if (UsersRes.findById(id).isPresent()) {
			return UsersRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<Users> getlist() {
		// TODO Auto-generated method stub
		return UsersRes.findAll();
	}

	@Override
	public void saveOrUpdate(Users entity) {
		UsersRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(Users entity) {
		UsersRes.delete(entity);
	}
	public Boolean createNewUser(UsersReq userRequest) {
//		List<Users> listuser ;
//		listuser = getlist();
//		if(listuser != null)
//		{
//			for (Users user : listuser) {
//				if (user.getUsername().equals(userRequest.getUsername())
//						&& user.getPasswords().equals(userRequest.getPassword())) {
//					return false;
//				}
//			}
//		}
		
		Users users = new Users();
		users.setUsername(userRequest.getUsername());
		users.setPasswords(userRequest.getPassword());
		saveOrUpdate(users);
		return true;
	}
	
	public Boolean updateByID(int id, String username, String password) {
		Optional<Users> byId = UsersRes.findById(id);
		if (UsersRes.existsById(id)) {
			Users users = byId.get();
			users.setUsername(username);
			users.setPasswords(password);
			saveOrUpdate(users);
			return true;
		}
		return false;

	}

	public Boolean checkLogin(UsersReq userRequest) {
		List<Users> usersList = getlist();

		for (Users user : usersList) {
			System.out.println(user);
			if (user.getUsername().equals(userRequest.getUsername())
					&& user.getPasswords().equals(userRequest.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	 public Users findByUsername(String username) {
	        for (Users user : getlist()) {
	            if (user.getUsername().equals(username)) {
	                return user;
	            }
	        }
	        return null;
	    }
	 public List<Roles> getListRoles (Users entities)
	 {
		 List<Roles> RolesOfUser;
		 Users users = findById(entities.getUserId());
		 for(UserRole userRole :  userRoleRes.findAll())
		 {
			 if(userRole.getUserId() == users.getUserId())
			 {
				 //chua hoan thanh
			 }
		 }
		 
		 return null;
	 }

	@Override
	public boolean create(UsersReq entity) {
		// TODO Auto-generated method stub
		for (Users user : getlist()) {
            if (user.getUsername().equals(entity.getUsername()) && user.getPasswords().equals(entity.getPassword())) {
                return false;
            }
        }
		Users users = new Users();
        users.setUsername(entity.getUsername());
        users.setPasswords(entity.getPassword());
        UsersRes.save(users);
        return true;
	}
}


