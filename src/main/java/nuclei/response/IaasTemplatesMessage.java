/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nuclei.response;

/**
 *
 * @author Karthikeyan
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Map;

@XmlRootElement(name = "IaaSTemplate")
public class IaasTemplatesMessage {
	@XmlElement(name = "status")
	public ResponseStatus status;

	private Iterable<Map<String, Object>> entities;

	public IaasTemplatesMessage() {
		super();
	}

	public IaasTemplatesMessage(ResponseStatus status,
			Iterable<Map<String, Object>> entities) {
		super();
		this.status = status;
		this.entities = entities;
	}

	@XmlElement(name = "IaaSTemplate")
	public Iterable<Map<String, Object>> getIaaSTemplate() {
		return entities;
	}

}
