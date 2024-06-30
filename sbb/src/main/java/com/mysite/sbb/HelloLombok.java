package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // 해당 속성을 args로 받는 생성자가 자동 생성됨 (final 변수 한정)
// => setter는 의미가 없어지고, setter method도 사용 불가 
@Getter
public class HelloLombok {
	private final String hello;
	private final int lombok;
	
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("헬로", 5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
		
		
	}
}
