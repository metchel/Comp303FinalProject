package JavaCool303;

import java.util.ArrayList;

import javax.swing.JPanel;

public class Cool303Container extends Cool303Component implements Themeable{
	
	/**
	 * 
	 */
	private ArrayList<Cool303Component> components;
	private JPanel panel;

	public Cool303Container(){
		this.panel = new JPanel();
		super.setComponent(panel);
		this.components = new ArrayList<Cool303Component>();
	}
	
	public void addCool303Component (Cool303Component component) {
		component.addTheme(theme);
		this.components.add(component);
		this.panel.add(component.getComponent());
		
	}
	
	public void paintComponent() {
		this.component.setBackground(this.theme.getPrimaryColor());
		for (Cool303Component component: this.components) {
			component.paintComponent();
		}
	}
}
