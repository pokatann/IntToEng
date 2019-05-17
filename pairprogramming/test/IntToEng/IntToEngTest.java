package IntToEng;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class IntToEngTest {

	@Test
	public void ゼロから10まで変換するメソッド() {
		String expected ="ten";
		String actual=IntToEng.translateEng(10);
		assertThat(actual,is(expected));
	}

}
