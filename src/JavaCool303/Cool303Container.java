package JavaCool303;

import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 * A container class that holds Cool303Components.
 * A theme is applied to all components held within a container.
 * Implements a composite design pattern with inner components using the Themeable interface.
 */
public class Cool303Container extends Cool303Component implements Themeable{

	private JPanel panel;
	
	private ArrayList<Cool303Component> components;
	
	/**
	 * Constructor method:
	 * set the component to be a new JPanel object.
	 * initialize the list of components held within this container.
	 */
	public Cool303Container(){
		initializeComponent();
		this.components = new ArrayList<Cool303Component>();
	}
	
	/**
	 * Implements abstract method.
	 * Set the component attribute of this class to a JPanel object.
	 */
	void initializeComponent() {
		this.panel = new JPanel();
		super.setComponent(panel);
	}
	
	public void addCool303Component (Cool303Component component) {
		component.addTheme(getTheme());
		this.components.add(component);
		this.panel.add(component.getComponent());
		
	}
	
	/**
	 * Implements abstract method.
	 * Paint the background of this container.
	 * Paint all subcomponents held within this container.
	 */
	public void paintComponent() {
		this.getComponent().setBackground(this.getTheme().getPrimaryColor());
		for (Cool303Component component: this.components) {
			component.paintComponent();
		}
	}
}
