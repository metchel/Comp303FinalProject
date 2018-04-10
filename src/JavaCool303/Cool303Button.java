package JavaCool303;

import java.awt.Color;

import javax.swing.JButton;

/**
 * A wrapper class for JButtons.
 * A Cool303Button is a type of Cool303Component.
 * The button will be decorated according to the Cool303Theme of its encapsulating Cool303Container.
 */
public class Cool303Button extends Cool303Component {
	
	private String label;
	private JButton button;

	/**
	 * Constructor wraps a JButton with this class.
	 * The default theme is set to the parent component's theme.
	 */
	public Cool303Button(String label) {
		this.label = label;
		initializeComponent(label);
	}
	
	protected void initializeComponent(String label) {
		this.button = new JButton(label);
		super.setComponent(button);
	}
	
	public void paintComponent() {
		this.getComponent().setBackground(this.getTheme().getSecondaryColor());
	}
}
