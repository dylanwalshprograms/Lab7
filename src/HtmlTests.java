import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HtmlTests {

	@Test
	public void testMissingArrows() {
		String html = "<p> p>";
				
		Assertions.assertFalse(Lab7Regex.validateHtmlElements(html));
		
	}
	
	@Test
	public void testContainsBackslash() {
		String html = "<p> </p>";
				
		Assertions.assertTrue(Lab7Regex.validateHtmlElements(html));
		
	}
	
	@Test
	public void testContainsClose() {
		String html = "<p>";
		
		Assertions.assertFalse(Lab7Regex.validateHtmlElements(html));
	}
}
