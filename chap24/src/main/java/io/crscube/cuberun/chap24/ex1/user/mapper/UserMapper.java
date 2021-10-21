package io.crscube.cuberun.chap24.ex1.user.mapper;

import io.crscube.cuberun.chap24.ex1.exception.RedoableException;

public class UserMapper {
	public String getUserName() {
		throw new RedoableException("redo getUserName()");
	}
}
