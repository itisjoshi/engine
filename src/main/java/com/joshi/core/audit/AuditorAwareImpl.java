package com.joshi.core.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

	@Override
	public String getCurrentAuditor() {
		// TODO Auto-generated method stub
		return "SYSTEM";
	}

}
