package mobile.catalog.service.impl;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import mobile.catalog.mapper.PhoneMapper;
import mobile.catalog.model.Phone;

@RunWith(MockitoJUnitRunner.class)
public class TestPhoneServiceImpl {

	@InjectMocks
	private PhoneServiceImpl phoneService;

	@Mock	private PhoneMapper phoneMapper;

	@Test
	public void testService() {
		Mockito.when(phoneMapper.selectPhoneCatalog()).thenReturn(getDataResultExpected());


		List<Phone> testList = phoneService.getCatalog();
		Assert.assertEquals(testList.size(), 3);
	}

	private List<Phone> getDataResultExpected() {
		return Arrays.asList(new Phone(), new Phone(), new Phone());
	}
}
