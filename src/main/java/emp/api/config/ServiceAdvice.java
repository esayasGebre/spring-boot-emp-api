package emp.api.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import emp.api.service.EmployeeService;

@Component
@Aspect
public class ServiceAdvice {

	Logger log = LogManager.getLogger(EmployeeService.class);

	@Around("execution(* emp.api..*(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			log.info("Input Parameter: " + arg);
		}

		Object result = joinPoint.proceed();
		log.info("Out from: ", joinPoint.getTarget().getClass());
		
		
		return result;
	}

}