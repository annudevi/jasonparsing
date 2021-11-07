package com.json;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TestTest {
	
	@InjectMocks
	Test1 test1;

	@org.junit.jupiter.api.Test
	void test() {
		System.out.println(" test " + test1);
//		fail("Not yet implemented");
	}

}
