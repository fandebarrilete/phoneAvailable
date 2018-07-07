package mobile.catalog.mapper;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import mobile.catalog.model.Phone;

@Profile("dev")
@Service
public class PhoneMapperDummy implements PhoneMapper {

	public List<Phone> selectPhoneCatalog() {
		Phone phone = new Phone();
		phone.setId(1l);
		phone.setName("iphone");
		phone.setPrice(1000.59);
		phone.setDescription("iphone");
		phone.setImagePath("/photo.jpg");
		Phone phone2 = new Phone();
		phone2.setId(2l);
		phone2.setName("samsung");
		phone2.setPrice(800.59);
		phone2.setDescription("galaxy note");
		phone2.setImagePath("/photo2.jpg");
		Phone phone3 = new Phone();
		phone3.setId(3l);
		phone3.setName("zte");
		phone3.setPrice(59.59);
		phone3.setDescription("cheapest");
		phone3.setImagePath("/photo3.jpg");
		
		return Arrays.asList(phone, phone2, phone3);
	}
}
