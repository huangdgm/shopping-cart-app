package exercises;

public class ItemList {
	// private static final int MAXIMUM_SIZE = 10;
	private String[] itemsFrom;
	private String[] itemsTo;

	private int sizeOfItemsFrom;
	private int sizeOfItemsTo;

	public ItemList() {
		itemsFrom = new String[] { "Book", "Music", "Clothes", "Coffee", "Food" };
		itemsTo = new String[itemsFrom.length];

		sizeOfItemsFrom = itemsFrom.length;
		sizeOfItemsTo = 0;
	}

	public String[] getItemsFrom() {
		return itemsFrom;
	}

	public String[] getItemsTo() {
		return itemsTo;
	}

	public int getSizeOfItemsFrom() {
		return sizeOfItemsFrom;
	}

	public int getSizeOfItemsTo() {
		return sizeOfItemsTo;
	}

	public void removeItemsFrom(int index) {
		if (index >= 0 && index < sizeOfItemsFrom) {
			for (int i = index; i < sizeOfItemsFrom - 1; i++) {
				itemsFrom[i] = itemsFrom[i + 1];
			}
		}

		sizeOfItemsFrom--;
	}

	public void addItemsTo(String item) {
		if (sizeOfItemsTo < itemsTo.length) {
			itemsTo[sizeOfItemsTo++] = item;
		}
	}

	public void removeItemsTo(int index) {
		if (index >= 0 && index < sizeOfItemsTo) {
			for (int i = index; i < sizeOfItemsTo - 1; i++) {
				itemsTo[i] = itemsTo[i + 1];
			}
		}

		sizeOfItemsTo--;
	}

	public void addItemsFrom(String item) {
		if (sizeOfItemsFrom < itemsFrom.length) {
			itemsFrom[sizeOfItemsFrom++] = item;
		}
	}
}
