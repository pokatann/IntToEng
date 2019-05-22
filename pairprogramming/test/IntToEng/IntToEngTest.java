package IntToEng;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class IntToEngTest {

	@Test
	public void 桁数1を変換する() {
		String expected ="zero";
		String actual=IntToEng.translateEng(0);
		assertThat(actual,is(expected));
	}
	@Test
	public void 桁数2数19までのテスト() {
		String expected ="eleven";
		String actual=IntToEng.translateEng(11);
		assertThat(actual,is(expected));
	}
	@Test
	public void 桁数2で10の倍数のテスト() {
		String expected ="twenty";
		String actual=IntToEng.translateEng(20);
		assertThat(actual,is(expected));
	}
	@Test
	public void 桁数2数21以降のテスト() {
		String expected ="thirty one";
		String actual=IntToEng.translateEng(31);
		assertThat(actual,is(expected));
	}
	@Test
	public void 桁数3で100の倍数のテスト() {
		String expected ="one hundred";
		String actual=IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}
	@Test
	public void 桁数3数101以降のテスト() {
		String expected ="eight hundred two";
		String actual=IntToEng.translateEng(802);
		assertThat(actual,is(expected));
	}	
	@Test
	public void 桁数4数1000の倍数以外のテスト() {
		String expected ="one thousand one hundred two";
		String actual=IntToEng.translateEng(1102);
		assertThat(actual,is(expected));
	}	

}
