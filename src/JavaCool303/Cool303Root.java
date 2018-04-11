package JavaCool303;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.ArrayList;

public class Cool303Root extends JFrame implements Themeable{
	
	private ArrayList<Cool303Component> components;
	private Cool303Theme theme;

	/**
	 * Constructor method:
	 * Initializes the empty list of components.
	 * The root holds Cool303Components.
	 * The root's theme is applied to all components it holds.
	 */
	public Cool303Root(){		
		this.components = new ArrayList<Cool303Component>();
	}
	
	/**
	 * @param component a Cool303Component to be added to this root.
	 * Add the component into the underlying JFrame.
	 */
	public void addCool303Component (Cool303Component component) {
		this.components.add(component);
		this.add(component.getComponent());
	}
	
	/**
	 * Paints all components held within this root frame.
	 * Applies the theme to all components of this root.
	 */
	public void paint() {
		super.setLayout(new GridLayout());
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
		return this.theme;
	}

	@Override
	public void paintComponent() {
		paint();
		
	}
}
