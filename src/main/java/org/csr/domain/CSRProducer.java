package org.csr.domain;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * <!ELEMENT CSR_Producer (License*, RIRS_Action*)> <!ATTLIST CSR_Producer
 * NIPR_Number CDATA #REQUIRED Entity_Id CDATA #REQUIRED Secondary_ID CDATA
 * #IMPLIED>
 * 
 * @author lalit
 *
 */
public class CSRProducer extends AbstractDomainObject {

	private String niprNumber;
	private String entityId;
	private String secondaryId;
	private List<License> licenses;
	private List<RIRSAction> rirsActions;

	public String getNiprNumber() {
		return niprNumber;
	}

	public void setNiprNumber(String niprNumber) {
		this.niprNumber = niprNumber;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getSecondaryId() {
		return secondaryId;
	}

	public void setSecondaryId(String secondaryId) {
		this.secondaryId = secondaryId;
	}

	public List<License> getLicenses() {
		return licenses;
	}

	public void setLicenses(List<License> licenses) {
		this.licenses = licenses;
	}

	public List<RIRSAction> getRirsActions() {
		return rirsActions;
	}

	public void setRirsActions(List<RIRSAction> rirsActions) {
		this.rirsActions = rirsActions;
	}

	@Override
	protected EqualsBuilder requiredEqualsCheck(Object obj) {

		CSRProducer csrProducer = (CSRProducer) obj;
		return new EqualsBuilder().append(getNiprNumber(), csrProducer.getNiprNumber())
				.append(getEntityId(), csrProducer.getEntityId()).append(getSecondaryId(), csrProducer.getSecondaryId())
				.append(getLicenses(), csrProducer.getLicenses())
				.append(getRirsActions(), csrProducer.getRirsActions());
	}

	@Override
	protected HashCodeBuilder requiredHashCode() {

		return new HashCodeBuilder().append(getNiprNumber()).append(getEntityId()).append(getSecondaryId())
				.append(getLicenses()).append(getRirsActions());

	}

}
