package org.csr.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * 
 * <!ELEMENT LOA EMPTY>
 * 
 * <!ATTLIST LOA LOA_Name CDATA #REQUIRED
 * 
 * LOA_Status CDATA #IMPLIED
 * 
 * LOA_Issue_Date CDATA #IMPLIED>
 * 
 * @author lalit
 *
 */
public class LOA extends AbstractDomainObject {

	private String loaName;
	private String loaStatus;
	private String loaIssueDate;

	public String getLoaName() {
		return loaName;
	}

	public void setLoaName(String loaName) {
		this.loaName = loaName;
	}

	public String getLoaStatus() {
		return loaStatus;
	}

	public void setLoaStatus(String loaStatus) {
		this.loaStatus = loaStatus;
	}

	public String getLoaIssueDate() {
		return loaIssueDate;
	}

	public void setLoaIssueDate(String loaIssueDate) {
		this.loaIssueDate = loaIssueDate;
	}

	@Override
	protected EqualsBuilder requiredEqualsCheck(Object obj) {

		LOA loa = (LOA) obj;
		return new EqualsBuilder().append(getLoaName(), loa.getLoaName()).append(getLoaStatus(), loa.getLoaStatus())
				.append(getLoaIssueDate(), loa.getLoaIssueDate());
	}

	@Override
	protected HashCodeBuilder requiredHashCode() {

		return new HashCodeBuilder().append(getLoaName()).append(getLoaStatus()).append(getLoaIssueDate());
	}

}
