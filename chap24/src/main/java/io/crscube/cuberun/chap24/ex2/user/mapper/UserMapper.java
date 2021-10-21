package io.crscube.cuberun.chap24.ex2.user.mapper;

import io.crscube.cuberun.chap24.ex2.annotation.ExecutionLog;

public class UserMapper {
	@ExecutionLog
	public String retrieveUser() {
		return "retrieveUser";
	}
}
