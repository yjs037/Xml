package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
public class SampleHotel1 {
	
	private Chef chef;
	
	//setter와 다르게 생성자 주입은 이러한 주입을 생성자를 통해서 처리.
	//기존의 스프링에서는 생성자 주입을 위해 생성자를 정의하고, @Autowired와 같은 어노테이션을 추가해야만 주입이 이루어 졌지만
	//스프링4.3이후에는 묵시적으로 생성자 주입이 가능해짐
	//@Autowired없이 처리되고 있다
	public SampleHotel1(Chef chef) {
		this.chef = chef;
	}

}
