package io.crscube.cuberun.chap24.ex1.exception;

import org.springframework.core.NestedRuntimeException;

public class RedoableException extends NestedRuntimeException {
	public RedoableException(String msg) {
		super(msg);
	}
}