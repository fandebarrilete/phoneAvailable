package mobile.catalog.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import mobile.catalog.model.Phone;
import mobile.catalog.service.PhoneService;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-07T08:38:48.647Z")

@Controller
public class PhonecatalogApiController implements PhonecatalogApi {

    private static final Logger log = LoggerFactory.getLogger(PhonecatalogApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private PhoneService phoneService;

    @org.springframework.beans.factory.annotation.Autowired
    public PhonecatalogApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Phone>> getPhoneCatalog() {
		try {
			return new ResponseEntity<List<Phone>>(phoneService.getCatalog(), HttpStatus.OK);
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			return new ResponseEntity<List<Phone>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
