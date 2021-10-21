package io.crscube.cuberun.chap24.ex1.config;

import io.crscube.cuberun.chap24.ex1.exception.RedoableException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectConfig {

	private int retryCount = 5;

	@Around("execution(* io.crscube.cuberun.chap24.ex1.user.mapper.*.*(..))")
	public Object redoMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		Object proceed = null;

		for (int r = 1; r <= retryCount; r++) {
			try {
				System.out.println("getUserName call count is [" + r + "]");
				proceed = joinPoint.proceed();
			} catch (RedoableException e) {

			}
		}

		return "Hello lee";
	}
}
