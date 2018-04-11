package JavaCool303;

import java.awt.Color;

public class PastelCool303Theme extends Cool303Theme{
	public PastelCool303Theme() {
		Color primary = Color.LIGHT_GRAY;
		Color secondary = Color.CYAN;
		primary = primary.darker();
		secondary = secondary.darker();
		this.setPrimaryColor(primary);
		this.setSecondaryColor(secondary);	
	}
}
