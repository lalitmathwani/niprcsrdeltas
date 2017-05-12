package org.csr.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class AbstractDomainObject {

	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}

		return requiredEqualsCheck(obj).isEquals();
	}

	public int hashCode() {
		return requiredHashCode().toHashCode();
	}

	protected abstract EqualsBuilder requiredEqualsCheck(Object obj);

	protected abstract HashCodeBuilder requiredHashCode();

}
