package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;


// 스프링에서 객체로 만들어서 관리하는 대상임을 명시
// @Component가 있는 클래스를 스프링이 읽어 주도록 ComponentScan을 통해 지정되어 있으므로
// 해당 패키지에 있는 클래스들을 조사하면서 @Component가 존재하는 클래스들을 객체로 생성해 빈으로 관리하게된다
@Component
@Data // toString, EqualsAndHashCode, Getter/Setter, RequiredArgsContructor를 결합한 형태
public class Chef {
	
}
