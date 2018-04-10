package JavaCool303;

import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Cool303Root extends JFrame implements Themeable{
	
	private ArrayList<Cool303Component> components;
	private Cool303Theme theme;

	public Cool303Root(){		
		this.components = new ArrayList<Cool303Component>();
	}
	
	public void addCool303Component (Cool303Component component) {
		this.components.add(component);
		super.add(component.getComponent());
	}
	
	public void paint() {
		super.setLayout(new FlowLayout());
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.pack();
		super.setVisible(true);
		
		for (Cool303Component component: this.components) {
			component.paintComponent();
		}
	}
	
	@Override
	public void addTheme(Cool303Theme theme) {
		this.theme = theme;		
		
		for (Cool303Component component: this.components) {
			component.addTheme(theme);
		}
	}

	@Override
	public void removeTheme(Cool303Theme theme) {
		if (this.theme.equals(theme)) {
			this.theme = null;
		}
	}
	
	@Override
	public Cool303Theme getTheme() {
		return null;
	}

	@Override
	public void paintComponent() {
		// TODO Auto-generated method stub
		
	}
}
