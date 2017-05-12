package org.csr.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * <!ELEMENT CSR_Report_Header EMPTY> <!ATTLIST CSR_Report_Header Report_Type
 * CDATA #FIXED "Company Specialized Report" Title CDATA #REQUIRED
 * TimeStamp_Created CDATA #REQUIRED>
 * 
 * @author lalit
 *
 */
public class CSRReportHeader extends AbstractDomainObject {

	private String reportType;
	private String title;
	private String timeStampCreated;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimeStampCreated() {
		return timeStampCreated;
	}

	public void setTimeStampCreated(String timeStampCreated) {
		this.timeStampCreated = timeStampCreated;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	@Override
	protected EqualsBuilder requiredEqualsCheck(Object obj) {

		CSRReportHeader csrReportHeader = (CSRReportHeader) obj;
		return new EqualsBuilder().append(getTitle(), csrReportHeader.getTitle()).append(getTimeStampCreated(),
				csrReportHeader.getTimeStampCreated());

	}

	@Override
	protected HashCodeBuilder requiredHashCode() {

		return new HashCodeBuilder().append(getTitle()).append(getTimeStampCreated());
	}

}
