package com.wecare.utility;

import java.io.Serializable;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class BookingIdGenerator implements IdentifierGenerator {
	private static int counter = 2;
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		int id = counter++;
		return id+"";
	}
}
