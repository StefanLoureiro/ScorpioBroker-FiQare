package eu.neclab.ngsildbroker.commons.datatypes;

import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * @author hebgen
 * @version 1.0
 * @created 11-Jun-2018 11:13:22
 */
public class Delete extends BaseEntityModificationOperation {

	

	public Delete(Map<String, String> customFlags, List<BaseProperty> data, URI id, LDContext ldContext) {
		super(customFlags, data, id, ldContext);

	}
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

}