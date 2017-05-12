package org.csr.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * <!ELEMENT CSR_Report (CSR_Report_Header, CSR_Report_Body)>
 * 
 * 
 * @author lalit
 *
 */

public class CSRReport extends AbstractDomainObject {

	private CSRReportHeader csrReportHeader;
	private CSRReportBody csrReportBody;

	public CSRReportHeader getCsrReportHeader() {
		return csrReportHeader;
	}

	public void setCsrReportHeader(CSRReportHeader csrReportHeader) {
		this.csrReportHeader = csrReportHeader;
	}

	public CSRReportBody getCsrReportBody() {
		return csrReportBody;
	}

	public void setCsrReportBody(CSRReportBody csrReportBody) {
		this.csrReportBody = csrReportBody;
	}

	@Override
	protected EqualsBuilder requiredEqualsCheck(Object obj) {

		CSRReport csrReport = (CSRReport) obj;
		return new EqualsBuilder().append(getCsrReportHeader(), csrReport.getCsrReportHeader())
				.append(getCsrReportBody(), csrReport.getCsrReportBody());

	}

	@Override
	protected HashCodeBuilder requiredHashCode() {

		return new HashCodeBuilder().append(getCsrReportHeader()).append(getCsrReportBody());
	}

}
