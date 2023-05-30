package Rough;

public class Dispatcher {
	/**
	 * 
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
		xmlns:context="http://www.springframework.org/schema/context"
		xmlns:mvc="http://www.springframework.org/schema/mvc"
		xsi:schemaLocation="
			http://www.springframework.org/schema/beans
	    	http://www.springframework.org/schema/beans/spring-beans.xsd
	    	http://www.springframework.org/schema/context
	    	http://www.springframework.org/schema/context/spring-context.xsd
	    	http://www.springframework.org/schema/mvc
	        http://www.springframework.org/schema/mvc/spring-mvc.xsd">

		<!-- Step 3: Add support for component scanning -->
		<context:component-scan base-package="Mvc02" />

		<!-- Step 4: Add support for conversion, formatting and validation support -->
		<mvc:annotation-driven/>

		<!-- Step 5: Define Spring MVC view resolver -->
		<bean
			class="org.springframework.web.servlet.view.InternalResourceViewResolver">
			<property name="prefix" value="/WEB-INF/" />
			<property name="suffix" value=".jsp" />
		</bean>

	</beans>
	
	
	
	
	 */

}
