package ocp.section3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OffNovelBookTest{
	
	private IBook below40NovelBook = new OffNovelBook("ƽ��������",3000,"·ң");
	private IBook above40NovelBook = new OffNovelBook("ƽ��������",6000,"·ң");
	
	//���Ե���40Ԫ�������Ƿ��Ǵ�8��
	@Test
	public void testGetPriceBelow40() {
		assertEquals(2400, this.below40NovelBook.getPrice());
	}
	
	//���Դ���40���鼮�Ƿ��Ǵ�9��
	@Test
	public void testGetPriceAbove40(){
		assertEquals(5400, this.above40NovelBook.getPrice());
	}

}
