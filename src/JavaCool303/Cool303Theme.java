package JavaCool303;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.border.Border;

public class Cool303Theme {

	private Color primaryColor;
	private Color secondaryColor;
	private Font primaryFont;
	private Font secondaryFont;
	private boolean showBorder;
	
	public enum ContainerStyle {
		RECTANGULAR, CIRCULAR, BUBBLE;
	}
	
	public Cool303Theme() {
	}
	
	public void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}
	
	public void setSecondaryColor(Color secondaryColor) {
		this.secondaryColor = secondaryColor;
	}

	public Color getPrimaryColor() {
		return this.primaryColor;
	}
	
	public Color getSecondaryColor() {
		return this.secondaryColor;
	}
}
