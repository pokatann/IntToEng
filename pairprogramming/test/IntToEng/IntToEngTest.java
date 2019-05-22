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
	public void 数19のテスト() {
		String expected ="eleven";
		String actual=IntToEng.translateEng(11);
		assertThat(actual,is(expected));
	}
	@Test
	public void 桁数2かつ10の倍数のテスト() {
		String expected ="twenty";
		String actual=IntToEng.translateEng(20);
		assertThat(actual,is(expected));
	}
	@Test
	public void 桁数2かつ10の倍数でないテスト() {
		String expected ="thirty one";
		String actual=IntToEng.translateEng(31);
		assertThat(actual,is(expected));
	}
	@Test
	public void 桁数3のテスト() {
		String expected ="one hundred";
		String actual=IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}	

}
