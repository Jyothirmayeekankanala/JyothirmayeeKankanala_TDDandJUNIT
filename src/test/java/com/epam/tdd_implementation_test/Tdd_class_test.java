package com.epam.tdd_implementation_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tdd_class_test {
	Tdd_Class my_Tdd_class_object;
	/*Remove ‘A’ if it is present in first 2 characters of the string.
	if ‘A’ is present after 2 characters, it should not be
	removed.
	1.“ABCD” => “BCD”
	2.“BACD” => “BCD”
	3.“AACD” => “CD”
	4.“AABAA” => “BAA”
	5.“BBAA” => “BBAA”
	*/
	@BeforeEach
	void setUp()
	{
		my_Tdd_class_object=new Tdd_Class();
	}
	@Test
	void test_string_with_4chars_1A_in1stposition() 
	{
		assertEquals("BCD",my_Tdd_class_object.remove_A("ABCD"));
	}
	@Test
	void test_string_with_4chars_1A_in2ndposition() 
	{
		assertEquals("BCD",my_Tdd_class_object.remove_A("BACD"));
	}
	@Test
	void test_string_with_4chars_2A() 
	{
		assertEquals("CD",my_Tdd_class_object.remove_A("AACD"));
	}
	@Test
	void test_string_with_nchars_2A() 
	{
		assertEquals("BAA",my_Tdd_class_object.remove_A("AABAA"));
	}
	@Test
	void test_string_with_4chars_0A() 
	{
		assertEquals("BBAA",my_Tdd_class_object.remove_A("BBAA"));
	}
	@Test
	void test_string_with_nchars_0A() 
	{
		assertEquals("BCVBA",my_Tdd_class_object.remove_A("BCVBA"));
	}
}
