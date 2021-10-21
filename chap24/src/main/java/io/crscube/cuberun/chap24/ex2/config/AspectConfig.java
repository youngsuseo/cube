package io.crscube.cuberun.chap24.ex2.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectConfig {

	private int retryCount = 5;

	@Around("@annotation(io.crscube.cuberun.chap24.ex2.annotation.ExecutionLog)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();

		Object proceed = joinPoint.proceed();

		long executionTime = System.currentTimeMillis() - start;

		System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
		return proceed;
	}
}
