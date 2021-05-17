package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//실행하는 역할
@RunWith(SpringJUnit4ClassRunner.class) 

// 어떤 설정정보를 읽어 들여야 하는지를 명시
// 어노테이션과 속성값인 문자열 설정 지정된 클래스나 문자열을 이용해 필요한 객체들을 스프링 내에 객체로 등록하게 된다
// @ContextConfiguration에서 사용하는 문자열은 classpath: 나 file:을 이용을해서 이클립스에서 자동으로 생성된 root-context.xml의 경로를 지정할 수 있다
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // classpath:root-context.xml
@Log4j
public class SampleTests {
	
		@Setter(onMethod_ = @Autowired)
		private Restaurant restaurant;
		 
		@Test
		public void testExist() {
			assertNotNull(restaurant); // 변수가 null이 아니면 테스트 성공
			
			log.info(restaurant);
			log.info("---------------------------------------");
			log.info(restaurant.getChef());
			
		}
		
	
}
