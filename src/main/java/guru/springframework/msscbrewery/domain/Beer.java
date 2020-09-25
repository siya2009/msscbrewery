package guru.springframework.msscbrewery.domain;

import java.sql.Timestamp;
import java.util.UUID;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
	private UUID id;
	private String beerName;
	private BeerStyleEnum beerStyle;
	private Long upc;
	
	private Timestamp createdDate;
	private Timestamp lastUpdateDate;
}
