package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import snakecamel.SnakeCamelUtil;
import org.junit.Test;


public class SnakecameTest {

	@Test
	public void snakecaseからcamelcaseへ変換(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = scu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelcaseからsnakecaseへ変換() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = scu.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
}
