package guru.springframework.msscbrewery.web.mapper;

import org.mapstruct.Mapper;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;

@Mapper(uses = DateMapper.class)
public interface CustomerMapper {

	 CustomerDto customerToCustomerDto(Customer customer);
	 Customer customerDtoToCustomer(CustomerDto dto);
}
