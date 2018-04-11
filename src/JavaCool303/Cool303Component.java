package JavaCool303;

import javax.swing.JComponent;
import javax.swing.JPanel;
public abstract class Cool303Component extends JComponent implements Themeable{
	
	protected Cool303Theme theme;
	
	protected JComponent component;
	
	/**
	 * Default constructor necessary for abstract class.
	 */
	public Cool303Component() {
		
	}
	
	public abstract void paintComponent();
	abstract void initializeComponent();
	
	/**
	 * Constructor assigns a theme for this component.
	 * @param theme a Cool303Theme object that holds styling information.
	 */
	public Cool303Component(Cool303Theme theme) {	
		this.theme = theme;
	}
	
	/**
	 * Child classes will use this method for wrapping of appropriate JComponents.
	 * @param component underlying JComponent to be wrapped.
	 */
	public void setComponent(JComponent component) {
		this.component = component;
	}
	
	/**
	 * Implements method from Themeable contract.
	 */
	public void addTheme(Cool303Theme theme) {
		this.theme = theme;
	}
	
	/**
	 * Implements method from Themeable contract.
	 */
	public void removeTheme(Cool303Theme theme) {
		if (this.theme.equals(theme)) {
			this.theme = null;
		}
	}
	
	/**
	 * Implements method from Themeable contract.
	 */
	public Cool303Theme getTheme() {
		return this.theme;
	}
	
	/**
	 * Implements method from Themeable contract.
	 * Paints the wrapped JComponent with graphics specific to the theme.
	 */
	public void paint() {
		this.component.repaint();
	}
	
	/**
	 * @return  the underlying JComponent.
	 */
	public JComponent getComponent() {
		return this.component;
	}
}
