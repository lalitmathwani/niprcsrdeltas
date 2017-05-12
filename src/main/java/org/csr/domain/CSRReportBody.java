package org.csr.domain;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * <!ELEMENT CSR_Report_Body (CSR_Producer*)>
 * 
 * @author lalit
 *
 */
public class CSRReportBody extends AbstractDomainObject {

	private List<CSRProducer> csrProducers;

	public List<CSRProducer> getCsrProducers() {
		return csrProducers;
	}

	public void setCsrProducers(List<CSRProducer> csrProducers) {
		this.csrProducers = csrProducers;
	}

	@Override
	protected EqualsBuilder requiredEqualsCheck(Object obj) {

		CSRReportBody csrReportBody = (CSRReportBody) obj;
		return new EqualsBuilder().append(getCsrProducers(), csrReportBody.getCsrProducers());
	}

	@Override
	protected HashCodeBuilder requiredHashCode() {
		return new HashCodeBuilder().append(getCsrProducers());
	}

}
