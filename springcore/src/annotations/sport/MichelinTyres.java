package annotations.sport;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyre {

	@Override
	public String rotate() {
		return "Michelin tyres";
	}

}
