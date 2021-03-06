package br.com.six2six.fixturefactory.function;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.six2six.bfgex.Gender;
import br.com.six2six.fixturefactory.function.impl.NameFunction;
import br.com.six2six.fixturefactory.function.impl.NameFunction.NameType;

public class NameFunctionTest {

	@Test
	public void generateAnyName() {
		String value = new NameFunction().generateValue();
		assertNotNull("Generated full name can not be null", value);
	}
	
	@Test
	public void generateMaleName() {
		String value = new NameFunction(Gender.MALE).generateValue();
		assertNotNull("Generated male name can not be null", value);
	}

	@Test
	public void generateAnyFirstName() {
		String value = new NameFunction(NameType.FIRST).generateValue();
		assertNotNull("Generated first name can not be null", value);
	}

	@Test
	public void generateFemaleFirstName() {
		String value = new NameFunction(NameType.FIRST, Gender.FEMALE).generateValue();
		assertNotNull("Generated female first name can not be null", value);
	}

	@Test
	public void generateLastName() {
		String value = new NameFunction(NameType.LAST).generateValue();
		assertNotNull("Generated last name can not be null", value);
	}
	
}
