package guru.springframework.msscbrewery.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;

@RestController
@RequestMapping("/app/v1/customer")
public class CustomerController {
	
	private final CustomerService customerService;

	

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}



	@GetMapping({"/{customerId}"})
	public ResponseEntity<CustomerDto> getCustomer(@Valid @PathVariable("customerId") UUID customerId)
	{
		return new ResponseEntity<>(customerService.getCustomerbyId(customerId), HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity handlePost(@Valid @RequestBody CustomerDto customerDto) {
		CustomerDto saveDto = customerService.saveNewCustomer(customerDto);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location","/app/v1/customer/"+ saveDto.getCustomerId().toString());
		
		return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
	}
	
	
	@PutMapping({"/{customerId}"})
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void handleUpdate(@PathVariable("customerId") UUID customerId,@Valid @RequestBody CustomerDto customerDto) {
		customerService.updateCustomer(customerId, customerDto);
	}

   
	@DeleteMapping({"/{customerId}"})
	public void deleteById(@PathVariable("customerId") UUID customerId) {
		customerService.deleteById(customerId);
	}
	
	


}


















