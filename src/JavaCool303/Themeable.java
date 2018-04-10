package JavaCool303;

/**
 * Interface class implemented by Cool303Component subclasses.
 * This is a contract to ensure that each component ensures theme functionality.
 */
public interface Themeable {
	public void addTheme(Cool303Theme theme);
	public void removeTheme(Cool303Theme theme);
	public Cool303Theme getTheme();
	public void paint();
	void paintComponent();
}
