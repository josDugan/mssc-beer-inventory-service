package guru.springframework.common.events;

import guru.springframework.common.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = -1651796866494172221L;

    private BeerDto beerDto;

}
