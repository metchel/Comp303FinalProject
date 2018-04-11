package JavaCool303;

/**
 * Interface implemented by Cool303Component subclasses and Cool303Root.
 * This is a contract to ensure that each component ensures theme functionality.
 */
interface Themeable {
	
	/**
	 * @param theme a Cool303Theme object that holds styling information.
	 * A Cool303Theme object can be added to any Themeable class.
	 */
	void addTheme(Cool303Theme theme);
	
	/**
	 * @param theme a Cool303Theme object that holds styling information.
	 * A Cool303Theme object can be removed from any Themeable class.
	 */
	void removeTheme(Cool303Theme theme);
	
	/**
	 * @return the Cool303Theme private attribute of this Themeable class.
	 * Each Themeable class may hold 0 or 1 Cool303Theme private attribute.
	 */
	Cool303Theme getTheme();
	
	/**
	 * Each Themeable class can have its component and child components pained.
	 * Components will be painted in correspondence to a given Cool303Theme.
	 */
	void paintComponent();
}
