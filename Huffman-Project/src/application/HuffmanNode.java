package application;

public class HuffmanNode implements Comparable<HuffmanNode> {

	static ByteNode treeCode = new ByteNode();
	private HuffmanNode parent;
	private char ch;
	private int asciiValue, frequency, length;
	private String huffmanString;
	private HuffmanNode right, left;
	private boolean isImportant = false;

	public HuffmanNode(char ch, int frequency, int asciiValue) {
		this.ch = ch;
		this.frequency = frequency;
		this.asciiValue = asciiValue;
	}

	public HuffmanNode(int asciiValue) {
		this.asciiValue = asciiValue;
		this.ch = (char) asciiValue;
	}

	public HuffmanNode() {

	}

	public boolean isImportant() {

		return isImportant;

	}

	public HuffmanNode shareParent(HuffmanNode b) {

		int joinedFrq = this.frequency + b.frequency;
		HuffmanNode root = new HuffmanNode();
		root.setFrequency(joinedFrq);
		return root;

	}

	public boolean isLeaf() {
		if (this.right == null && this.left == null)
			return true;
		else
			return false;

	}

	public int getAsciiValue() {
		return asciiValue;
	}

	public void setAsciiValue(int asciiValue) {
		this.asciiValue = asciiValue;
		this.ch = (char) asciiValue;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public HuffmanNode getRight() {
		return right;
	}

	public void setRight(HuffmanNode right) {
		this.right = right;
	}

	public HuffmanNode getLeft() {
		return left;
	}

	public void setLeft(HuffmanNode left) {
		this.left = left;
	}

	public String getHuffmanString() {
		return huffmanString;
	}

	public void setHuffmanString(String huffmanString) {
		this.huffmanString = huffmanString;
		setLength(huffmanString.length());
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setImportant(boolean isImportant) {
		this.isImportant = isImportant;
	}

	public HuffmanNode getParent() {
		return parent;
	}

	public void setParent(HuffmanNode parent) {
		this.parent = parent;
	}

	@Override
	public int compareTo(HuffmanNode node) {
		if (this.frequency < node.frequency)
			return -1;

		else if (this.frequency > node.frequency)
			return 1;

		else
			return 0;

	}

	@Override
	public String toString() {
		return "[asssci " + asciiValue + " ] right and left is null? " + (this.getRight() == null)
				+ (this.getLeft() == null);
	}

}
