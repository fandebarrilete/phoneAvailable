package mobile.catalog.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import mobile.catalog.model.Phone;

//@Configuration
//@EnableConfigurationProperties
//@PropertySource("classpath:phonecatalog.yml")
//@ConfigurationProperties
public class YamlCatalog {

	PhoneYaml phone;

	public PhoneYaml getPhone() {
		return phone;
	}

	public void setPhone(PhoneYaml phone) {
		this.phone = phone;
	}

	public class PhoneYaml{
		private String id;
		private String name;
		private String price;
		private String description;

		@Override public String toString() {
			return "PhoneYaml{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", price='" + price + '\''
					+ ", description='" + description + '\'' + '}';
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}
}
