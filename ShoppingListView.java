package exercises;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ShoppingListView extends JPanel {
	private static final long serialVersionUID = 1L;

	private ItemList model;

	private JList<String> itemsFrom;
	private JList<String> itemsTo;
	private JButton buttonToRight, buttonToLeft;
	private JScrollPane scrollPaneInitemsFrom;
	private JScrollPane scrollPaneInitemsTo;

	public ShoppingListView(ItemList model) {
		this.model = model;
		setLayout(null);

		buttonToRight = new JButton(">");
		buttonToRight.setLocation(120, 30);
		buttonToRight.setSize(50, 20);
		add(buttonToRight);

		buttonToLeft = new JButton("<");
		buttonToLeft.setLocation(120, 70);
		buttonToLeft.setSize(50, 20);
		add(buttonToLeft);

		itemsFrom = new JList<String>();
		itemsFrom.setListData(model.getItemsFrom());
		scrollPaneInitemsFrom = new JScrollPane(itemsFrom, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneInitemsFrom.setLocation(10, 10);
		scrollPaneInitemsFrom.setSize(100, 150);
		add(scrollPaneInitemsFrom);

		itemsTo = new JList<String>();
		scrollPaneInitemsTo = new JScrollPane(itemsTo, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneInitemsTo.setLocation(180, 10);
		scrollPaneInitemsTo.setSize(100, 150);
		add(scrollPaneInitemsTo);

		setSize(280, 200);
	}

	public JList<String> getItemsFrom() {
		return itemsFrom;
	}

	public JList<String> getItemsTo() {
		return itemsTo;
	}

	public JButton getbuttonToRight() {
		return buttonToRight;
	}

	public JButton getbuttonToLeft() {
		return buttonToLeft;
	}

	public void update() {
		String[] exactItemsFrom = new String[model.getSizeOfItemsFrom()];
		String[] exactItemsTo = new String[model.getSizeOfItemsTo()];

		for (int i = 0; i < model.getSizeOfItemsFrom(); i++) {
			exactItemsFrom[i] = model.getItemsFrom()[i];
		}

		for (int i = 0; i < model.getSizeOfItemsTo(); i++) {
			exactItemsTo[i] = model.getItemsTo()[i];
		}

		itemsFrom.setListData(exactItemsFrom);
		itemsTo.setListData(exactItemsTo);
	}
}
