package JavaCool303;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * A wrapper class for JButtons.
 * A Cool303Button is a subclass of Cool303Component.
 * The button will be decorated according to the Cool303Theme of its encapsulating Cool303Container.
 */
public class Cool303Button extends Cool303Component {
	
	private String label;
	private JButton button;

	/**
	 * Constructor wraps a JButton with a Cool303Button object.
	 * The button's theme is inherited from the parent component's theme.
	 */
	public Cool303Button(String label) {
		this.label = label;
		initializeComponent();
	}
	
	/**
	 * Implements abstract method.
	 * Wraps the JButton.
	 */
	void initializeComponent() {
		this.button = new JButton(this.label);
		this.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressed();
			}
		});
		super.setComponent(this.button);
	}
	
	private void buttonPressed() {
		System.out.println(this.label);
	}
	
	/**
	 * Implements abstract method.
	 * Implements method for Themeable interface.
	 * Button is painted according to the theme.
	 */
	public void paintComponent() {
		this.getComponent().setOpaque(true);
		this.getComponent().setBackground(this.getTheme().getSecondaryColor());
	}
}
