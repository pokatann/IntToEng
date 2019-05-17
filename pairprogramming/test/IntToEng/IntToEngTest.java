package IntToEng;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class IntToEngTest {

	@Test
	public void ゼロから10まで変換するメソッド() {
		fail("Not yet implemented");
	IntToEng i=new IntToEng();
	String expected ="ten";
	String actual=i.translateEng(10);
	assertThat(actual,is(expected));
	}

}
