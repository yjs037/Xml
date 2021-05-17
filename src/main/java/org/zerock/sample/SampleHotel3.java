package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@RequiredArgsConstructor // @NonNull이나 final이 붙은 인스턴스 변수에 대한 생성자를 만들어냄.
public class SampleHotel3 {
	
	@NonNull
	private Chef chef;

	
}
