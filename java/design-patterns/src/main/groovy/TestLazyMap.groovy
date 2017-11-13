import static org.junit.Assert.*;

import groovy.json.JsonSlurper
import groovy.json.internal.LazyMap

import org.junit.Test;

class TestLazyMap {

	@Test
	void testName() {
		def file = new File('staticData')
		LazyMap map = new JsonSlurper().parse(file)
		List<Package> packages = map.payload.shop.packages.'5'
		println packages
	}
}
