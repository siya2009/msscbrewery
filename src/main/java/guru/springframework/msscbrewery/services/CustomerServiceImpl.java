package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerbyId(UUID customerId) {
		return CustomerDto.builder().customerId(UUID.randomUUID())
			  .name("Pratap")
			  .build();
	}

}
