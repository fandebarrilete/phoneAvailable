package mobile.catalog.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Profile;

import mobile.catalog.model.Phone;

@Profile("prod")
//@Mapper
public interface PhoneMapper {

	List<Phone> selectPhoneCatalog();
}
