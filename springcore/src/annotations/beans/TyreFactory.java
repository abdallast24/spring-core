package annotations.beans;

public class TyreFactory {
	public static Tyre getTyre(String tyreType) {
		if (tyreType.equalsIgnoreCase("michelin"))
			return new MichelinTyres();
		else if (tyreType.equalsIgnoreCase("bridgestron"))
			return new BridgeStronTyres();

		return null;
	}
}
