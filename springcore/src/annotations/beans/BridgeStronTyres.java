package annotations.beans;

import org.springframework.stereotype.Component;

@Component
public class BridgeStronTyres implements Tyre {

	@Override
	public String rotate() {
		return "Bridge stone tyres";
	}

}
