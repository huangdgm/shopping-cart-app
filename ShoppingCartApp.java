package exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ShoppingCartApp extends JFrame {
	private static final long serialVersionUID = 1L;

	private ItemList model;
	private ShoppingListView view;

	public ShoppingCartApp(String title) {
		super(title);

		model = new ItemList();
		view = new ShoppingListView(model);

		view.getbuttonToRight().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				handleButtonToRightPress();
			}
		});

		view.getbuttonToLeft().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleButtonToLeftPress();
			}
		});

		setSize(300, 200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(view);
	}

	private void handleButtonToRightPress() {
		int selectedIndex = view.getItemsFrom().getSelectedIndex();
		String selectedValue = view.getItemsFrom().getSelectedValue();
		
		model.removeItemsFrom(selectedIndex);
		model.addItemsTo(selectedValue);
		
		view.update();
	}

	private void handleButtonToLeftPress() {
		int selectedIndex = view.getItemsTo().getSelectedIndex();
		String selectedValue = view.getItemsTo().getSelectedValue();
		
		model.removeItemsTo(selectedIndex);
		model.addItemsFrom(selectedValue);
		
		view.update();
	}

	public static void main(String[] args) {
		ShoppingCartApp app = new ShoppingCartApp("Shopping Cart");

		app.setVisible(true);
	}
}
