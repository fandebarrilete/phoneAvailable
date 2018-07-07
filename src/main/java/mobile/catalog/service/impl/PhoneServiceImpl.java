package mobile.catalog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mobile.catalog.mapper.PhoneMapper;
import mobile.catalog.mapper.PhoneMapperDummy;
import mobile.catalog.model.Phone;
import mobile.catalog.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	private PhoneMapper phoneMapperDummy;

	@Override public List<Phone> getCatalog() {
		return phoneMapperDummy.selectPhoneCatalog();
	}
}
