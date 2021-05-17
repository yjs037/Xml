package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor // 생성자 자동주입과 Lombok을 결합하면 이렇게 변경 할 수 있다.
public class SampleHotel2 {
	
	private Chef chef;
	
	

}
