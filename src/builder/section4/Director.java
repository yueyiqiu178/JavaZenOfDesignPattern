package builder.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Director {
	private Builder builder = new ConcreteProduct();

	// ������ͬ�Ĳ�Ʒ
	public Product getAProduct() {
		builder.setPart(9);
		/*
		 * ���ò�ͬ�������������ͬ�Ĳ�Ʒ
		 */
		return builder.buildProduct();
	}

	// ������ͬ�Ĳ�Ʒ
	public Product getBProduct() {
		builder.setPart(1);
		/*
		 * ���ò�ͬ�������������ͬ�Ĳ�Ʒ
		 */
		return builder.buildProduct();
	}
}
