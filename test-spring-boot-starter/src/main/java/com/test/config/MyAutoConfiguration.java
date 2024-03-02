package com.test.config;

import com.test.pojo.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author :Huang Bao Lian
 * @date : 2024/3/2
 * --热拔插支持
 * @ConditionalOnXX
 */
@Configuration
@ConditionalOnBean(ConfigMarker.class)//热拔插支持
public class MyAutoConfiguration {
	static {
		System.out.println("MyAutoConfiguration init....");
	}
	@Bean
	public SimpleBean simpleBean(){
		return new SimpleBean();
	}
}
