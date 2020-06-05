package com.hiep.doan.services.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiep.doan.services.Entities.CommandUser;
import com.hiep.doan.services.EntitiesRequest.CommandUserReq;
import com.hiep.doan.services.Respon.CommandUserRes;
import com.hiep.doan.services.Services.UnitData.UttData;

@Service
public class CommandUserServices implements BaseServicesInterface<CommandUser, CommandUserReq, Integer> {
	@Autowired
	private CommandUserRes CommandUserRes;
	@Autowired
	private UttData uttData;

	@Override
	public CommandUser findById(Integer id) {
		if (CommandUserRes.findById(id).isPresent()) {
			return CommandUserRes.findById(id).get();
		} else {
			return null;
		}
	}

	@Override
	public List<CommandUser> getlist() {
		// TODO Auto-generated method stub
		return CommandUserRes.findAll();
	}

	@Override
	public void saveOrUpdate(CommandUser entity) {
		CommandUserRes.save(entity);
		uttData.flushSession();
	}

	@Override
	public void delete(CommandUser entity) {
		CommandUserRes.delete(entity);
	}

	@Override
	public boolean create(CommandUserReq entity) {
		// TODO Auto-generated method stub
		CommandUser commandUser = new CommandUser();
		commandUser.setCommand(entity.getCommand());
		commandUser.setNewsId(entity.getNewsId());
		commandUser.setUserId(entity.getUserId());
		CommandUserRes.save(commandUser);
		return true;
	}

}
