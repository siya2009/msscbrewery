package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerService {
CustomerDto getCustomerbyId(UUID customerId);

CustomerDto saveNewCustomer(CustomerDto customerDto);

void updateCustomer(UUID customerId, CustomerDto customerDto);

void deleteById(UUID customerId);
}
