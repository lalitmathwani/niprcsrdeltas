package org.csr.domain;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * <!ELEMENT RIRS_Action (Reason_For_Action?)>
 * 
 * <!ATTLIST RIRS_Action State_Code CDATA #REQUIRED
 * 
 * Date_Of_Action CDATA #IMPLIED
 * 
 * Effective_Date CDATA #IMPLIED
 * 
 * Penalty CDATA #IMPLIED>
 * 
 * <!ELEMENT Reason_For_Action (#PCDATA)>
 * 
 * @author lalit
 *
 */

public class RIRSAction extends AbstractDomainObject {

	private String rirsActionStateCode;
	private String dateOfAction;
	private String effectiveDate;
	private String penalty;
	private List<String> reasonForAction;

	public String getRirsActionStateCode() {
		return rirsActionStateCode;
	}

	public void setRirsActionStateCode(String rirsActionStateCode) {
		this.rirsActionStateCode = rirsActionStateCode;
	}

	public String getDateOfAction() {
		return dateOfAction;
	}

	public void setDateOfAction(String dateOfAction) {
		this.dateOfAction = dateOfAction;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPenalty() {
		return penalty;
	}

	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}

	public List<String> getReasonForAction() {
		return reasonForAction;
	}

	public void setReasonForAction(List<String> reasonForAction) {
		this.reasonForAction = reasonForAction;
	}

	@Override
	protected EqualsBuilder requiredEqualsCheck(Object obj) {

		RIRSAction rirsAction = (RIRSAction) obj;
		return new EqualsBuilder().append(getRirsActionStateCode(), rirsAction.getRirsActionStateCode())
				.append(getDateOfAction(), rirsAction.getDateOfAction())
				.append(getEffectiveDate(), rirsAction.getEffectiveDate()).append(getPenalty(), rirsAction.getPenalty())
				.append(getReasonForAction(), rirsAction.getReasonForAction());
	}

	@Override
	protected HashCodeBuilder requiredHashCode() {

		return new HashCodeBuilder().append(getRirsActionStateCode()).append(getDateOfAction())
				.append(getEffectiveDate()).append(getPenalty()).append(getReasonForAction());
	}

}
