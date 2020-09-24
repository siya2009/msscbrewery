package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerbyId(UUID customerId) {
		return CustomerDto.builder().customerId(UUID.randomUUID())
			  .name("Pratap")
			  .build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		return CustomerDto.builder()
			   .customerId(UUID.randomUUID())
			   .build();
		
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		// todo impl service
		log.debug("updating the customer***********");
	}

	@Override
	public void deleteById(UUID customerId) {
		//Todo impl service
		log.debug("Deleting the customer***********");
	}

}
