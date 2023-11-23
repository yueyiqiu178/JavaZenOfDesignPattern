package ocp.section3;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * NovelBook�Ĳ�����
 */
public class NovelBookTest{
	private String name = "ƽ��������";
	private int price = 6000;
	private String author = "·ң";
	
	private IBook novelBook = new NovelBook(name,price,author);

	//����getPrice����
	@Test
	public void testGetPrice() {
		//ԭ�����ۣ��ж�����������ֵ�Ƿ���Ƚ��ж���
		assertEquals(this.price, this.novelBook.getPrice());
	}

}
