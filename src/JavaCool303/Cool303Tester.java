package JavaCool303;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class Cool303Tester {

	public static void main (String [] a) {
		Cool303Root root = new Cool303Root();
		
		Cool303Theme theme = new Cool303Theme();
		theme.setPrimaryColor(Color.YELLOW);
		theme.setSecondaryColor(Color.BLUE);
		
		Cool303Container cont = new Cool303Container();
		
		cont.addTheme(theme);
		
		Cool303Button b0 = new Cool303Button("0");
		Cool303Button b1 = new Cool303Button("1");
		Cool303Button b2 = new Cool303Button("2");
		Cool303Button b3 = new Cool303Button("3");
		
		b0.getComponent().setOpaque(true);
		b1.getComponent().setOpaque(true);
		
		
		cont.addCool303Component(b0);
		cont.addCool303Component(b1);
		cont.addCool303Component(b2);
		cont.addCool303Component(b3);
		
		
		root.addCool303Component(cont);

		root.paint();
	}
}
