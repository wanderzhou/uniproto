package sunsetup;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollectionsToolsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDefaultNames() {
		String[] expecteds = {"Glate", "Blast", "Zoomove"};
		List<String> result = CollectionsTools.getDefaultNames();
		Assert.assertArrayEquals(expecteds, result.toArray());
	}

}
