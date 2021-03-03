package com.cos.myiocdi;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
//@Component //IoC
//런타임때 ioc컨테이너에 등록이 됨
//@Configuration //IoC
//@Service
//@Repository
public class Robot {
	
	private String name="건담z";

//	public String getName() {
//		return name;
//	}

}
