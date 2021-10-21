package io.crscube.cuberun.chap24.ex2.user.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
	private long userKey;
	private String userName;
}
