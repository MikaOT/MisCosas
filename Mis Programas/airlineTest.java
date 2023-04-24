package classGroup;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class airlineTest {

	@Test
	void testGetId() {
		Airline A1 = new Airline(400, "name", "country", true);
		Assert.assertTrue(A1.getId() == 400);
	}
	

}
